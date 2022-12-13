import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int temp = console.nextInt();
        int age = console.nextInt();




    }
    public static void temp(int temp) {
        if (temp <0){
            System.out.println("child wear a jacket ");
        }
        if(temp<=10 && temp>0) {
            System.out.println("switer wear");
        }
        if (temp<10 ){
            System.out.println("T-shirt");
        }

    }
    public static void age(int age){
        if (age<6){
            System.out.println(" sadike bar");
        }if (age>6 && age<=18){
            System.out.println("mektepke bar");
        }if (age>=18 && age<=24 ){
            System.out.println("universitetke bar");
        }if (age>24){
            System.out.println("ishke bar");
        }
    }
}