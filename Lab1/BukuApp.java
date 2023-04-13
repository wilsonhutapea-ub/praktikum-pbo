public class BukuApp {
    String bookCategory;
    String bookName;
    String[] bookAuthors = new String[3];
    int authorCount;

    BukuApp(int bookCategory, String bookName, String bookAuthor1){
        this.bookName = bookName;
        this.bookAuthors[0] = bookAuthor1;
        authorCount = 1;
    }

    BukuApp(int bookCategory, String bookName, String bookAuthor1, String bookAuthor2){
        this.bookName = bookName;
        this.bookAuthors[0] = bookAuthor1; 
        this.bookAuthors[1] = bookAuthor2;
        authorCount = 2;
    }

    BukuApp(int bookCategory, String bookName, String bookAuthor1, String bookAuthor2, String bookAuthor3){
        this.bookName = bookName;
        this.bookAuthors[0] = bookAuthor1;
        this.bookAuthors[1] = bookAuthor2;
        this.bookAuthors[2] = bookAuthor3;
        authorCount = 3;
    }

    void showBuku(){
        System.out.println("Book name: " + bookName);
        if(authorCount == 1){
            System.out.println("Book author: " + bookAuthors);
        } else {
            System.out.println("Book authors: ");
            for(int i = 0; i < authorCount; i++){
                System.out.printf("%d. %s\n", i+1, bookAuthors[i]);
            }
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

    public static void main(String[] args) {
        BukuApp buku1 = new BukuApp(1, "The Singularity Is Near", "Ray Kurzweil", "Author 2x");
        buku1.showBuku();
    }

}
