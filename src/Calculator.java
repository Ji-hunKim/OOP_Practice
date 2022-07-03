import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    long result;

    public long add(long a, long b) {
        result = a + b;
        return result;
    }
    public long sub(long a, long b) {
        result = a - b;
        return result;
    }
    public long mul(long a, long b) {
        result = a * b;
        return result;
    }
    public long div(long a, long b) {
        result = a / b;
        return result;
    }

    public static void main(String[] args) throws IOException {
        Calculator c1 = new Calculator();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("어떤 기능을 활용하실 건가요? 1: 더하기 2: 빼기 3: 곱하기 4: 나누기 5: 종료 -- 입력: ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("두 수를 차례대로 입력하세요");
                long a = sc.nextInt();
                long b = sc.nextInt();

                long result = c1.add(a, b);
                System.out.println("더한 값 = " + result);
            } else if (num == 2) {
                System.out.println("두 수를 차례대로 입력하세요");
                long a = sc.nextInt();
                long b = sc.nextInt();

                long result = c1.sub(a, b);
                System.out.println("뺀 값 = " + result);
            } else if (num == 3) {
                System.out.println("두 수를 차례대로 입력하세요");
                long a = sc.nextInt();
                long b = sc.nextInt();

                long result = c1.mul(a, b);
                System.out.println("곱한 값 = " + result);
            } else if (num == 4) {
                System.out.println("두 수를 차례대로 입력하세요");
                long a = sc.nextInt();
                long b = sc.nextInt();

                long result = c1.div(a, b);
                System.out.println("나눈 값 = " + result);
            } else if (num == 5) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}


