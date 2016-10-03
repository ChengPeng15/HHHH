package 算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**

 * Created by cuibin on 16/9/16.

 * 华为2016第一题

 *

 */
public class sortstring2 {
     public static void main(String args[]){
        //存储输入的数字


        ArrayList<Integer> InputNums = new ArrayList<Integer>();

        Scanner cin = new Scanner(System.in);

        //限定输入数字个数


        int n = cin.nextInt();
        while(n-- > 0){
            int m = cin.nextInt();
            //获取数字
//            9 4 6 2 3 6 7 8 1 12

//            2 7 4 6 6 3 8 1 12 

            InputNums.add(m);
        }

        //对奇数位进行正序排序


        for(int i = 0 ; i < InputNums.size(); i = i + 2){
            for(int j = i ; j < InputNums.size() ; j = j + 2){
                int temp;
                if(InputNums.get(j) < InputNums.get(i)){
                    temp = InputNums.get(j);
                    InputNums.set(j , InputNums.get(i));
                    InputNums.set(i , temp);
                }
            }
        }

        //对偶数位进行逆序排序


        for(int i = 1 ; i < InputNums.size(); i = i + 2){
            for(int j = i ; j < InputNums.size() ; j = j + 2){
                int temp;
                if(InputNums.get(j) > InputNums.get(i)){
                    temp = InputNums.get(j);
                    InputNums.set(j , InputNums.get(i));
                    InputNums.set(i , temp);
                }
            }
        }

        //输出排序后的集合

        String print ="";
        for(int i  = 0 ; i < InputNums.size() ; i++){
           
           print +=InputNums.get(i) + " ";
           
        }
        print=print.substring(0,print.length()-1);
        System.out.println(print.length());

    }
  
}
