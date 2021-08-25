package hillel.java_vvp.best_examples.music_styles.jaroslav_vvp4;

public class MusicMain {
    public static void main(String[] args) throws Exception {
        //creating an array of MusicStyles members
        MusicStyles[] array = new MusicStyles[4];
        //filling array
        array[0] = new MusicStyles();
        array[1] = new PopMusic();
        array[2] = new RockMusic();
        array[3] = new ClassicMusic();

        System.out.println("Представляем Вашему вниманию небольшой обзор музыкальных стилей.");
        System.out.println("Это займет немногим больше трех минут Вашего времени...");
        System.out.println("Используйте наушники или отрегулируйте громкость компьютера.");
        //running playMusic() method for all of elements of array.
        for (MusicStyles element : array){
            System.out.println(" ☰⫶☰ ♭ ♪ ♫ ♬ ♯ ♪ ♫ ♬ ♮ ♪ ♫ ♬ ♪ ♫ ♬ ♪ ♫ ♬ ♪  ☰☰\n");
            element.playMusic();        //enjoy!
        }

    }
}
