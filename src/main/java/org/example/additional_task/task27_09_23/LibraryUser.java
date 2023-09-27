package org.example.additional_task.task27_09_23;

import java.util.*;

public class LibraryUser {
    private int userId;
    private String userName;
    private String userEmail;
    private int userPhone;
    private List<Book> userBooksBorrowed;
    private Set<Book> userBooksReserved;

    public LibraryUser(int userId, String userName, String userEmail, int userPhone) {
        Random random = new Random();
        this.userId = random.nextInt(1000);
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userBooksBorrowed = new ArrayList<>();
        this.userBooksReserved = new HashSet<>();
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public List<Book> getUserBooksBorrowed() {
        return userBooksBorrowed;
    }

    public void setUserBooksBorrowed(List<Book> userBooksBorrowed) {
        this.userBooksBorrowed = userBooksBorrowed;
    }

    public Set<Book> getUserBooksReserved() {
        return userBooksReserved;
    }

    public void setUserBooksReserved(Set<Book> userBooksReserved) {
        this.userBooksReserved = userBooksReserved;
    }
}
