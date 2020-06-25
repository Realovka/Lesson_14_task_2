public class TextFormater {

    public static int getNumberOfWords (String string){
        String [] words =string.split(" ");
        return words.length;
    }

    public static boolean searchPalindrome (String string){
        boolean flag = false;
        String[] words = string.split(" ");
        for (int i = 0; i<words.length; i++){
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            StringBuilder stringBuilderReverse = new StringBuilder(words[i]);
            String word = stringBuilder.toString();
            String wordReverse = stringBuilderReverse.reverse().toString();
            if ((word.equalsIgnoreCase(wordReverse) && (word.length()>1))){
                flag=true;
            }

        }
       return flag;
    }
}
