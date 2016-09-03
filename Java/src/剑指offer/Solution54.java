package 剑指offer;

public class Solution54 {
    private static int index=0;
    public boolean isNumeric(char[] str) {
        if(str.length > 0){
             index= 0;
            if(str[index] == '-' || str[index] == '+'){
                index ++;
            }
            if(index < str.length){
                index = zhengshu(str);
                if(index == str.length)return true;
                if(str[index] == '.'){
                    index ++;
                    if(index ==str.length) return false;
                    index = zhengshu(str);
                    if(index == str.length)return true;
                    if(str[index] == '.')return false;
                    else if(str[index] == 'e' || str[index] == 'E'){
                        index ++;
                        if(index == str.length) return false;
                        if(str[index] == '+' || str[index] == '-'){
                            index ++;
                        }
                        if(index == str.length) return false;
                        index = zhengshu(str);
                        if(index ==str.length) return true;
                    }else{
                        if(index == str.length)return true;
                        else return false;
                    }
                }else if(str[index] == 'e' || str[index] == 'E'){
                    index ++;
                    if(index == str.length) return false;
                    if(str[index] == '+' || str[index] == '-'){
                        index ++;
                    }
                    if(index == str.length) return false;
                     
                    index = zhengshu(str);
                    if(index ==str.length) return true;
                }
                return false;
                 
            }              
             
        }
        return false;
    }
     
    private static int zhengshu(char[] str) {
        while(index < str.length && str[index] >='0' && str[index]<='9'){
            index ++;
             
        }      
        return index;
    }
     
     
}

