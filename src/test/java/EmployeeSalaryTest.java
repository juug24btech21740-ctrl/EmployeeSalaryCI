import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSalaryTest {

    @Test
    void testCalculateHRA() {
        EmployeeSalary salary = new EmployeeSalary();

        assertEquals(6000, salary.calculateHRA(30000));
    }

    @Test
    void testCalculateDA() {
        EmployeeSalary salary = new EmployeeSalary();

        assertEquals(3000, salary.calculateDA(30000));
    }

    @Test
    void testCalculateGrossSalary() {
        EmployeeSalary salary = new EmployeeSalary();

        assertEquals(39000, salary.calculateGrossSalary(30000));
    }

    @Test
    void testCalculateNetSalary() {
        EmployeeSalary salary = new EmployeeSalary();

        assertEquals(35400, salary.calculateNetSalary(30000));
    }
}