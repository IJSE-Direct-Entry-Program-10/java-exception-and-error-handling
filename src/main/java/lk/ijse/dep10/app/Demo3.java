package lk.ijse.dep10.app;

import java.sql.SQLException;

public class Demo3 {

    public static void main(String[] args) {
//        try{
//            myMethod2();
//        }catch (ClassNotFoundException e){
//
//        }


//        try {
//            myMethod1();
//        }catch (ClassNotFoundException | InterruptedException | SQLException  e){
//            System.out.println("Class Not Found Exception Ekak Aawo...!");
//        }catch (NullPointerException | ArrayIndexOutOfBoundsException | Error e){
//
//        }
    }

    public static void myMethod1() throws ClassNotFoundException, InterruptedException, SQLException{
        System.out.println("Entering My Method1");
        throw new RuntimeException();
    }

    public static void myMethod2(){
        System.out.println("Entering My Method2");
        myMethod3();
        System.out.println("Leaving My Method2");
    }

    public static void myMethod3(){
        System.out.println("Entering My Method3");
        System.out.println("Leaving My Method3");
    }
}
