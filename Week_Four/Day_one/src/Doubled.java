import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        ArrayList<String> decodeLines;
        decodeLines = encryptChars();
        for (String s: decodeLines)    {
            System.out.println(s);
        }
    }

    public static ArrayList encryptChars() {
        ArrayList<String> decodeLines = new ArrayList<>();
        try {
            Path filepath = Paths.get("duplicated-chars.txt");
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++)  {
                String temp = lines.get(i);
                String temp2 = "";
                for (int j =0; j < temp.length(); j++) {
                    if (j % 2 == 0)
                        temp2 = temp2 + String.valueOf(temp.charAt(j));
                }   decodeLines.add(i, temp2);
                }
            } catch (IOException e) {
            e.printStackTrace();
        }
        return decodeLines;
    }
}
