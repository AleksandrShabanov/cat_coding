package task_oop.models;

public class RegRecord {

    private User user;
    private Book book;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "RegRecord{" +
                "user=" + user +
                ", book=" + book +
                '}';
    }
}
