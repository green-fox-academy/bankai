import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        String fileName = "my-file.txt";
        System.out.println(fileCopyCheck(fileName));
    }

    public static boolean fileCopyCheck (String fileName)   {
        try {
            Path sourceFilePath = Paths.get(fileName);
            Path copyFilePath = Paths.get("target.txt");
            Files.copy(sourceFilePath, copyFilePath);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
