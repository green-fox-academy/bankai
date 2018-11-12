//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {

        List<String> encryptText = fileToList();
        List<String> decryptText = decryption(encryptText);
        print(decryptText);

    }

    public static List<String> fileToList() {
        List<String> list = new ArrayList<>();
        try {
            Path filePath = Paths.get("reversed-lines.txt");
            list = Files.readAllLines(filePath);
            } catch (Exception e) {
            System.out.println("I could not find the file");
        }   return list;
    }
public static List decryption (List<String> encryptText)  {
    List<String> decryptText = new ArrayList<>();
    for (int i = 0; i < encryptText.size(); i++) {
        String temp = encryptText.get(i);
        String temp_2 = "";
        for (int j = 0; j < temp.length(); j++) {
            temp_2 += String.valueOf(temp.charAt(temp.length() - 1 - j));
        }
        decryptText.add(i, temp_2);
    }
    return decryptText;
    }

    public static void print (List<String> decryptText) {
        for (String st: decryptText)   {
            System.out.println(st);
        }
    }
}
