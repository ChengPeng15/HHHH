package 华为;

import java.util.Scanner;

//输入字符串，去掉重复的字符，并按ASSIC码值排序
public class quChong {

  public static void main(String arg[]){
      Scanner cin = new Scanner(System.in);
      String str = cin.nextLine();
      char c[] = str.toCharArray();
      int count=0;
      int flag=0;
      for(int i=0;i<c.length-count;i++){
          char temp;            
          if(count>i&&flag==1){
              i=0;
          }else if(count<=i&&flag==1){
              i=i-count;
          }
          temp = c[i];
          flag = 0;
          for(int j =i+1;j<c.length-count;j++){
              if(temp==c[j]){            
                  for(int z =i;z<c.length-count-1;z++){
                      c[z]=c[z+1];
                  }
                  count++;
                  flag=1;
                  break;
              }
          }        
      }
      for(int i=0;i<c.length-count;i++){
          for(int j=0;j<c.length-count-1;j++){
              char temp;
              if(c[j]>c[j+1]){
                  temp=c[j];
                  c[j]=c[j+1];
                  c[j+1]=temp;
              }
          }
      }
      for(int i=0;i<c.length-count;i++){
          System.out.print(c[i]);
      }
      
      
  }
}