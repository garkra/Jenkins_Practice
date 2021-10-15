import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("welcome to the calculator");
    Scanner usrInputScanner = new Scanner(System.in);
    System.out.println("Enter a command:");

    while (true) {

      String usrInput = usrInputScanner.nextLine();
      String[] usrInputArray = usrInput.split("\\s");
      Calculator calculator = new Calculator();

      switch (usrInputArray[0]) {
        case "add":
          System.out.println(calculator.add(Integer.parseInt(usrInputArray[1]), Integer.parseInt(usrInputArray[2])));
          break;
        case "subtract":
          System.out
              .println(calculator.subtract(Integer.parseInt(usrInputArray[1]), Integer.parseInt(usrInputArray[2])));
          break;
        case "multiply":
          System.out
              .println(calculator.multiply(Integer.parseInt(usrInputArray[1]), Integer.parseInt(usrInputArray[2])));
          break;
        case "divide":
          System.out.println(calculator.divide(Integer.parseInt(usrInputArray[1]), Integer.parseInt(usrInputArray[2])));
          break;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(usrInputArray[1])));
          break;
        case "binary":
          System.out.println(calculator.intToBinaryNumber(Integer.parseInt(usrInputArray[1])));
          break;
        default:
          break;
      }
      if (usrInputArray[0] == "exit") {
        usrInputScanner.close();
      }
    }
  }

}
