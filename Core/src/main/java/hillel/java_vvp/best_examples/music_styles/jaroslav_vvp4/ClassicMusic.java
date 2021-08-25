package hillel.java_vvp.best_examples.music_styles.jaroslav_vvp4;

import javax.sound.sampled.*;
import java.net.URL;

public class ClassicMusic extends MusicStyles{
    @Override
    //playing classic music sample from URL. The file placed on my home server
    public void playMusic(){
        System.out.println("\u001B[5;35mПрослушайте короткий пример классической музыки:\u001B[0m");
        SourceDataLine clipSDL = null;
        AudioInputStream ais = null;
        byte[] b = new byte[2048];
        try {
            URL url = new URL("https://yarikzv.duckdns.org/local/audio/classic.wav");
            ais = AudioSystem.getAudioInputStream(url);
            AudioFormat af = ais.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, af);
            if (AudioSystem.isLineSupported(info)) {
                clipSDL = (SourceDataLine) AudioSystem.getLine(info);
                clipSDL.open(af);
                clipSDL.start();
                int num = 0;
                while ((num = ais.read(b)) != -1)
                    clipSDL.write(b, 0, num);
                clipSDL.drain();
                ais.close();
                clipSDL.stop();
                clipSDL.close();
            } else {
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Спасибо за внимание.");
    }
}
