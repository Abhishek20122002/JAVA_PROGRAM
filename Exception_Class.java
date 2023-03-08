import java.util.Scanner;

//class MyException extends Exception{
//    @Override
//    public String toString() {
//        return "I am toString()";
//    }
//
//    @Override
//    public String getMessage() {
//        return "I am getMessage()";
//    }
//}
//class MaxAgeException extends Exception{
//    @Override
//    public String toString() {
//        return "Age cannot be greater than 125";
//    }
//
//    @Override
//    public String getMessage() {
//        return "Make sure that the value of age entered is correct";
//    }
//}
//public class Exception_Class {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//            try{
//                System.out.println(a);
//                if (a<125) {
//                    throw new MyException();
//                } else {
//                    throw new MaxAgeException();
//                }
//                //throw new ArithmeticException("This is an exception");
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                //e.printStackTrace();
//                System.out.println("Finished");
//            }
//            System.out.println("Yes Finished");
//        //}
//    }
//}

class MaxAgeException extends Exception{
//	@Override
//    public String toString() {
//        return "Age cannot be greater than 125";
//    }

    MaxAgeException(String message){
        super(message);
    }
}

public class Exception_Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

//		try {
//			System.out.println(age);
//            if (age>125) {
//                throw new MaxAgeException();
//            }
//		}
//		finally {
//			System.out.println("Exit the loop");
//		}
        try {
            hand(age);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void hand(int age) throws MaxAgeException {
        if(age>120) {
            throw new MaxAgeException("Age cannot be greater than 125");
        } else {
            System.out.println("Your age is correct");
        }
    }

}
