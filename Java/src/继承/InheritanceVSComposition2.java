package 继承;

interface Attack {
    public void move();
    public void attack();
}


class AttackImpl implements Attack {
    private String move;
    private String attack;
 
    public AttackImpl(String move, String attack) {
        this.move = move;
        this.attack = attack;
        System.out.println("AttackImpl");
    }
 
    @Override
    public void move() {
        System.out.println(move);
        System.out.println(attack);
    }
 
    @Override
    public void attack() {
        move();
        System.out.println(attack);
    }
}

class Insect1 {
    private int size;
    private String color;
 
    public Insect1(int size, String color) {
        this.size = size;
        this.color = color;
        System.out.println("Insect1");

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
}


//这个封装类封装了一个Attack类型的对象
class Bee1 extends Insect1 implements Attack {
 private Attack attack;

 public Bee1(int size, String color, Attack attack) {
     super(size, color);
     System.out.println("Bee1");
     this.attack = attack;
 }

 public void move() {
     attack.move();
 }

 public void attack() {
     attack.attack();
 }
}


public class InheritanceVSComposition2 {
    public static void main(String[] args) {
        Bee1 a = new Bee1(1, "black", new AttackImpl("fly", "move"));
        a.attack();
 
        // if you need another implementation of move()
        // there is no need to change Insect, we can quickly use new method to attack
        
        System.out.println("===========================================================");
        
 
        Bee1 b = new Bee1(1, "black", new AttackImpl("fly", "sting"));
        b.attack();
    }
}