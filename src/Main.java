import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[5];

        Employee emp1 = new Employee("Ivanov", "ivano", "Ivanovitsh", 1, 11111, 1);
        Employee emp2 = new Employee("Ivanov1", "ivano", "Ivanovitshx", 2, 22222, 2);
        Employee emp3 = new Employee("Ivanov2", "ivano", "Ivanovitsh", 3, 33333, 3);
        Employee emp4 = new Employee("Ivanov3", "ivano", "Ivanovitsh", 4, 44444, 4);
        Employee emp5 = new Employee("Ivanov4", "ivano", "Ivanovitsh", 5, 55555, 5);

        employee[0] = emp1;
        employee[1] = emp2;
        employee[2] = emp3;
        employee[3] = emp4;
        employee[4] = emp5;

                 System.out.println(emp1);
                  System.out.println(emp2);
                  System.out.println(emp3);
                   System.out.println(emp4);
                  System.out.println(emp5);




        }

    }




