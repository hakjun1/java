package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자입력 중단시 -1: ");
//        while (true) {
//            input = scanner.nextInt();
//            if (input == -1) {
//                break;
//            }
//            sum += input;
//            count++;
//        }
        while ((input = scanner.nextInt())!=-1) {
            sum+= input;
            count++;
        }

        double average = (double)sum / count;
        System.out.println("입력숫자합계 " + sum);
        System.out.println("입력숫자평균 " + average);
    }
}
