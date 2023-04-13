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

    int getSynopsisWordCount(){
        int buffer = 0;
            char ch[]= new char[synopsis.length()];    
            for(int i=0;i<synopsis.length();i++){  
                ch[i]= synopsis.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ){
                    buffer++;
                }
            }
        return buffer;  
    }

    public static double stringSimilarity(String s1, String s2) {
        int maxLength = Math.max(s1.length(), s2.length());
        int distance = levenshteinDistance(s1, s2);
        double similarity = 1 - ((double) distance / maxLength);
        return similarity * 100;
    }

    private static int levenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + cost));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    Buku copy(Buku b){
        return b;
    }
    
}