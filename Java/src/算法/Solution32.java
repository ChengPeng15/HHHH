package 算法;

public class Solution32{ public int NumberOf1Between1AndN_Solution(int n) {
    if(n<0){
        return 0;
    }
    String str= Integer.toString(n);
    int result = getNumberOf1(str, 0);
    return result;
}
public static int getNumberOf1(String str,int index){
    int length = str.length()-index;
    if(length==1 && str.charAt(index)=='0'){
        return 0;
    }
    if(length==1){
        return 1;
    }
    //计算最高位的1
    int first = str.charAt(index)-'0';
    int result = 0;
    if(first>1){
        result += exp(length-1);
    }else if(first==1){
        result += 1 + Integer.parseInt(str.substring(index+1));
    }
    //计算除了最高位的其他位
    result += first *(length-1)*exp(length-2);
    //计算比如2345中0---345中1的个数进行递归
    result += getNumberOf1(str, index+1);
     
    return result;
}
public static int exp(int n){
    int result =1;
    while(n>=1){
        result*=10;
        n--;
    }
    return result;
}}