package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            arrayList.add(input);
            // sum += input;
        }

        for (Integer num : arrayList) {
            sum += num;
        }
        double average = (double) sum / arrayList.size();
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
