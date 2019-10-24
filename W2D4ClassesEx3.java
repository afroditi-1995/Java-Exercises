package w2d4classesex3;

public class W2D4ClassesEx3 {

    public static void main(String[] args) {
        
        Book book = new Book();
        Author George = new Author();
        book.setAuthor(George);
        book.toString("SchoolMaths", 21.0, 50);
        System.out.println(book);
        
        
        
        
        
        
    }
    
}
