package org.example.additionalTask.task23_09_27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LibraryManager {
    private List<Book> liberBook;
    private List<LibraryUser> libraryUsers;

    public LibraryManager() {
        this.liberBook = new ArrayList<>();
        this.libraryUsers = new ArrayList<>();
    }

    // Метод который возвращает список доступных книг по жанрам.
    public List<Book> listAvailableBooksByGenre(String genre) {
        List<Book> books = new ArrayList<>();
        for (Book book : liberBook) {
            if (book.getBookGenre().equals(genre) && book.isBookAvailable()) {
                books.add(book);
            }
        }
        return books;
    }

    //Метод который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.
    public Set<String> listUserEmailsWithReservedBooks() {
        Set<String> userEmails = new HashSet<>();
        for (LibraryUser user : libraryUsers) {
            Set<Book> reservBook = user.getUserBooksReserved();
            if (reservBook.isEmpty()) {
                userEmails.add(user.getUserEmail());
            }
        }
        return userEmails;
    }

    // Метод, который добавляет новую книгу в библиотеку.
    public void addBookToLibrary(Book book) {
        liberBook.add(book);
    }

    // Метод, который удаляет книгу из библиотеки.
    public void removeBookFromLibrary(Book book) {
        liberBook.remove(book);
    }

    // Метод, который позволяет пользователю взять книгу в аренду.
    public void borrowBook(LibraryUser user, Book book) {
        if (book.isBookAvailable()) {
            book.setBookAvailable(true);
            book.setBorrowed(true);
            user.getUserBooksBorrowed().add(book);
            System.out.println("Книга \"" + book.getBookTitle() + " уже взята в аренду пользователем: " + user.getUserName());
        } else {
            System.out.println("Книга не может быть доступна для аренды! " + book.getBookTitle());
        }
    }

    //  Метод, который позволяет пользователю зарезервировать книгу.
    public void reserveBook(LibraryUser user, Book book) {
        if (book.isBookAvailable()) {
            user.getUserBooksReserved().add(book);
            System.out.println("Книга: " + book.getBookTitle() + " Зарезервирована пользователем: " + user.getUserName());
        } else {
            System.out.println("Эта книга уже зарезервирована." + book.getBookTitle());
        }

    }

    public void returnBook(LibraryUser user1, Book book1) {
        if (user1.getUserBooksBorrowed().contains(book1)) {
            book1.setBookAvailable(true);
            book1.setOwner(null);
            book1.setBorrowed(true);
            user1.getUserBooksBorrowed().remove(book1); // Удаление из списка пользователя
            System.out.println("Книга \"" + book1.getBookTitle() + "\" возвращена пользователем: " + user1.getUserName());
        } else {
            System.out.println("Эта книга не была взята в аренду пользователем " + user1.getUserName());
        }
    }

}