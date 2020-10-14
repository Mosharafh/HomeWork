package classtest;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {

        LargeNumber.number();

    }


    public static void number() {
        int x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter First Number :");
        x=input.nextInt();

        System.out.println("please Enter Second Number :");
        y=input.nextInt();

        System.out.println("Please Enter Your Third Number :");
        z=input.nextInt();
        if(x>y && x>z){
            System.out.println("Largest Nymber is :"+x);
        }else if(y>x && y>z){
            System.out.println("Largest Number is :"+y);
        }else{
            System.out.println("Largest Number is :"+z);
        }

    }


}
