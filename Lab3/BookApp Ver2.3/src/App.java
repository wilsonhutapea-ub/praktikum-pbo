    public class App {
        public static void main(String[] args){

            // instantiate libary to make 7 categories
            Library myLibrary = new Library("Technology", "Philosophy", "History", "Religion", "Psychology", "Politics", "Fiction");

            // add book to each category
            myLibrary.bookCategories.get(0).books.add(new Book("The Singularity Is Near", "The Singularity Is Near outlines the future of technology by describing how change keeps accelerating, what computers will look like and be made of, why biology and technology will become indistinguishable and how we can't possibly predict what'll happen after 2045.", "Ray Kurzweil"));
            myLibrary.bookCategories.get(0).books.add(new Book("The Age of AI", "In The Age of AI, three leading thinkers have come together to consider how AI will change our relationships with knowledge, politics, and the societies in which we live.", "Daniel Huttenlocher"));
            myLibrary.bookCategories.get(0).books.get(1).addAuthor("Henry Kissinger");
            myLibrary.bookCategories.get(0).books.get(1).addAuthor("Eric Schmidt");
            myLibrary.bookCategories.get(0).books.add(new Book("The Innovators","The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution is an overview of the history of computer science and the Digital Revolution.","Walter Isaacson"));
            
            myLibrary.bookCategories.get(1).books.add(new Book("Letters from a Stoic", "Letters from a Stoic is a collection of 124 letters that Seneca the Younger wrote at the end of his life, during his retirement, after he had worked for the Emperor Nero for more than ten years.", "Lucius Annaeus Seneca"));
            myLibrary.bookCategories.get(1).books.add(new Book("Filosofi Teras", "Filosofi Teras digambarkan dengan analogi kejadian yang real di kehidupan sehari-hari dan penggunanan bahasa yang sesuai dengan Generasi Milenial dan Gen-Z.", "Henry Manampiring"));
                        
            myLibrary.bookCategories.get(2).books.add(new Book("Guns, Germs, and Steel", "In this Pulitzer Prize-winning book, Jared Diamond argues that geography and environmental factors played a significant role in shaping human history.", "Jared Diamond"));

            myLibrary.bookCategories.get(3).books.add(new Book("The Bible", "The Bible is a collection of sacred texts that are central to the Christian religion. It is divided into two parts, the Old Testament and the New Testament, and includes stories, teachings, and prophecies that are believed to be inspired by God.", "No author"));
            
            myLibrary.bookCategories.get(4).books.add(new Book("Thinking, Fast and Slow", "In this groundbreaking book, Daniel Kahneman explores the two systems of thinking that drive our decisions: the intuitive, fast-thinking system, and the more deliberate, slow-thinking system.", "Daniel Kahneman"));
            
            // myLibrary.bookCategories.get(5).books.add(new Book());
            
            // simulate borrowing a book
            myLibrary.borrowBook();

            
            System.out.printf("Royalty of %s is IDR %,d.\n", myLibrary.bookCategories.get(1).books.get(1).bookName, (int) myLibrary.bookCategories.get(1).books.get(1).calculateRoyalty(98000, 0.075));
        }
    }