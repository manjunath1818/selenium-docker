package programs;

public class NestedLoopUsingWhileAndForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 3) {
			System.out.println(i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("\t" + j);
			}
			i++;
			System.out.println("--------------");
		}
	}

}
