import org.J2EEPract.Employee;
import org.J2EEPract.FieldLengthLimitException;
import org.J2EEPract.IncorrectSalaryException;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void createEmployeeTest() throws IncorrectSalaryException, FieldLengthLimitException {
        String name = "Dmytrii";
        String surname = "Maistrenko";
        double salary = 100;
        Employee test = new Employee(name, surname, salary);

        Assert.assertEquals(test.getName(), name);
        Assert.assertEquals(test.getSurname(), surname);
        Assert.assertEquals(test.getSalary(), salary, 0.01);
    }

    @Test(expected = FieldLengthLimitException.class)
    public void FieldLengthLimitExceptionTest() throws IncorrectSalaryException, FieldLengthLimitException {
        String name = "Dmytriiiiiiiiiiiiiiiiiiii";
        String surname = "Maistrenko";
        double salary = 100;
        Employee test = new Employee(name, surname, salary);
    }

    @Test(expected = IncorrectSalaryException.class)
    public void IncorrectSalaryExceptionTest() throws IncorrectSalaryException, FieldLengthLimitException {
        String name = "Dmytrii";
        String surname = "Maistrenko";
        double salary = -100;
        Employee test = new Employee(name, surname, salary);
    }
}
