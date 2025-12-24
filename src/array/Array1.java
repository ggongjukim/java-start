package array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
//        입력받을 숫자의 개수를 입력하세요:3 3개의 정수를 입력하세요:
//        1
//        2
//        5
//        가장 작은 정수: 1 가장 큰 정수: 5
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int inputNum = scanner.nextInt();

        int[] numbers = new int[inputNum];
        numbers[0] = scanner.nextInt();
        int maxNum = numbers[0];
        int minNum = numbers[0];

        for(int i = 1; i < inputNum; i++){
            numbers[i] = scanner.nextInt();

            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
            if(numbers[i] < minNum){
                minNum = numbers[i];

            }
        }

        System.out.println("가장 작은 정수: " + minNum + " 가장 큰 점수 :" + maxNum);
    }
}
// 배열의 유효한 범위를 벗어나는 인덱스를 사용하면 어떻게 될까요? > 런타임 오류 발생
