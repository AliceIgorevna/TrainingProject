package streamCreation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Alisa_Demennikova on 9/19/2016.
 */
public class StreamFromFile {
    private static File file;
    public static File createFile(String fileName){
        file = new File(fileName);
        file.deleteOnExit();
        try {
            PrintWriter out = new PrintWriter(file);
            out.println("qwert");
            out.println("wert");
            out.println("erty");
            out.println("rtyu");
            out.close();
        } catch (Exception e) {
            System.out.println("file was not found " + e.getMessage());
        }
        return file;
    }

    public static void main(String[] args) {
        File myFile = StreamFromFile.createFile("File");
        try {
            Stream<String> stream = Files.lines(Paths.get(myFile.getAbsolutePath()));
            System.out.println("StreamFromFile = " + stream.collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
