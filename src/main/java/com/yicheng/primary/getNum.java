package com.yicheng.primary;

import java.util.Random;

/**
 * @author 张艺成
 * @date 2020/12/2 0002 18:15
 */
public class getNum {

    // 获取2到9的个位数
    static int getOne() {
        return new Random().nextInt(8) + 2;
    }

    // 获取两位数（不能被10整除）
    static int getTwo() {
        int result = new Random().nextInt(89) + 11;
        return result % 10 == 0 ? getTwo() : result;
    }

    // 获取表内两位数(10-81)
    static int getTwoInTable() {
        int result = new Random().nextInt(72) + 10;
        return result;
    }

    // 获取三位数（不能被10整除）
    static int getThree() {
        int result = new Random().nextInt(899) + 101;
        return result % 10 == 0 ? getThree() : result;
    }

    // 获取两位数（必须被10整除）
    static int getTwoAnd10s() {
        int result = new Random().nextInt(90) + 10;
        return result % 10 != 0 ? getTwoAnd10s() : result;
    }

    // 获取三位数（必须被10整除）
    static int getThreeAnd10s() {
        int result = new Random().nextInt(900) + 100;
        return result % 10 != 0 ? getThreeAnd10s() : result;
    }
}
