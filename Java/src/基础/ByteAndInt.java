package 基础;

public class ByteAndInt {
	/**
	*将32位的int值放到4字节的byte数组
	* @param num
	* @return
	*/
	public static byte[] intToByteArray(int num){
	   byte[]result = new byte[4];
	   result[0]=(byte)(num>>>24);//取最高8位放到0下标
	   result[1]=(byte)(num>>>16);//取次高8为放到1下标
	   result[2]=(byte)(num>>>8);//取次低8位放到2下标
	   result[2]=(byte)(num);//取最低8位放到3下标
	   return result;
	}

	/**
	* 将4字节的byte数组转成一个int值
	* @param b
	* @return
	*/
	public static int byteArrayToInt(byte[]b){
	    byte[]a = new byte[4];
	    int i = a.length-1;
	    int j =b.length-1;
	    for (;i>=0;i--,j--){//从b的尾部(即int值的低位)开始copy数据
	        if(j>=0)
	            a[i]=b[j];
	        else
	            a[i]=0;//如果b.length不足4,则将高位补0
	  }
	    int v0=(a[0]&0xff)<<24;//&0xff将byte值无差异转成int,避免Java自动类型提升后,会保留高位的符号位
	    int v1=(a[1]&0xff)<<16;
	    int v2=(a[2]&0xff)<<8;
	    int v3=(a[3]&0xff);
	    return v0+v1+v2+v3;
	}

}
