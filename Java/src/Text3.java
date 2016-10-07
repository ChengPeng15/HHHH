public class Text3 {
    static int i=47;    //静态方法共用内存
    public void call(){
        System.out.println("调用call方法");
        for(i=0;i<3;i++){
            System.out.print(i+" ");
            if(i==2){
                System.out.println();
            }
        }
    }
     
    public static int getI() {
        return i;
    }
 
    public static void setI(int i) {
        Text3.i = i;
    }
 
    public Text3(){
         
    }
    public static void main(String[] args) {
        Text3 t1=new Text3();
        Text3 t2=new Text3();
        Text3.setI(60);        //这里有警告
        Text3.i++;
        System.out.println("第一个实例对象调用变量i的结果为i="+Text3.getI());//这里有警告
        t1.call();    //调用call方法后，i的值变成了3
        Text3.i++;
        System.out.println("第二个实例对象调用变量i的结果为i="+Text3.getI());//这里有警告
        t2.call();
    }
}