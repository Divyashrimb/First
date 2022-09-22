class Employee {
    int id;
    String name;
            String type;
    public Employee(int a,  String d, String type){
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
        switch(type){
            case "HR":
                System.out.println("This is HR");
                break;
            case "Admin":
                System.out.println("This is Admin");
                break;
            case "Fresher":
                System.out.println("This is a Fresher");
                break;
            default :
                System.out.println("Infra");
                break;
        }
    }



    public static void main(String args[]){

        Employee o1 = new Employee(12,"abc","HR");
        Employee o2 = new Employee(13,"xyz","Fresher");
        Employee o3 = new Employee(14,"qwe","infra");
        o1.DecisionMaking();
        o2.DecisionMaking();
        o3.DecisionMaking();

    }
}

