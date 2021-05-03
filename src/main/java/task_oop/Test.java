package task_oop;

import task_oop.models.Book;
import task_oop.models.LibraryLog;
import task_oop.models.RegRecord;
import task_oop.models.User;

public class Test {

    public static void main(String[] args) {
        LibraryLog libraryLog = new LibraryLog();
        libraryLog.setRegRecords(new RegRecord[0]);

        for (int i = 0; i < 100; i++){
            Book book = new Book();
            book.setName("Колобок");
            User user = new User();
            user.setName("Олег" + i);
            RegRecord regRecord = new RegRecord();
            regRecord.setBook(book);
            regRecord.setUser(user);

            libraryLog.addRegRecord(regRecord);
        }

    }
}
