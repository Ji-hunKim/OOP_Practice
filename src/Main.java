import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
  double result;
  public double cal(long a, long b, int c) {
    switch (c) {
      case 1 -> result = a + b;
      case 2 -> result = a - b;
      case 3 -> result = a * b;
      case 4 -> result = (double) a / b;
    }
    return result;
  }
  public void start () {
    Scanner sc = new Scanner(System.in);
    while (true) {
      try {
        // 두 수 입력
        System.out.println("계산하고 싶은 두 수를 입력하세요");
        long a = sc.nextInt();
        long b = sc.nextInt();
        // 기능 입력
        System.out.print("어떤 기능을 활용하실 건가요? 1: 더하기 2: 빼기 3: 곱하기 4: 나누기 5: 종료 -- 입력: ");
        int num = sc.nextInt();
        // 종료버튼
        if (num == 5) {
          System.out.println("계산기 종료");
          break;
        }
        // num값이 잘못됐을 경우
        if (num < 1 || num > 5) {
          System.out.println("Err : num 값을 다시 입력해주세요");
          continue;
        }
        // 계산 결과 출력
        double result = cal(a, b, num);
        System.out.println("계산된 값 = " + result);
        //input 예외
      } catch (InputMismatchException e1) {
        System.out.println("Err : 정수만 입력해주세요");
        sc.nextLine();
        //파라미터 예외
      } catch (IllegalArgumentException e2) {
        System.out.println("Err : 잘못된 파라미터값");
        sc.nextLine();
      }
    }
  }
}
public class Main {
  public static void main (String[]args) throws IOException {
    Calculator c1 = new Calculator();
    c1.start();
  }
}

