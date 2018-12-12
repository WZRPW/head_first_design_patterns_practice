package chapter3_decorator_pattern.JavaIO_Decorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\weizo\\OneDrive\\Documents\\interview\\code_practice\\Head-First-Design-Patterns\\src\\head_first_design_patterns_practice\\src\\chapter3_decorator_pattern\\JavaIO_Decorator\\Test.txt")));

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
