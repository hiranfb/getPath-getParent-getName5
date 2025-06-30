package application;

import java.util.Scanner;
import java.io.File;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);

		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());

		sc.close();
	}
}