package com.yicheng.primary;

import java.util.Random;

import static com.yicheng.primary.getNum.*;

/**
 * @author 张艺成
 * @date 2020/12/2 0002 18:15
 */
public class GetQuestion {

    //获得三位数除以一位数
    static String getThreeDivOne() {
        return getThree() + "÷" + getOne() + " =            ";
    }

    // 获得三位数加三位数
    static String getThreeAddThree() {
        return getThree() + "+" + getThree() + " =          ";
    }

    // 获得三位数减三位数
    static String getThreeSubThree() {
        int left = getThree();
        int right = getThree();
        boolean flag = left - right > 0;
        return flag ? left + "－" + right + " =         " : getThreeSubThree();
    }

    // 获得三位数加两位数
    static String getThreeAddTwo() {
        return getThree() + "+" + getTwo() + " =           ";
    }

    // 获得三位数减两位数
    static String getThreeSubTwo() {
        return getThree() + "－" + getTwo() + " =          ";
    }

    // 获得三位数乘以一位数
    static String getThreeMulOne() {
        return getThree() + "×" + getOne() + " =            ";
    }

    // 获得两位数乘以两位数（不被10整除）
    static String getTwoMulTwo() {
        return getTwo() + "×" + getTwo() + " =            ";
    }

    // 获得两位数乘以两位数（其中一个被10整除）
    static String getTwoMulTwoAndOne10s() {
        return getTwo() + "×" + getTwoAnd10s() + " =            ";
    }

    // 获得表内乘法
    static String getMulInTable() {
        return getOne() + "×" + getOne() + " =              ";
    }

    // 获得表内除法
    static String getDivInTable() {
        int twoInTable = getTwoInTable();
        int one = getOne();
        if (twoInTable % one == 0 && twoInTable / one > 1 && twoInTable / one < 10)
            return twoInTable + "÷" + one + " =             ";
        return getDivInTable();
    }

    // 获得两位数加两位数
    static String getTwoAddTwo() {
        return getTwo() + "+" + getTwo() + " =            ";
    }

    // 获得两位数减两位数
    static String getTwoSubTwo() {
        int num1 = getTwo();
        int num2 = getTwo();
        if (num1 - num2 > 2)
            return num1 + "－" + num2 + " =           ";
        return getTwoSubTwo();
    }

    // 获得两位数连加
    static String getTwoAddTwoContinue() {
        return getTwo() + "+" + getTwo() + "+" + getTwo() + " =         ";
    }

    // 获得两位数连减
    static String getTwoSubTwoContinue() {
        int num1 = getTwo();
        int num2 = getTwo();
        int num3 = getTwo();
        if (num1 - num2 - num3 > 2)
            return num1 + "－" + num2 + "－" + num3 + " =       ";
        return getTwoSubTwoContinue();
    }

    // 两位数除以一位数带余数
    static String getTwoDivOneWithRemainder() {
        int two = getTwo();
        int one = getOne();
        if (two % one != 0)
            return two + "÷" + one + " =             ";
        return getTwoDivOneWithRemainder();
    }
}
