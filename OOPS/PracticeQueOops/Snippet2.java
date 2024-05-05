package OOPS.PracticeQueOops;


class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}
public class Snippet2 {
    public static void main(String[] args) {
        System.out.println(Book.count);
        // System.out.println(Book.count);
        Book b1 = new Book(250);
        Book b2 = new Book(400);
        System.out.println(Book.count);
    }
}

