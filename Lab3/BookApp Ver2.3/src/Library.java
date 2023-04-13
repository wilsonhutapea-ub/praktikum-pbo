import java.util.*;

public class Library {
    ArrayList<BookCategory> bookCategories = new ArrayList<BookCategory>();

    Library(String c1, String c2, String c3, String c4, String c5, String c6, String c7){
        // BookCategory nc1 = new BookCategory(c1);
        bookCategories.add(new BookCategory(c1));
        bookCategories.add(new BookCategory(c2));
        bookCategories.add(new BookCategory(c3));
        bookCategories.add(new BookCategory(c4));
        bookCategories.add(new BookCategory(c5));
        bookCategories.add(new BookCategory(c6));
        bookCategories.add(new BookCategory(c7));
    }

    void borrowBook(){

        boolean cont = true;
        while(cont){
            System.out.println("Please pick a category to choose a book from:");
            printCategoryList();
            int cat = Integer.parseInt(getUserInput());
            // System.out.print("> ");
            // int cat = sc.nextInt();
            // System.out.println(bookCategories.get(cat));
    
            System.out.printf("Your category is %s.\n", bookCategories.get(cat-1).categoryName);
            System.out.println("\nPlease pick a book from the category of your choosing:");
            for(int i = 0; i < bookCategories.get(cat-1).books.size(); i++){
                // System.out.println((i+1) + bookCategories.get(cat-1).books.get(i).bookName);
                System.out.printf("%d. %s by %s\n", i+1, bookCategories.get(cat-1).books.get(i).bookName, authorsToString(bookCategories.get(cat-1).books.get(i).getAuthors()));
            }
            int bookOfChoosing = Integer.parseInt(getUserInput());
            // System.out.print("> ");
            // int bookOfChoosing = sc.nextInt();
            System.out.println("You have successfully borrowed a book!");
            System.out.println("\nBook name: " + bookCategories.get(cat-1).books.get(bookOfChoosing-1).bookName);
            System.out.print(bookCategories.get(cat-1).books.get(bookOfChoosing-1).getAuthors().size() == 1 ? "Author: " : "Authors: ");
            System.out.println(authorsToString(bookCategories.get(cat-1).books.get(bookOfChoosing-1).getAuthors()));
            System.out.println("Synopsis: " + bookCategories.get(cat-1).books.get(bookOfChoosing-1).synopsis);
            // System.out.println(bookCategories.get(cat-1).books.get(bookOfChoosing-1).synopsis);
    
            System.out.println("\nDo you wish to borrow another book?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int buffer = Integer.parseInt(getUserInput());
            // int buffer = sc.nextInt();
            
            if(buffer == 2){
                System.out.println("Thanks for coming. Happy reading.\n");
                return;
            }
        }
    }

    void printCategoryList(){
        for(int i = 0; i < bookCategories.size(); i++){
            System.out.printf("%d. %s\n",i+1, bookCategories.get(i).categoryName);
            // System.out.println(bookCategories.get(i).categoryName);
        }
    }

    static String authorsToString(ArrayList<String> authorsArrLi){
        
        String buffer = authorsArrLi.get(0);
        if(authorsArrLi.size() == 1){
            return buffer;
        }

        int i = 1;
        while(i < authorsArrLi.size() - 1){
            buffer = buffer + ", " + authorsArrLi.get(i);
            i++;
        }

        buffer = buffer + ", and " + authorsArrLi.get(i);
        return buffer;

    }

    static String getUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        String str = sc.nextLine();
        System.out.println();
        return str;
    }
}
