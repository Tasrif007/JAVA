
package person;
class Person{

String name;
int age;
int phoneNumber;
String address;
double salary;

void printSalary(){
System.out.println("salary = "+salary);
}
}

class Employee extends Person{

String designation;

Employee(String n, int a, int ph, String add, double s, String
des){
name=n;
age=a;
phoneNumber=ph;
address=add;
salary=s;
designation=des;
}

void displayEmployeeDetails(){
System.out.println("\nEmployee Details:");
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("Phone Number = "+phoneNumber);
System.out.println("Address = "+address);
printSalary();
System.out.println("Designation= "+designation);
}
}

class Manager extends Person{

String department;

Manager(String n, int a, int ph,String add, double s,String
dept){
name=n;
age=a;
phoneNumber=ph;
address=add;
salary=s;
department=dept;
}

void displayManagerDetails(){
System.out.println("\nManager Details:");
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("Phone Number = "+phoneNumber);
System.out.println("Address = "+address);
printSalary();
System.out.println("Department = "+department);
}
}


