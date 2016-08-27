package 剑指offer;

/*
 * 第四题替换空格
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，
 * 当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
	public class ReplaceBlankTest {
//	    public String replaceSpace(StringBuffer str) {
//	        if(str==null){
//	            return null;
//	        }
//	       StringBuilder newStr = new StringBuilder();
//	        for(int i=0;i<str.length();i++){
//	            if(str.charAt(i)==' '){
//	                newStr.append('%');
//	                newStr.append('2');
//	                newStr.append('0');
//	            }else{
//	                newStr.append(str.charAt(i));
//	            }
//	        }
//	        return newStr.toString();
//	    }
//	    
	    
	  public String replaceSpace(StringBuffer str) {
	    if(str==null)
	     {
	        return null;
	     }
	     for(int i=0;i<str.length();i++)
	     {
	         char c = str.charAt(i);
	         if(c==' ')
	         {
	            str.replace(i,i+1,"%20");
	         }
	      }
	      String newstr = str.toString();
	      return newstr;   
	    }
	    public static void main(String[] args) {
//	    	StringBuffer str = new StringBuffer("We are happy.");
//	    	System.out.println(new ReplaceBlank().replaceSpace(str));
//	    	System.out.println(str.toString());
	    	   String s = "This is my original string ,it is very good!";
	    	   String r = "at";
	    	   s = s.replace("is",r);
	    	   System.out.println(s);
		}
	}
	

