package exercise;

import calculator.Calculator;
import calculator.Operation;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) throws IOException {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

<<<<<<< HEAD
    System.out.println("Welcome!");
=======
    System.out.println(
        FigletFont.convertOneLine("Welcome!")
    );
>>>>>>> 83fb8a7 (figlet font)

    int points = 0;
    while (true) {
      int a = random.nextInt(1, 100);
      int b = random.nextInt(1, 100);
      Operation operation = List.of(Operation.PLUS, Operation.MINUS).get(random.nextInt(2));
      int expected = calculator.calculate(a, operation, b);
      
      System.out.println(
          FigletFont.convertOneLine(a + " " + operation + " " + b + "?")
      );
      int answer = scanner.nextInt();

      if (answer != expected) {
        System.out.println(
            FigletFont.convertOneLine("Score: " + points)
        );
        System.exit(0);
      }
      points++;
    }
  }
}
