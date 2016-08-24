package 剑指office;

/*
 * 第四题替换空格
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，
 * 当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
	public class ReplaceBlank {
		public String replaceSpace(StringBuffer str) {
			return str.toString().replaceAll("\\s", "%20");
			}

	    public String replaceSpace1(StringBuffer str) {
	        StringBuffer out=new StringBuffer();
	        for (int i = 0; i < str.toString().length(); i++) {
	            char b=str.charAt(i);
	            if(String.valueOf(b).equals(" ")){
	                out.append("%20");
	            }else{
	                out.append(b);
	            }
	        }
	        return out.toString();     
	    }
		
	    
	    public String replaceSpace2(StringBuffer str) {
	        char[] ch = str.toString().toCharArray();
	            int spacenum = 0;
	            for(int i =0; i<ch.length; i++){
	                if(ch[i]==' '){
	                    spacenum++;
	                }
	            }
	            char[] ch1 = new char[2*spacenum + str.length()];
	            int len = 2*spacenum+str.length()-1;
	            for(int i=ch.length-1; i>=0; i--){
	                if(ch[i] != ' '){
	                    ch1[len--] = ch[i];
	                }else{
	                    ch1[len--] = '0';
	                    ch1[len--] = '2';
	                    ch1[len--] = '%';
	                }
	            }
	        return String.valueOf(ch1);
	    }
	    
	    
	    public String replaceSpace4(StringBuffer str) {
	        int spacenum = 0;//spacenum为计算空格数
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)==' ')
	                spacenum++;
	        }
	        int indexold = str.length()-1; //indexold为为替换前的str下标
	        int newlength = str.length() + spacenum*2;//计算空格转换成%20之后的str长度
	        int indexnew = newlength-1;//indexold为为把空格替换为%20后的str下标
	        str.setLength(newlength);//使str的长度扩大到转换成%20之后的长度,防止下标越界
	        for(;indexold>=0 && indexold<newlength;--indexold){ 
	                if(str.charAt(indexold) == ' '){  //
	                str.setCharAt(indexnew--, '0');
	                str.setCharAt(indexnew--, '2');
	                str.setCharAt(indexnew--, '%');
	                }else{
	                    str.setCharAt(indexnew--, str.charAt(indexold));
	                }
	        }
	        return str.toString();
	    }
		public static void main(String[] args) {
			StringBuffer str = new StringBuffer();
			str.append("We are happy");
			System.out.println(new ReplaceBlank().replaceSpace4(str));
			System.out.println(str.toString());
		}
		
		
	}
	

