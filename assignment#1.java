
public class EmployeePayroll {

    public static void main(String[] args) {

        String employeeName = "Pedro Reyes";
        double dailyRate = 650.50;
        int daysWorked = 22;
        double taxRate = 0.10;

        // ERROR 1: Missing semicolon at the end of the statement.
        double grossSalary = dailyRate * daysWorked

        // ERROR 2: The variable taxAmount is not declared.
        taxAmount = grossSalary * taxRate;

        // ERROR 3: The variable netSalary is declared as String,
        // but the calculation produces a numeric value.
        String netSalary = grossSalary - taxAmount;

        // ERROR 4: The variable overtimePay is undeclared.
        double totalSalary = netSalary + overtimePay;

        // ERROR 5: Incorrect capitalization of the variable name.
        System.out.println("Employee: " + employeeName);
        System.out.println("Gross Salary: " + grosssalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Total Salary: " + totalSalary);
    }
}
