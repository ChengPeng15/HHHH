package 基础;



public class Accout {
	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println(aa.getA());
	}

}
  class AA{
		private int a=88;
		int getA() {
			return a;
		}
//		public void setA(int a) {
//			this.a = a;
//		}
}
