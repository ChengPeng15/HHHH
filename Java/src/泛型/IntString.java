package 泛型;

public class IntString {
	private String aa;
	private String bb;
	
	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

	public static void main(String[] args) {
		IntString convert = new IntString();
//		convert.setAa(1);
//		convert.setAa(new Integer(1).toString());
//		convert.setAa(String.valueOf(1));
		convert.setAa(Integer.toString(1));
		System.out.println(convert.getAa());

	}
	
}
