package homeWorkLesson9.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr [0] = new Employee("Robert", 1994, 1000, "64C-Walls Street" );
        arr [1] = new Employee("Sam",2000, 1200, "68D-Walls Street");
        arr [2] = new Employee("John", 1999, 1300, "26B-Walls Street");
        System.out.println(" Name    " + "  Year of joining"   + "    Salary" + "      Address");
        for (Employee employee:arr) {
            employee.show();
        }
    }
}
