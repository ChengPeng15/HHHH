package dddddd;


import java.util.Scanner;

class Test {
}

public class Main {
	private static int count(int n) {
        if(n <= 1 || n >= 65536){
            return -1;
        }
        int count = 0;
        while(n != 1){
            if(n % 2 == 1){
                n -= 1;
                count++;
            }else{
                n =n >>1;
                count++;
            }
        }
        return count;
    }

	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			System.out.println(count(n));
		}
		cin.close();
	}

}

