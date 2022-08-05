package week_12_abstraction;

public class Manager extends Member {


    private String department;


    public Manager(String name, String address, int age, int salary, long phoneNumber, String department) {
        super(name, address, age, salary, phoneNumber);
        setDepartment(department); // this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", phoneNumber=" + getPhoneNumber() +
                ", department='" + department + '\'' +
                '}';
    }
}
