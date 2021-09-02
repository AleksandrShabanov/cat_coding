package task_clone.models;

import com.rits.cloning.Cloner;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class TerminatorTest {

    @Test
    public void deepCloneTest() throws CloneNotSupportedException {
        // Given
        Calendar calendar = new GregorianCalendar(1997,Calendar.AUGUST,4);
        Date birthdaySkyNet = calendar.getTime();
        SkyNet skyNet = new SkyNet(birthdaySkyNet);

        Terminator expectedOriginal = new Terminator("T800", 2029, skyNet);

        // When
        Terminator  actualClone = expectedOriginal.clone();

        // Then
        assertTrue(expectedOriginal.getModelName().equals(actualClone.getModelName()));
        assertTrue(expectedOriginal.getModelName() == actualClone.getModelName());
        assertTrue(expectedOriginal.getYearOfIssue() == actualClone.getYearOfIssue());
        assertFalse(expectedOriginal.getSkyNet().equals(actualClone.getSkyNet()));
        assertFalse(expectedOriginal.getSkyNet() == actualClone.getSkyNet());

    }

    @Test
    public void deepCloneKryoTest() {
        //Given
        Calendar calendar = new GregorianCalendar(1997,Calendar.AUGUST,4);
        Date birthdaySkyNet = calendar.getTime();
        SkyNet skyNet = new SkyNet(birthdaySkyNet);

        Terminator expectedOriginal = new Terminator("T800", 2029, skyNet);

        //When
        Cloner cloner = new Cloner();
        Terminator actualClone = cloner.deepClone(expectedOriginal);

        //Then
        assertTrue(expectedOriginal.getModelName().equals(actualClone.getModelName()));
        assertTrue(expectedOriginal.getModelName() == actualClone.getModelName());
        assertTrue(expectedOriginal.getYearOfIssue() == actualClone.getYearOfIssue());
        assertFalse(expectedOriginal.getSkyNet().equals(actualClone.getSkyNet()));
        assertFalse(expectedOriginal.getSkyNet() == actualClone.getSkyNet());
    }

}