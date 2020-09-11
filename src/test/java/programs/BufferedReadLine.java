package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a character:");
		char ch=(char) br.read();
		System.out.println("you enetred a charcter :" +ch);
		
		System.out.println("Enter the string:");
		String name = br.readLine();
		System.out.println("The entered string is "+name);

	}

}
