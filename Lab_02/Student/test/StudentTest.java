import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    @Test
    public void testStudent(){
        Student testStudent = new Student("Jane", "Doe");
        Assert.assertEquals("Jane", testStudent.getFirstName());
    }
    @Test
    public void testSingleExam() {
        Student testStudent = new Student("Jane", "Doe");
        GregorianCalendar testDay = new GregorianCalendar(2021, Calendar.APRIL, 19);
        Exam testExam = new Exam("Programmazione Object Oriented", testDay, 30);
        testStudent.registerExam(testExam);
        Assert.assertEquals(1, testStudent.exams.size(), 0);
        Assert. assertEquals(30, testStudent.computeAverageGrade(), 0);
    }
    @Test
    public void testDoubleExam() {
        Student testStudent = new Student("Jane", "Doe");
        Exam testExam1 = new Exam("Programmazione Object Oriented", new GregorianCalendar(2021, Calendar.APRIL, 19), 30);
        testStudent.registerExam(testExam1);
        Exam testExam2 = new Exam("Programmazione I", new GregorianCalendar(2020, Calendar.APRIL, 19), 18);
        testStudent.registerExam(testExam2);
        Assert.assertEquals(2, testStudent.exams.size(), 0);
        Assert. assertEquals(24, testStudent.computeAverageGrade(), 0);
    }
}