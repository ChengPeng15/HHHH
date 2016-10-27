package 链家测试面试算法;

public class 双重while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=0;
		while(i>j){
			while(j<20&&i>j){
				j++;
			}
		}
		System.out.println(j);
	}

}
