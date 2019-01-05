package hf.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

  @Override
  void brew() {
    System.out.println("Dripping CoffeeWithHook through filter");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding sugar and milk");
  }

  @Override
  boolean customersWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    String answer = null;

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      answer = reader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}
