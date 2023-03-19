//import java.lang.String;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Using While Loop");
//        int a = 100;
//        while(a<=200){
//            System.out.println(a);
//            a++;
//        }
//
//        System.out.println("Using Do-While Loop");
//        int n = sc.nextInt();
//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        }while (a<=n);
//
//        System.out.println("Using For Loop");
//        System.out.println("First n odd numbers");
//        int n = sc.nextInt();
//        for (int i = 1; i<=n; i++){
//            if(i%2 != 0){
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("First n natural numbers in reverse order");
//        int a = sc.nextInt();
//        for(int i = a; i!=0; i--){
//            System.out.println(i);
//        }

        System.out.println("Loop Shorthand: ");
        int sum = 0;
        String array[] = {"Ashish", "Abhishek", "Nitin", "Vaibhav"};   //Also can write in []array
        for(String x:array){     //For each loop
            System.out.println(x);
        }
    }
}
