import java.util.Scanner;

public class Main{

  private static char operator;

  public static double inputNumber(Scanner sc, String message){
    System.out.print(message);
    return sc.nextDouble();
  }
  
  public static char inputOperator(Scanner sc, String message){
    System.out.print(message);
    return sc.next().charAt(0);
  }

  public static void caculate(double num1, double num2){
    if (operator == '+') {
      System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    } else if (operator == '-') {
      System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    } else if (operator == '*') {
      System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    } else if (operator == '/') {
      if (num2 != 0) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
      } else {
        System.out.println("0으로 나눌 수 없음");
      }
    } else {
      System.out.println("잘못된 연산자입니다.");
    }
    
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double num1 = inputNumber(sc, "첫 번째 숫자를 입력하세요: ");
    double num2 = inputNumber(sc, "두 번째 숫자를 입력하세요: ");

    operator = inputOperator(sc, "연산자를 입력하세요 (+, -, *, /): ");
    caculate(num1, num2);

    sc.close();
  }
}