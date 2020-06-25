import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
            try(BufferedReader bufferedReader=new BufferedReader(new FileReader("text.txt"))){
                int numberOfWords=0;
                String sentence;
                while ((sentence=bufferedReader.readLine())!=null) {
                    numberOfWords=TextFormater.getNumberOfWords(sentence);
                    if ((numberOfWords>=3 && numberOfWords<=5) || TextFormater.searchPalindrome(sentence)){
                        arrayList.add(sentence);
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }
       try (FileWriter fileWriter=new FileWriter("result.txt")){
           for(String item: arrayList){
               fileWriter.write(item+"\n");
           }
       } catch (IOException e){
           e.printStackTrace();
       }
        }
    }

