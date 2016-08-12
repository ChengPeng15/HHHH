package 继承;
public class Demo {

    public static void main(String [] args) {
        Data d = new Data();
        d.i = 18;
        Data d1 = new Data();
        System.out.println(d1.i);
    }

}

class Data {
    int i;
    }


	class ThreadC  {
	    Data d;//？这个跟  int i   或者static那种一样？
	    public ThreadC(Data d) {
	        this.d = d;
	    }
	}
