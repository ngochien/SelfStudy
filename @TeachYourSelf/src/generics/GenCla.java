package generics;

public class GenCla<T extends Number> {

	private T i, j;
	
	public GenCla(T i, T j) {
		this.i = i;
		this.j = j;
	}
	
	public int pl() {
		if (getClass().getName().equals("Integer")) {
			return (Integer)i+(Integer)j;
		}
		return 0;
	}
	
	public static void main(String[] args) {

	}

}
