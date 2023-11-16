abstract class Employee{
    private String name;
    private int ID;

    public Employee(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee [name="+name+", ID="+ID+",salary="+calculateSalary()+"]";
    }
}