package Anagram;

import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String sample1, String sample2) {

    if (sample1.length() != sample2.length()) {
      return false;
    } else {

      String[] sample1Array = new String[sample1.length()];
      String[] sample2Array = new String[sample1.length()];

      for (int i = 0; i < sample1.length(); i++) {
        sample1Array[i] = sample1.substring(i, i + 1);
        sample2Array[i] = sample2.substring(i, i + 1);
      }
      Arrays.sort(sample1Array);
      Arrays.sort(sample2Array);

      for (int i = 0; i < sample1Array.length; i++) {
        if (!sample1Array[i].equals(sample2Array[i])) {
          return false;
        }
      }
      return true;
    }
  }
}
