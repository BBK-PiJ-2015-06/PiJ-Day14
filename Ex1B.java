public class Ex1B {
	public static void main(String[] args) {
		Ex1B test = new Ex1B();
		test.launch();
	}
	
	public void launch() {
		//System.out.println(mcCarthy91(50));
		//System.out.println(mcCarthy91(73));
		System.out.println(mcCarthy91(50));
	}
	
	public int mcCarthy91(int n) {
		System.out.println("Calling with n=" + Integer.toString(n));
		if (n > 100) {
			System.out.println("returning " + Integer.toString(n-10));
			return n - 10;
		} else {
			System.out.println("returning m91(m91(" + Integer.toString((n+11)) +"))");
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
}
