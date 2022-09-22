package org.example;
class Employee{

    int id;
    String name, address;
    String phone;
    public EMP(int a, String b, String c, String d){
        this.id = a;
        this.name = b;
        this.address = c;
        this.phone = d;
    }

    public void display(int a){
        System.out.println(id);
        System.out.println(phone);
    }

    public void display(){
        System.out.println(name);
        System.out.println(address);
    }
}

class HR extends Employee{
    int salary;
    public HR(int a, String b, String c, String d, int sal) {
        super(a, b, c, d);
        this.salary = sal;
    }

    public void empWithSalary(){
        System.out.println(name);
        System.out.println(salary);
    }

    public void empWithSalary(int tax){
        System.out.println("\nEmployee Name: "+name+"\nSalary: "+(salary-tax)+"\nTax Deducted: "+tax);
    }
}

class New{

    public static void main(String args[]){

        Employee obj1 = new Employee(1,"ABC","XYZ", "786876");
        HR obj2 = new HR(1,"abc","xyz", "987654321", 600);
        obj1.display(1);
        obj1.display();
        obj2.empWithSalary();
        obj2.empWithSalary(5000);
    }
}
