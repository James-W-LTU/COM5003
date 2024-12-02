import main.modelEmployee;

public class testModelEmployee {
    public static void main(String[] args) {
        modelEmployee employee1 = new modelEmployee("Adam", "Smith", 34, 30000, 99);
        modelEmployee employee2 = new modelEmployee("John", "Brown", 52, 38000, 67);


        System.out.println("Employee class example");


        System.out.println("\nEmployee 1 firstname, surname and age: " + employee1.getFirstname() + " " + employee1.getSurname() + ", " + employee1.getAge())
        ;
        System.out.println("\nEmployee 2 firstname, surname and salary: " + employee2.getFirstname() + " " + employee2.getSurname() + ", " + employee2.getSalary());
    }
}
