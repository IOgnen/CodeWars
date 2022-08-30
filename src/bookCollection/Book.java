package bookCollection;

public class Book implements Comparable<Book> {

    private String title;
    private String category;
    private float price;

    public Book(String title, String category, float price){
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return this.title + " " + this.category + " " + this.price;
    }

    @Override
    public int compareTo(Book book) {
        int result = getTitle().compareTo(book.title);
        if(result == 0) {
            return Float.compare(getPrice(), book.getPrice());
        }
        return result;
    }

}
