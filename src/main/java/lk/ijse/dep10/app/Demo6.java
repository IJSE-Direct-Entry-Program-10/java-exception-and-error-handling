package lk.ijse.dep10.app;

public class Demo6 {

    public static void main(String[] args) {
        //System.out.println(getResult());
    }

    private static void getResult(){
        try{
            System.out.println("Start");
            Class.forName("abc");
            System.out.println("End");
        }catch (Exception e){
            throw e;
        }finally{
            return;
        }
    }
}
