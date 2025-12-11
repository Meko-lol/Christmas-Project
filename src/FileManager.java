import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private String path;


    public static  String read(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, false));
        String text = "";
        String temp = "";
        while (temp != null){
            temp = IO.readln(path);
            text += temp;
        }

        return text;
    }

    public static String write(String text, String path){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, false));
            writer.write(text);
            writer.newLine();
            return text;
        } catch (IOException e) {
            return "couldnt find path";
        }
    }

    public static String writeToLog(String text){
        write(text, "Log.txt");
        return text;
    }

}
