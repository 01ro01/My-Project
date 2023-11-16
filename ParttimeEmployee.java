public class ParttimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public ParttimeEmployee(String name,int ID,int hoursWorked,double hourlyRate){
        super(name, ID);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}
