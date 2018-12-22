package hf.observerfromswing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

  JFrame jFrame;

  public static void main(String[] args) {
    SwingObserverExample example = new SwingObserverExample();
    example.go();
  }

  public void go() {
    jFrame = new JFrame();
    JButton button = new JButton("I do it?");
    button.addActionListener(e -> System.out.println("Angel"));
    button.addActionListener(e -> System.out.println("Devil"));
  }
}
