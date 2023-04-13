import java.util.ArrayList;
import java.util.Scanner;

public class Buku {

    String bookCategory;
    String bookName;
    String[] bookAuthors = new String[3];
    ArrayList<Integer> authors = new ArrayList<Integer>();
    int authorCount;
    String[] bookCategoryArr = {"Technology", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};
    String[][] technologyBooksArr = {
        {"Singularity is Near", "Ray Kurzweil"},
        {"The Age of AI", "Henry Kissinger"},
        {"The Innovators", "Walter Isaacson"},
        {"Life 3.0", "Max Tegmark"},
        {"Steve Jobs", "Walter Isaacson"}
    };
    String[][] philosophyBooksArr = {
        {"Philosophybook1", "Author1"},
        {"Philosophybook2", "Author2"},
        {"Philosophybook3", "Author3"},
        {"Philosophybook4", "Author4"},
        {"Philosophybook5", "Author5"},
    };
    String[][] historyBooksArr = {
        {"Philosophybook1", "Author1"},
        {"Philosophybook2", "Author2"},
        {"Philosophybook3", "Author3"},
        {"Philosophybook4", "Author4"},
        {"Philosophybook5", "Author5"},

    };
    String[][] religionBooksArr = {
        {"Philosophybook1", "Author1"},
        {"Philosophybook2", "Author2"},
        {"Philosophybook3", "Author3"},
        {"Philosophybook4", "Author4"},
        {"Philosophybook5", "Author5"},

    };
    String[][] psychologyBooksArr = {
        {"Philosophybook1", "Author1"},
        {"Philosophybook2", "Author2"},
        {"Philosophybook3", "Author3"},
        {"Philosophybook4", "Author4"},
        {"Philosophybook5", "Author5"},

    };
    String[][] politicsBooksArr = {
        {"Philosophybook1", "Author1"},
        {"Philosophybook2", "Author2"},
        {"Philosophybook3", "Author3"},
        {"Philosophybook4", "Author4"},
        {"Philosophybook5", "Author5"},

    };
    String[][] fictionBooksArr = {
        {"Philosophybook1", "Author1"},
        {"Philosophybook2", "Author2"},
        {"Philosophybook3", "Author3"},
        {"Philosophybook4", "Author4"},
        {"Philosophybook5", "Author5"},

    };

    // void showBuku(){
    //     System.out.println("Book name: " + bookName);
    //     if(authorCount == 1){
    //         System.out.println("Book author: " + bookAuthors);
    //     } else {
    //         System.out.println("Book authors: ");
    //         for(int i = 0; i < authorCount; i++){
    //             System.out.printf("%d. %s\n", i+1, bookAuthors[i]);
    //         }
    //     }
    // }

    void pilihBuku(){
        System.out.println("Silahkan pilih kategori:");
        System.out.println("1. Technology\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt() - 1;
        System.out.println("Selected: " + bookCategoryArr[in]);
        System.out.println("Silakan pilih buku: ");
        for(int i = 0, j = 0; i < 5; i++){
            System.out.print(i+1+". ");
            System.out.println(technologyBooksArr[i][0]);
        }
    }

    String categoryToString(int bookCategory){
        switch(bookCategory){
            case 1 : return "Teknologi";
            case 2 : return "Filsafat";
            case 3 : return "Sejarah";
            case 4 : return "Agama";
            case 5 : return "Psikologi";
            case 6 : return "Politik";
            case 7 : return "Fiksi";
            default : return "Invalid";
        }
    }
}