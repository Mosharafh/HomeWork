package javaHomeWork;

public class Pizza {

    String pizzaName = "Regular";
    static char pizza_size='M';
    String address;
    int orderNumber;
    int quantiry;

    public Pizza(){
        System.out.println("Welcome to PizzaIsland");
    }
   public Pizza(String pizzaName){
        this.pizzaName=pizzaName;
       System.out.println("Pizza Name is: " +this.pizzaName);
   }
    public Pizza(String pizzaName,int orderNumber){
        this.pizzaName=pizzaName;
        this.orderNumber=orderNumber;
        System.out.println(this.pizzaName+"Order Number is :"+this.orderNumber);
    }
    public Pizza(String pizzaName,int orderNumber,int quantiry){
        this.pizzaName=pizzaName;
        this.orderNumber=orderNumber;
        this.quantiry=quantiry;
        System.out.println(this.pizzaName+"Order Number is :"+this.orderNumber+"Quantity is :"+quantiry);
    }
    public static void getInfo(){
        String name1="Vege Pizza";
        double qtny=10;
        System.out.println("Pizza Name is:"+name1+" "+"Quantity is :"+qtny);

    }
    public static String getInfo1(String pizzaName){
        String pizzName=pizzaName;
        System.out.println("Pizza Name is:"+pizzaName);
        return pizzaName;
    }




    public static void main(String[] args) {
        double price=10.99;
        Pizza pz=new Pizza();
        System.out.println("Pizza Name is: "+pz.pizzaName);
        System.out.println("Price is :"+price);
        System.out.println("Pizza Size is :"+Pizza.pizza_size);
        Pizza pz1=new Pizza("Regular");
        Pizza pz2=new Pizza("Regular",2);
        Pizza pz3=new Pizza("Regular",2,3);
        Pizza.getInfo();
        Pizza.getInfo1("Regular");

    }



}