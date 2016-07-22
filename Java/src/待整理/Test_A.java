package 待整理;

import java.util.HashMap;

public class Test_A {

	public static boolean Judge(String str){
	    if(str==null||str.trim().equals("")){
	        return false;
	    }
	    HashMap<Character , Character> Brackets=new HashMap<Character, Character>();
	    Brackets.put('(', ')');
	    Brackets.put('{', '}');
	    Brackets.put('[', ']');
	    char ch[] =str.toCharArray();
	    int length = ch.length;
	    if(length%2!=0){
	        return false;
	    }
	    for(int i = 0 ; i<length/2 ;i++ ){
	        try{
	            if(Brackets.get(ch[i])!=ch[length-i-1]){
	                return false;
	            }
	        }catch(Exception e){
	            return false;
	        }
	    }
	    return true;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


