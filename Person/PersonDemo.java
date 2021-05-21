
package person;

public class PersonDemo {
    
public static void main(String[] args) {
Employee e1 = new Employee("Md.Tasriful hoque", 22,187776,"Maniknagar, Dhaka",
45000,"Software Engineer");
Manager m1 = new Manager("Mr. Rahim",28,189999, "Mirpur,Dhaka",
55000,"HR");
e1.displayEmployeeDetails();
m1.displayManagerDetails();
}
}
