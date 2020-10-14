package classtest;

import java.util.Scanner;

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number :");
        double x=scan.nextDouble();

        System.out.println("Enter First Number :");
        double y=scan.nextDouble();

        System.out.println("Enter First Number :");
        double z=scan.nextDouble();

        if(x<y && y<z){
            System.out.println("Increased");
        }else if (x>y && y>z){
            System.out.println("Decreasing");
        }else{
            System.out.println( "Neither");
        }
    }
}
