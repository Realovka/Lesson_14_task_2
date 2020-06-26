import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFormater {

    public static String[] getArray (String string) {

        String[] words = string.split(" ");
        return  words;
    }

    public static int getNumberOfWords(String string){
        String[] arrayOfWords=string.split(" ");
        return arrayOfWords.length;
    }

    public static boolean searchPalindrome(String string) {
        boolean flag = false;
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            StringBuilder stringBuilderReverse = new StringBuilder(words[i]);
            String word = stringBuilder.toString();
            String wordReverse = stringBuilderReverse.reverse().toString();
            if ((word.equalsIgnoreCase(wordReverse) && (word.length() > 1))) {
                flag = true;
            }

        }
        return flag;
    }
}
