import java.sql.SQLOutput;
import java.lang;

class Emp1 {
    Emp1(int id,String name){
        System.out.println("Id is "+id+" Name is "+name);
    }
    Emp1(String name,String address){
        System.out.println("Name is "+name+" Address is "+address);
    }

    public static void main(String[] args) {
        Emp1 e1 = new Emp1(123,"abc");
        Emp1 e2 = new Emp1("xyz","Bangalore");
    }
}


