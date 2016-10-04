package 爱奇艺;

public class er{
    public static void main(String[] args) {   
        Object o = new Object() {  
             public boolean equals(Object obj) {  
                 return true; 
         }
     };   
     System.out.println(o.equals("hello"));
     }
}