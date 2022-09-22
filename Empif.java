public class Emp {
    int id;
    String name;
    String type;
    public Emp(int a,  String d,String type){
        this.id = a;
        this.name = d;
        this.type = type;
    }

    public void display(int a){
        System.out.println("Name:"+name);
    }

    public void display(){
        System.out.println("\nId:"+name);
    }
    void DecisionMaking(){
    
        if(type.equals("HR")){
        
            System.out.println("9 to 6");
        }
        
        else if(type.equals("Fresher")){
        
            System.out.println("10 to 7");

        }
        else{
        
            System.out.println("9 to 5");
        }
    }
}
class New{
    public static void main(String args[]){
        Employee o1 = new Employee(12,"abc","HR");
        Employee o2 = new Employee(13,"xyz","Fresher");
        Employee o3 = new Employee(14,"qwe","infra");
        o1.DecisionMaking();
        o2.DecisionMaking();
        o3.DecisionMaking();
    }
}


