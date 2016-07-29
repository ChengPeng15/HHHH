package 算法;

import java.util.Scanner;

public class 求和 {

	public static void main(String[] args) {
	      double m,n;
	      double sum = 0;
	      double temp = 0;
	      Scanner cin = new Scanner(System.in);
	      
	      while(cin.hasNextDouble()){
	    	  m = cin.nextDouble();
	    	  n = cin.nextDouble();
	    	  cin.nextLine();
	    	  if((m<10000)&&(n<1000)){
		    	  for(int i = 0; i < n; i++){
		                  sum += m;
		                  temp = Math.sqrt(m);
		                  m = temp;
		            }
	            System.out.println(String.format("%.2f", sum));
	            sum = 0;
	            }
	    	  else{
	    		  System.out.println("输入的m和n不满足条件，请重新输入");
	    		  continue;
	    	  }
	      }
}

}

