import java.util.ArrayList;

public class SetArrayList<T> extends ArrayList<T> {		//can implements all methods of arraylist
	
	public boolean add(T t) {
		if (this.contains(t)) {
			return false;
		} else {
			super.add(t);		//call super class
			return true;
		}
	}
	
	public static void main(String[] args) {
		SetArrayList<String> setList = new SetArrayList<String>();
		
		String s1 = "hi";
		String s2 = "D";
		String s3 = "D";
		
		System.out.println(setList.add(s1));
		System.out.println(setList.add(s2));
		System.out.println(setList.add(s3));
	}
	

}
