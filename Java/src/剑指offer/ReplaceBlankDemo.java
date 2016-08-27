package 剑指offer;

/*
 * 第四题替换空格
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，
 * 当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
	public class ReplaceBlankDemo {

		public String replaceSpace(StringBuffer str){
			
			int spaceNum =0;
	        for(int i=0;i<str.length();i++){
	        	if(str.charAt(i)==' '){
	        		spaceNum++;
	        	}
	        }
	        int indexOld = str.length()-1;
	        int indexNew = indexOld+2*spaceNum;
	        str.setLength(indexNew+1);
	        while (indexOld>=0) {
				if(str.charAt(indexOld)==' '){
					str.setCharAt(indexNew--, '0');
					str.setCharAt(indexNew--, '2');
					str.setCharAt(indexNew--, '%');

				}else{
					str.setCharAt(indexNew--, str.charAt(indexOld));
				}
				indexOld--;
			}			
			
			return str.toString();
		}
		public static void main(String[] args) {
			StringBuffer str = new StringBuffer();
			str.append("We are happy");
			System.out.println(new ReplaceBlankDemo().replaceSpace(str));
			System.out.println(str.toString());
		}
	}
	

