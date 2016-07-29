package 数据类型;


import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int n = 0,m = 0;
	
	      Scanner cin = new Scanner(System.in);
          m = cin.nextInt();
          n = cin.nextInt();

  		boolean have =false;
  		if(m>=100&&n<=999&&m<=n)
  		{
  			for(int i=m;i<=n;i++)
  			{
  				int a=i/100;
  				int b=i/10%10;
  				int c=i%10;
  				if(i==(a*a*a+b*b*b+c*c*c)){
  					System.out.print(i+" ");
  					have = true;
  				}
  			}
  		}
  		if(!have){
  			System.out.println("no");
  		}
  	
		
}
	
}



