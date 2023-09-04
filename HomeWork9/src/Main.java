import java.io.*;
import java.util.ArrayList;

import static java.nio.file.Files.delete;

public class Main {
    public static void main (String[] args){
        File dir = new File("C://Somedir");
        ArrayList<File> filesList = new ArrayList<>();
        String s;
        StringBuilder sb = new StringBuilder();

        File newFile = new File("C://Somedir/newTextFile.txt");
        if  (newFile.delete()) {
            System.out.println("Файл newTextFile.txt удален");
        }

        for (File item : dir.listFiles()){
            if (item.isFile()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(item))){
                    while ((s = reader.readLine()) != null) {
                        sb.append(s+"\n");
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        s = sb.toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C://Somedir/newTextFile.txt", true))){
            writer.write(s);
            writer.close();
            System.out.println("Файл newTextFile.txt создан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
