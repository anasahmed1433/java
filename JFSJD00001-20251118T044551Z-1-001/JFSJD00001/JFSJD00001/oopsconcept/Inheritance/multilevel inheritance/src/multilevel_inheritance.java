class Gfather{
    String name;
    String bloodgrp;
    Gfather(String name,String bloodgrp){
        this.name=name;
        this.bloodgrp=bloodgrp;
    }
   public void gfather(){
       System.out.println(name+" "+bloodgrp);
   }
}
class fson extends Gfather{
    String surname;
    int age;
    fson(String surname,int age,String name,String bloodgrp)
    {
        super(name,bloodgrp);
        this.surname=surname;
        this.age=age;
    }
    public void fsond(){
        System.out.println(surname+" "+age+" "+name+" "+bloodgrp);
    }
}
class son extends fson{
    String name1;
    String blood;
    son(String name1,String blood,String surname,int age,String name,String bloodgrp)
    {
       super(surname,age,name,bloodgrp);
        this.name1=name1;
        this.blood=blood;
    }
    public void sond(){
        System.out.println(name1+" "+blood+" "+surname+" "+age+" "+name+" "+bloodgrp);
    }
}

public class multilevel_inheritance {
    static void main(String[] args) {
        son obj=new son("Anas","A+","Ahmed",45,"Abdul nabi","O+");
        obj.sond();
    }
}