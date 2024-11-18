package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
        int digit = 1;
        int binaryResult = 0;
        int binaryValue = 1;

        while (inputNumber > 0) {
            int currentDigit = inputNumber % 10;
            if ((currentDigit % 2 == 0 && digit % 2 == 0) || (currentDigit % 2!= 0 && digit % 2!= 0)) {
                binaryResult += binaryValue;
            }
            inputNumber /= 10;
            digit++;
            binaryValue *= 2;
        }




        System.out.println(binaryResult);
    }
}
