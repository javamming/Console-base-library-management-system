package Day1;

public class Book {



    Book(int bookID, String title, String author, double price, int available_quantity,int total_quantity) {

        this.bookID = bookID;
        this.price = price;
        this.author = author;
        this.title = title;
        this.available_quantity = available_quantity;
        this.total_quantity=total_quantity;


    }



    private int bookID;

    private String title;

    private String author;

    private double price;

    private int available_quantity;

    private int total_quantity;

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }



    public int getBookID() {
        return bookID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotal_quantity() {
        return total_quantity;
    }

    public void setTotal_quantity(int total_quantity) {
        this.total_quantity = total_quantity;
    }

    public void displayBookInfo() {

        System.out.println(getAuthor());
        System.out.println(getPrice());
        System.out.println(getTitle());
        System.out.println(getAvailable_quantity());
        System.out.println(getBookID());
        System.out.println(getTotal_quantity());

    }

    public void updateQuantity(int quantity) {

        available_quantity=quantity;


    }


    public void updatePrice(double price) {
        this.price=price;

    }

    public boolean borrowBook(){

        if(available_quantity > 0){

            available_quantity--;

            return true;

        }


        return false;

    }

    public boolean returnBook(){

        if(available_quantity <= total_quantity){

            available_quantity++;

            return true;
        }

        return false;


    }




}
