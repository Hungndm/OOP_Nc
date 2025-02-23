package Bai_4;

public class Employee {
    private int id ;
    private String firstName;
    private String lastName;
    private int salary ;
    public Employee(int id,String firstName,String lastName, int salary){
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
public int getAnnuaSalary(){
      return (int)(salary *12);

}
    public void setSalary(int salary) {
        this.salary = salary;
    }
public int raiseSalary(int percent) {
    if (percent < 0) {
        System.out.println("Ty le tang luong khong hop le ");
        return salary;

    }
    salary += salary * (percent / 100);
    return salary;

}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }


}
