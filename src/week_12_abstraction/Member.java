package week_12_abstraction;

public class Member {



    private String name, address;
    private int age, salary;
    private long phoneNumber;


    public Member(String name, String address, int age, int salary, long phoneNumber) {
        setName(name);
        setAddress(address);
        setAge(age);
        setSalary(salary);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public  void printSalary(){
        System.out.println("Salary" + salary);
    }


    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
