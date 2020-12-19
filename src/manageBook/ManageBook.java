package manageBook;

import book.Book;

public class ManageBook {
    Book books[] = new Book[20];

    public Book[] getBooks() {
        return books;
    }

    public void addNewBook(Book newbook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newbook;
                System.out.println("thêm mới thành công");
                return;
            }
        }
        System.out.println("thư viện đã đầy");
    }

    public void editBookByIndex(int index,Book newBook) {
        if (index >= 0 && index < 20) {
            if (books[index] != null) {
                books[index] = newBook;
            }
        }
        else {
            System.out.println("object is not exist");
        }
    }
    public int getMaxPrice(){
        int maxPrice = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i]!=null){
            if (maxPrice<books[i].getPrice()){
                maxPrice = books[i].getPrice();
            }
            }
        }
        return maxPrice;
    }
    public int getSumPrice(){
        int sumPrice = 0;
        for (Book book: books) {
            if(book!=null){
                sumPrice += book.getTotalPrice();
            }
        }
        return sumPrice;
    }
}