public class TestEmployee {
    public static void main(String[] args) {
        Employee john = new Employee("John", 4500);
        Employee james = new Employee("James", 5000);

        System.out.println(john.getName() + " - Annual Salary: $" + john.getAnnualSalary());
        System.out.println(james.getName() + " - Annual Salary: $" + james.getAnnualSalary());

        
        john.raiseSalary(20);
        james.raiseSalary(20);

        System.out.println(john.getName() + " - New Monthly Salary: $" + john.getSalary());
        System.out.println(james.getName() + " - New Monthly Salary: $" + james.getSalary());
    }
}
