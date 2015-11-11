import java.util.*;

public class Ex3 {
	
	public Collection<Integer> hailstone(int n) {
		Collection<Integer> newArray = new ArrayList<Integer>();
		newArray.add(n);
		if(n == 1) {	
			return newArray;
		} else if(n % 2 == 0) {
			newArray.addAll(hailstone(n / 2));
			return newArray;
		} else {
			newArray.addAll(hailstone(3*n + 1));
			return newArray;
		}
	}
	
	public static void main(String[] args) {
		Ex3 test = new Ex3();
		test.launch();
	}
	
	public void launch() {
		Collection<Integer> myArray = hailstone(14);
		System.out.println(myArray.toString());
	}
}