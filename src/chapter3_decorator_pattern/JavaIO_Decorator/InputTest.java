package chapter3_decorator_pattern.JavaIO_Decorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\chapter3_decorator_pattern\\JavaIO_Decorator\\Test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
                //System.out.println((char)c);
            }

            in.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}
