package testApp;

import book.Book;
import manageBook.ManageBook;

import java.util.Scanner;

public class TestMain {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    static ManageBook manageBook = new ManageBook();
    public static void main(String[] args) {
        Book book1 = new Book("java", "ken", 23000, 2, 0.1);
        Book book2 = new Book("python", "james", 35000, 2, 1.2);
        Book book3 = new Book("C++", "Dan Linh", 45000, 2, 1.5);
        manageBook.addNewBook(book1);
        manageBook.addNewBook(book2);
        manageBook.addNewBook(book3);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu: Mời bạn nhập từ 1 đến 5 để trọn option ");
            System.out.println("1: Thêm sách mới");
            System.out.println("2: Chỉnh sửa thông tin sách");
            System.out.println("3: Lấy giá sách đắt nhất");
            System.out.println("4: Lấy tổng giá sách");
            System.out.println("5: Exit program");
            choice = sc.nextInt();
            switch (choice) {
                case ONE:
                    creatBook();
                    break;
                case TWO:
                    int index = 0;
                    Book newbook = new Book();
                    testIndex(sc,index);
                    manageBook.editBookByIndex(index, newbook);
                    break;
                case THREE:
                    System.out.println("Max price is: " + manageBook.getMaxPrice());
                    break;
                case FOUR:
                    System.out.println(" Sumprice is  " + manageBook.getSumPrice());
                    break;
                case FIVE:
                    System.exit(0);
                    break;
            }
        } while (choice != FIVE);
    }

    private static void testIndex(Scanner sc,int index) {
        do {
            System.out.println("Please! you enter index of array books");
            index = sc.nextInt();
        } while (index < 0 || index > 20);
    }

    public static void creatBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of book: ");
        String name = sc.nextLine();
        System.out.println("Enter author");
        String author = sc.nextLine();
        System.out.println("Enter price of book");
        int price = sc.nextInt();
        System.out.println("Enter amount of book");
        int number = sc.nextInt();
        System.out.println("Enter weight of book");
        double weight = sc.nextInt();
        Book book = new Book(name, author, price, number, weight);
        manageBook.addNewBook(book);
    }
}