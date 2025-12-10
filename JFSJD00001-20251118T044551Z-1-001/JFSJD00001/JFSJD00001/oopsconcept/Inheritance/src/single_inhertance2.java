class cat{ //parent
    String name;
    String color;

    cat(String name,String color){ //constuctor
        this.name=name;
        this.color=color;

    }
    public void cdetails(){//methods
        System.out.println(name+" "+color);
    }
}
class bcat extends cat { //child
    int age;
    bcat(int age,String name,String color){ //constuctor
        super(name,color);
        this.age=age;
    }
    public void cdetails() { //methods
        System.out.println(" "+age+"\n "+name+"\n "+color);
    }
}
public class single_inhertance2 {
    static void main(String[] args) {
        bcat obj=new bcat(2,"Muiza","White");
        obj.cdetails();
    }
}



