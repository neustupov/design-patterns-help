package hf.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {

  public static void main(String[] args) {
    int c;
    try (InputStream is = new LowerCaseInputStream(
        new BufferedInputStream(
            new FileInputStream("C://test.txt")
        )
    )) {
      while ((c = is.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
