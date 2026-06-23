package Day1;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Book> arr = new ArrayList<>();


        boolean flag = true;

        while (flag) {

            System.out.println("===================Library Management System=================");
            System.out.println("1.Add Book");
            System.out.println("2.View All Books");
            System.out.println("3.Search Book");
            System.out.println("4.Borrow Book");
            System.out.println("5.Return Book");
            System.out.println("6.Update Book Price");
            System.out.println("7.Delete Book");
            System.out.println("8.Exit");

            System.out.print("Choice option only number :");
            int choice = scanner.nextInt();

            if (choice == 1) {


                System.out.println("Enter Book Id :");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the price :");
                double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter the author name :");
                String author = scanner.nextLine();

                System.out.println("Enter the book title : ");
                String title = scanner.nextLine();

                System.out.println("Enter the book quantity :");
                int quantity = scanner.nextInt();

                System.out.println("Enter the total quantity of book :");
                int total_quantity = scanner.nextInt();

                Book book = new Book(id, title, author, price, quantity, total_quantity);

                arr.add(book);

                System.out.println("Book Added Successfully.");


            } else if (choice == 2) {


                for (Book i : arr) {

                    i.displayBookInfo();

                }


            } else if (choice == 3) {

                System.out.print("Search  book with Id :");

                int search = scanner.nextInt();
                scanner.nextLine();

                boolean found = false;

                for (Book b : arr) {


                    if (b.getBookID() == search) {
                        System.out.println("Book Found.");
                        b.displayBookInfo();
                        found = true;
                        break;

                    }


                }
                if (!found) {
                    System.out.println(search + " Not Found.");

                }


            } else if (choice == 4) {
                int quantity = 0;

                System.out.print("Enter the book's id that your want to borrow :");
                int borrowBookId = scanner.nextInt();


                for (Book b : arr) {

                    if (b.getBookID() == borrowBookId) {

                        if (b.borrowBook()) {

                            System.out.println("Book Borrow Successfully.");


                        } else {

                            System.out.println("Book Out Of Stock.");


                        }
                    } else {
                        System.out.println("Book ID Not Found.");

                    }


                }

            } else if (choice == 5) {

                System.out.print("Return book with id :");
                int return_book = scanner.nextInt();


                for (Book re : arr) {

                    if (re.getBookID() == return_book) {

                        if (re.returnBook()) {

                            System.out.println("Book return successfully.");
                        } else {

                            System.out.println("All Books are already return.");
                        }

                    } else {

                        System.out.println("Book ID Wrong.Try Again.");
                    }

                }


            } else if (choice == 6) {

                System.out.println("Serach Book Id For Price Update :");
                int up_book_id = scanner.nextInt();

                System.out.println("Update book price :");
                double update_p = scanner.nextDouble();

                boolean found = false;


                for (Book uprice : arr) {

                    if (uprice.getBookID() == up_book_id) {

                        System.out.println("Search Book Found For Update.");

                        uprice.setPrice(update_p);

                        System.out.println("Book Price Update Successfully.");

                        System.out.println("After Update :" + update_p);

                        found = true;


                    }


                }
                if (!found) {

                    System.out.println("Serarch ID Not Found.");

                }


            } else if (choice == 7) {

                System.out.println("Enter Book Id You Want To Delete :");
                int deleteId = scanner.nextInt();

                Iterator<Book> it = arr.iterator();

                while (it.hasNext()) {

                    Book b = it.next();

                    if (b.getBookID() == deleteId) {

                        it.remove();

                        System.out.println("Book Deleted Successfully.");


                    }

                }


            } else if (choice == 8) {

                flag = false;


            }

        }

        System.out.println("Program closed.");


    }
}
