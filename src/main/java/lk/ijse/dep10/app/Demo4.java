package lk.ijse.dep10.app;

import java.io.*;

public class Demo4 {

    public static void main(String[] args) throws Exception {
        MyResource1 myResource1 = new MyResource1();
        MyResource2 myResource2 = new MyResource2();
        MyResource3 myResource3 = new MyResource3();

        try (myResource1; myResource2; myResource3) {
            System.out.println(myResource1);
            System.out.println(myResource2);
            System.out.println(myResource3);
        }
        //myResource.close();

        File file = new File("/home/ranjith-suranga/Desktop/codd.pdf");
        if (!file.exists()) return;

        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            byte[] bytes = bis.readAllBytes();
            System.out.println(bytes.length);
        }
    }
}

class MyResource1 implements AutoCloseable {

    {
        System.out.println("My Resource 1");
    }

    @Override
    public void close() {
        System.out.println("My Resource 1 is about to close");
    }
}

class MyResource2 implements AutoCloseable {

    {
        System.out.println("My Resource 2");
    }


    @Override
    public void close() throws Exception {
        System.out.println("My Resource 2 is about to close");
    }
}

class MyResource3 implements Closeable {

    {
        System.out.println("My Resource 3");
    }


    @Override
    public void close() throws IOException {
        System.out.println("My Resource 3 is about to close");
    }
}