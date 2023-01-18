package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int NInum, int salary, String deptName, double budget) {
        super(name, NInum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus(){
        return this.getSalary() / 50;
    }
}
