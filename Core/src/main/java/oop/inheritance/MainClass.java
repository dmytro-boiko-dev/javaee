package oop.inheritance;

public class MainClass {
    public static void main(String[] args) {

        OperatingSystem os = new OperatingSystem();
        WindowsOS win = new WindowsOS();
        MacOS mac = new MacOS();
        AndroidOS android = new AndroidOS();

        os.work();
        win.work();
        mac.work();
        android.work();

    }
}
