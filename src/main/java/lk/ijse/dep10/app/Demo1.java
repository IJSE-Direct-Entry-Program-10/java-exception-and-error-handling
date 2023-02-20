package lk.ijse.dep10.app;

public class Demo1 {

    public static void main(String[] args)  {
//         System.out.println(10 / 0);

//        int x = Integer.parseInt("abc");
//        System.out.println(x);

//        String something = null;
//        System.out.println(something.length());

//        Class.forName("abc");
        System.out.println("Before My Method 1 Innovacation");
        try {
            myMethod1();
        }catch (Throwable t){
            System.out.println("Oni prashanyak!");
        }
        System.out.println("After My Method 1 Innovacation");
    }

    public static void myMethod1() {
        System.out.println("Before My Method2 Innovcation");
        try {
            myMethod2();
        }catch (NumberFormatException e){

        }
        System.out.println("After My Method2 Innovaction");
    }

    public static void myMethod2()  {
        try {
            System.out.println("Let's try this");
            System.out.println(10 / 0);
            System.out.println("Hooray!");
        }catch (NullPointerException e){
            System.out.println("Aawa... aawaa.. null ... aawa...!");
        }
        System.out.println("myMethod2()");
//        try {
//            System.out.println("Let's try this");
//            System.out.println(10 / 0);
//            System.out.println("Hooray!");
//        }catch (Throwable t){
//            System.out.println(t);
//        }
    }
}
