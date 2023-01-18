package staff;

public abstract class Employee {

    private String name;
    private int NInum;
    private int salary;

    public Employee(String name, int NInum, int salary){
        this.name = name;
        this.NInum = NInum;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null){
        this.name = name;}
    }

    public int getNInum() {
        return this.NInum;
    }

    public int getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase){
        if (increase>0){
        this.salary += increase;}
    }

    public double payBonus(){
        return this.salary / 100;
    }

}
