public class FulltimeEmployee extends Employee {
    private double monthlySalary;
    public FulltimeEmployee(String name,int ID,double monthlySalary){
        super(name, ID);
        this.monthlySalary= monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
    
}
