package 爱奇艺;

import java.util.Scanner;

public class zifuchuang {
	 ;
	 public static void main(String[] args) {
	  // TODO 自动生成方法存根
	  
	  char ss;
	        Scanner cin=new Scanner(System.in);
	        String str,b="",c,d="";
	        str=cin.nextLine();
	        char []s;
	        s=new char[str.length()];
	        for(int i=0;i<s.length;i++){
	         s[i]=str.charAt(i);
	       }
	        for(int j=0;j<str.length();j++)
	         for(int k=j+1;k<str.length();k++){
	          
	          if(s[j]>s[k]){
	           
	          ss=s[j];
	          s[j]=s[k];
	          s[k]=ss;
	           
	          }
	          
	         }
	        for(int q=0;q<str.length();q++){
	         
	         
	         b+=s[q];
	         
	        }
	        System.out.println(b);
	        c=cin.next();
	        for(int q=0;q<str.length();q++){
	         if(str.charAt(q)==c.charAt(0)){
	          
	          d+=q;
	         }
	        }
	        System.out.println(d);
	 }
	}