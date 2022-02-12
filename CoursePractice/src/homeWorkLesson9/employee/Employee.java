package homeWorkLesson9.employee;

public class Employee {
    String name;
    int yearJoin;
    int salary;
    String address;

    public Employee(String name, int yearJoin, int salary, String address) {
        this.name = name;
        this.yearJoin = yearJoin;
        this.salary = salary;
        this.address = address;
    }

        public void show(){
            System.out.println(name+    "         "+yearJoin+"         "+  salary +"         "+  address);
        }

}
