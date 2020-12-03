package com.yicheng.primary;

import java.util.Random;

import static com.yicheng.primary.GetQuestion.*;

/**
 * @author 张艺成
 * @date 2020/12/3 0003 10:22
 */
public class ClassTwo {
    public static void main(String[] args) {
        int j = 0;
        int random;
        for (int i = 0; i < 900; i++) {
            random = new Random().nextInt(7);
            switch (random) {
                case 0:
                    System.out.print(getMulInTable());
                    break;
                case 1:
                    System.out.print(getDivInTable());
                    break;
                case 2:
                    System.out.print(getTwoAddTwo());
                    break;
                case 3:
                    System.out.print(getTwoSubTwo());
                    break;
                case 4:
                    System.out.print(getTwoAddTwoContinue());
                    break;
                case 5:
                    System.out.print(getTwoSubTwoContinue());
                    break;
                case 6:
                    System.out.print(getTwoDivOneWithRemainder());
                    break;
            }
            j++;
            while (j == 3) {
                System.out.println();
                j = 0;
            }
        }
    }
}
