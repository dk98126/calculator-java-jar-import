package exercise;

import calculator.Calculator;
import calculator.Operation;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Добро пожаловать в игру на сложение и вычитание!");

    int points = 0;
    while (true) {
      int a = random.nextInt(1, 100);
      int b = random.nextInt(1, 100);
      Operation operation = List.of(Operation.PLUS, Operation.MINUS).get(random.nextInt(2));
      int expected = calculator.calculate(a, operation, b);

      System.out.println("Сколько будет " + a + operation + b + "?");
      int answer = scanner.nextInt();

      if (answer != expected) {
        System.out.println("Вы набрали " + points);
        System.exit(0);
      }
      points++;
    }
  }
}
