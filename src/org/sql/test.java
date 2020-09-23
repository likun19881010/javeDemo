package org.sql;

import java.util.ArrayList;
import java.util.List;

public class test {
    
    public boolean flag(int a, int b) {
        //判断计算结果返回布尔值
        if(((a+6)*b - (a*b)==54) && ((a*b) - (a*(b-3))==36)) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        test te = new test();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numberList.add(i);
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < numberList.size(); i++) {
            a = numberList.get(i);
            for (int j = 0; j < numberList.size(); j++) {
                b = numberList.get(j);
                //如果符合条件，就打印结果
                if(te.flag(a, b)) {
                    System.out.println("长方形的长为===：" + a);
                    System.out.println("长方形的宽为===：" + b);
                    break;
                }
            }
            
        }
        
        
        
        
    }

}
