package com.yicheng.primary;

import java.util.Random;

import static com.yicheng.primary.GetQuestion.*;

public class ClassThree {
    public static void main(String[] args) {
        int j = 0;
        int random;
        for (int i = 0; i < 1000; i++) {
            random = new Random().nextInt(7);
            switch (random) {
                case 0:
                    System.out.print(getThreeAddTwo());
                    break;
                case 1:
                    System.out.print(getThreeSubTwo());
                    break;
                case 2:
                    System.out.print(getThreeMulOne());
                    break;
                case 3:
                    System.out.print(getThreeAddThree());
                    break;
                case 4:
                    System.out.print(getThreeSubThree());
                    break;
                case 5:
                    System.out.print(getThreeDivOne());
                    break;
                case 6:
                    System.out.print(getTwoMulTwoAndOne10s());
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
