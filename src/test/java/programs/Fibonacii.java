package programs;

public class Fibonacii {

	public static void main(String[] args) {

		
		Fibonacii obj= new Fibonacii();
		obj.fibnocci();
		// 0 1 1 2 3 5 8 11

	}

	public int fibnocci() {
		
		int n2 = 1;
		int n1 = 0;
		
		
		for (int j = 1; j <=7; j++) {
			System.out.println(""+n1+"");
			int sumPrv=n1+n2;
			n1=n2;
			n2=sumPrv;

		}
		return n1;

	}
}
