package programs;

public class StarProgram {

	public static void main(String[] args) {

		for (int j = 0; j < 6; j++) {

			for (int i = 0; i < j; i++) {
				System.out.print(" * "); //print 5 stars
			}
			System.out.println();//print in new line
		}
	}
}


//first print one star for i and j=0
//increment j
//so j is 2 now
//print * for j value i.e 2 times
//in similar way print * for j iterations
//based on j value print i stars

