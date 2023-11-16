public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FulltimeEmployee emp1 = new FulltimeEmployee("Rose",001,45000);
        ParttimeEmployee emp2 = new ParttimeEmployee("Jahan", 002, 6, 50);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Employee Details: ");
        payrollSystem.displayEmployee();
        System.out.println("Remove Employee");
        payrollSystem.removeEmployee(002);
        System.out.println("Remaining Employee: ");
        payrollSystem.displayEmployee();
    }
}
