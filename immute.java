final public class Immute {
    private final int id;
    private final String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Immute(int a,String b){
        this.id=a;
        this.name=b;
    }

    public static void main(String[] args) {
        Immute i=new Immute(11,"abc");
        System.out.println(i.name);
    }
}

