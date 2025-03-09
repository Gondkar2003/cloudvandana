import java.util.*;
class Employee
{
private int id;
private String name;
private double salary;
 Employee(int id, String name,double salary)
{
this.id=id;
this.name=name;
this.salary=salary;
}
public void display()
{
System.out.println("Id:" +id+ "\nName:" +name+  "\nSalary:" +salary);
}
}

public class EmployeeManagementSystem
{
public static void main(String args[])
{
Employee emp1=new Employee(1,"Darshan",80000);
Employee emp2=new Employee(2,"Abhishek",60000);
Employee emp3=new Employee(3,"Tushar",40000);

List<Employee> employeelist = new ArrayList<>();
employeelist.add(emp1);
employeelist.add(emp2);
employeelist.add(emp3);

System.out.println("Employee details:");
for (Employee emp : employeelist)
{
emp.display();
}
}
}

