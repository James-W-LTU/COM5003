package main;

public class modelEmployee {
    private String firstname;
    private String surname;
    private int age;
    private double salary;
    private int id;

    public modelEmployee(String firstname, String surname, int age, double salary, int id) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.id = id;
    }

    public String getFirstname() {return firstname;}
    public String getSurname() {return surname;}
    public int getAge() {return age;}
    public double getSalary() {return salary;}
    public int getId() {return id;}

    public void setFirstname(String firstname) {this.firstname = firstname;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setAge(int age) {this.age = age;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setId(int id) {this.id = id;}
}