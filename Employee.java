public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(double percent) {
        salary += salary * (percent / 100);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
