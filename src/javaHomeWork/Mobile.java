package javaHomeWork;

public class Mobile {
    String name;
    double price;

    public Mobile(){
        System.out.println("\"I got iphone\"");
    }
    public Mobile(String name){
        this.name=name;

        System.out.println("Name is SE :"+name);
    }
    public Mobile(String name,double price){
        this.name=name; this.price=price;
        System.out.println("Name is :"+name+" "+"Price is :"+" "+price);
    }
    public static void getinfo(){
        System.out.println("Phone is iPhone 7");
    }
    public static void getinfo1(String name,double price){
        String name1 = "iPhone 6";
        double price1=399.99;

        System.out.println("Phone is :"+name1+"Price is "+price1);
    }


    public static void main(String[] args) {
        Mobile obj=new Mobile();
        Mobile obj1=new Mobile("iphone");
        Mobile obj2=new Mobile("iPhone",399.99);
        Mobile.getinfo();
        Mobile.getinfo1("iPhonee6",499.99);


    }
}
