package w2d4classesex3;

public class Book {
    
    private String name;
    Author author = new Author(); //assume that each book has only one author??
    private double price;
    private int qty;
    Author authorName = new Author();
    Author authorEmail = new Author();
    Author authorGender = new Author();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public Author getAuthorEmail() {
        return authorEmail;
    }

    public Author getAuthorGender() {
        return authorGender;
    }

    public String toString(String name, double price, int qty){
        String text = "Book[" + name + ",Author[" + authorName + "," + authorEmail + "," + authorGender + "]," 
                + price + "," + qty + ".";
        return text;
    }
    
    
    
}
