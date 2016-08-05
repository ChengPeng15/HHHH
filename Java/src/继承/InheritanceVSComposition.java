package 继承;

class Insect {
    private int size;
    private String color;
 
    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
        System.out.println("father:"+size+color);

    }
 
    public int getSize() {
        return size;
    }
 
    public void setSize(int size) {
        this.size = size;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
 
    public void move() {
        System.out.println("Move");
    }
 
    public void attack() {
        move();  //假设昆虫在攻击前必须要先移动一次
        System.out.println("Attack");
    }
}


class Bee extends Insect {
    public Bee(int size, String color) {
        super(size, color);
        System.out.println("son:"+size+color);
    }
 
    public void move() {
        System.out.println("Fly");
    }
 
    public void attack() {
        move();
        super.attack();//父类重载后，调用的子类的move方法  因为move方法也被重载了
    }
}

public class InheritanceVSComposition {
    public static void main(String[] args) {
        Insect i = new Bee(1, "red");
        i.attack();
    }
}