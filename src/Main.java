
public class Main {
    public static void main(String[] args) {
        // Notebook
        Notebook notebook = new Notebook("Lenovo", "ThinkPad X1 Carbon G11");
        System.out.println("Notebook: " + notebook);

        // Food
        Food food = new Food("Hamburger");
        System.out.println("Food: " + food);

        // Song
        Song song = new Song("Travis Scott", "the ends");
        System.out.println("Song: " + song);

        // Book
        Book book = new Book("Focul tacut", "SHILPA RAVELLA");
        System.out.println("Book: " + book);

        // Setter
        notebook.setNotebookBrand("Acer");
        notebook.setNotebookModel("Aspire A515-58M");

        food.setFoodName("Pizza");

        song.setSongTitle("Fair Trade");
        song.setSongCompositor("Drake");

        book.setBookTitle("Atomic Habits");
        book.setBookWriter("JAMES CLEAR");

        // Getter
        System.out.println("Notebook brand after modification: " + notebook.getNotebookBrand());
        System.out.println("Notebook model after modification: " + notebook.getNotebookModel());

        System.out.println("Food after modification: " + food.getFoodName());

        System.out.println("Song title after modification: " + song.getSongTitle());
        System.out.println("Song compositor after modification: " + song.getSongCompositor());

        System.out.println("Book title after modification: " + book.getBookTitle());
        System.out.println("Book writer after modification: " + book.getBookWriter());
    }
}
