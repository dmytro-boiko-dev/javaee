package processes;

import java.io.IOException;

public class ExecuteExample {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            for (long i = 0; i < 3; i++) {
                process = runtime.exec("Notepad");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
