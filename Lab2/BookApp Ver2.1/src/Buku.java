import java.util.ArrayList;
import java.util.Scanner;

public class Buku {

    int category;
    String bookName;
    String bookCategory;
    String synopsis;
    String bookAuthor;
    Buku(String name, int cat, String syn, String author){
        bookName = name;
        category = cat;
        synopsis = syn;
        bookAuthor = author;
    }

    int countSynopsisWord(){
        int buffer = 0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    buffer++;  
            }  
            return buffer;  
    }
    
}