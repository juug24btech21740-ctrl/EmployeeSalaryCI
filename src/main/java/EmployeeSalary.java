public class EmployeeSalary {

    public double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    public double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    public double calculateGrossSalary(double basicSalary) {
        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);

        return basicSalary + hra + da;
    }

    public double calculateNetSalary(double basicSalary) {
        double grossSalary = calculateGrossSalary(basicSalary);
        double pf = basicSalary * 0.12;

        return grossSalary - pf;
    }
}