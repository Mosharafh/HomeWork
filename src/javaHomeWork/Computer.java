package javaHomeWork;

public class Computer {
    String name;
    int price;
    String color;
    public Computer(){                                                          // Constructor without Perameter/signature

        System.out.println("My Computer");
    }
    public Computer(String name){                                                // Constructor with Parameter/Signature
        this.name=name;
        System.out.println(this.name);
    }
    public Computer(String name, int price){                                      // Constructor with Signature
        this.name=name;
        this.price=price;
        System.out.println("Name is"+" "+name+","+" "+"Price is"+" "+price);
    }
    public static void computerInfo(){                                           // Method without Signature
      String name="IBM";
      int price=1000;
        System.out.println("Name is :"+" "+name+"Price is :"+" "+price);

    }
    public static void computerInfo1(String name1,int price1,String color1){      // Method with Signature
        String name=name1;
        int price=price1;
        String color=color1;
        System.out.println("Name is :"+" "+name+"Price is :"+" "+price+" "+"Color is:"+" "+color);

    }


    public static void main(String[] args) {
        Computer obj=new Computer();
        Computer obj1=new Computer("IBM");
        Computer obj2=new Computer("IBM",150);
        Computer.computerInfo();
        Computer.computerInfo1("IBM",1500,"Blue");
        }

    }

