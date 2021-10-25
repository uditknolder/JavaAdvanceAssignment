package Advance5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file=new File("/home/knoldus/Desktop/Java/A5/text.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        int lines=0,words=0,characters=0;
        while((st=br.readLine())!=null)
        {
            characters+=st.length();
            String[] word=st.split("\\s");
            words+=word.length;
            lines++;
        }
        System.out.println("Line = "+lines+"\nWords = "+words+"\nCharacters = "+characters);
    }
}

