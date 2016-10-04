package jjjjj;

public class TestA {
    public static void main(String[] args) {
        TestA ta = new TestA( );
        ta.a( );
    }
    public void a( ) {
        int i = 99;
        A a = new A( );
        a.i = 30;
        another(a, i);
        System.out.println(a.i);
    }
    public void another(A a, int i) {
        i = 0;
        a.i = 20;
        A a1 = new A( );
        a = a1;
        System.out.println(a.i + " " + i);
    }
}
 class A {
    public int i = 10;
}

