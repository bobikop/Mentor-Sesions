package week_12_abstraction;

public class Employee extends Member {

    private String specialization;

    public Employee(String name, String address, int age, int salary, long phoneNumber, String specialization) {
        super(name, address, age, salary, phoneNumber);
        setSpecialization(specialization);
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", phoneNumber=" + getPhoneNumber() +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
