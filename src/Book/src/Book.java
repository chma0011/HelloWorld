public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return "Title: " + title;
    }

    public String getAuthor() {
        return "Author: " + author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
