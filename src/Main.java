import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] str = new String[0];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"))) {
            String sentence;
            while ((sentence = bufferedReader.readLine()) != null) {
                str = TextFormater.getArray(sentence);
                try (FileWriter fileWriter = new FileWriter("result.txt", true)) {
                    for (String item : str) {
                        if (!item.endsWith("."))
                            fileWriter.write(item + " ");
                        else fileWriter.write(item + "\n");
                    }
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("result.txt"))){
            String sentence;
            while ((sentence=bufferedReader.readLine())!=null){
                if(((TextFormater.getNumberOfWords(sentence)>=3) && (TextFormater.getNumberOfWords(sentence))<=5)||
                        TextFormater.searchPalindrome(sentence)){
                    try (FileWriter fileWriter = new FileWriter("resultFinal.txt",true)){
                        fileWriter.write(sentence+"\n");
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

