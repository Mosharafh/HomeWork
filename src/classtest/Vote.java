package classtest;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        int age;

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your age :");
        age = input.nextInt();
        if(age<18){

            System.out.println(" You are not eligible");
        }else{
            System.out.println("you can vote");
        }


    }
}
