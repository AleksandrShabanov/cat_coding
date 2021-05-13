package oop.task_oop.models;

import java.util.Arrays;

/**
 * 1) класс User стандартные поля name/surname etc
 * 2) класс Book name/author/year/description
 * 3) Registrattion -> класс который содержит User, Book в качестве поля, и количество дней "аренды" книжки
 * 3) класс Library который содержит массив типа Registration
 * смысл - разработать систему которая даст возможность создавать регистрацию и добавлять /фиксировать ее в классе. Library
 */
public class LibraryLog {
    private RegRecord regRecords [];

    public RegRecord[] getRegRecords() {
        return regRecords;
    }

    public void setRegRecords(RegRecord[] regRecords) {
        this.regRecords = regRecords;
    }

    public void addRegRecord(RegRecord regRecord) {
        regRecords = Arrays.copyOf(regRecords, regRecords.length + 1);
        regRecords[regRecords.length - 1] = regRecord;
        System.out.println(Arrays.toString(regRecords));
    }
}
