class dog{ //parent
    String color;
   String breed;
    dog(String color,String breed){ //constuctor
        this.color=color;
        this.breed=breed;
    }
    public void ddetails(){//methods
        System.out.println(color+" "+breed);
    }
}
class bdog extends dog { //child
    String name;
    bdog(String name,String color,String breed){ //constuctor
        super(color,breed);
        this.name=name;
    }
    public void bdetails() { //methods
        System.out.println(name+" "+color+" "+breed);
    }
}
public class single_inhertance1 {
    static void main(String[] args) {
        bdog obj=new bdog("Charlie","Golden white","Golden retriver");
        obj.bdetails();
    }
}



