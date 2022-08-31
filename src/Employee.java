import java.util.Arrays;
import java.util.Objects;



public  class Employee {
    private static int counter;
    private String surname;    // Фамилия
    private String name;       // Имя
    private String patronymic; // Отчество
    private int department;    // отдел
    private int salary;       // Зарплата
    private Integer id;         // ID


    public Employee(String surname, String name, String patronymic, int department, int salary, Integer id) {

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "  " + surname + "   " + name + "   " + patronymic + "   " + salary + "   " + counter++;
    }

 //     @Override
  //  public boolean equals(Object o) {
  //      if (this == o) return true;
  //      if (o == null || getClass() != o.getClass()) return false;
  //      Employee employee = (Employee) o;
  //      return department == employee.department && salary == employee.salary && Object.id = employee.id && Object.equals(name, employee.name);

  // }
    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic);

    }


}






