package assignment3;

import java.util.Scanner;

public class IO {
	static Scanner scanner = new Scanner(System.in);
	
	public static int nextInt(String string) {
		int number = 0;
		if(!string.equals("")) {
			System.out.println(string);
		}
		if(scanner.hasNextInt()) {
			number = scanner.nextInt();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input");
			scanner.nextLine();
			number = 0;
		}
		return number;
	}
	
	public static long nextLong(String string) {
		long number = 0;
		if(!string.equals("")) {
			System.out.println(string);
		}
		if(scanner.hasNextLong()) {
			number = scanner.nextLong();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input");
			scanner.nextLine();
			number = 0;
		}
		return number;
	}
	
	public static short nextShort(String string) {
		short number = 0;
		if(!string.equals("")) {
			System.out.println(string);
		}
		if(scanner.hasNextShort()) {
			number = scanner.nextShort();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input");
			scanner.nextLine();
			number = 0;
		}
		return number;
	}
	
	public static byte nextByte(String string) {
		byte number = 0;
		if(!string.equals("")) {
			System.out.println(string);
		}
		if(scanner.hasNextByte()) {
			number = scanner.nextByte();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input");
			scanner.nextLine();
			number = 0;
		}
		return number;
	}
	
	public static double nextDouble(String string) {
		double number;
		if(!string.equals("")) {
			System.out.println(string);
		}
		if(scanner.hasNextDouble()) {
			number = scanner.nextDouble();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input");
			scanner.nextLine();
			number = 0.0;
		}
		return number;
	}

	public static float nextFloat(String string) {
		float number = 0.0f;
		if(!string.equals("")) {
			System.out.println(string);
		}
		if(scanner.hasNextFloat()) {
			number = scanner.nextFloat();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input");
			scanner.nextLine();
			number = 0.0f;
		}
		return number;
	}
	
	public static String nextLine(String string) {
		String value = "";
		if(!string.equals("")) {
			System.out.println(string);
		}
		value = scanner.nextLine();
		return value;
	}
	
	public static Boolean nextBoolean(String string) {
		Boolean value = false;
		if(!string.equals("")) {
			System.out.println(string);
		}
		if(scanner.hasNextBoolean()) {
			value = scanner.nextBoolean();
			scanner.nextLine();
		} else {
			System.out.println("Invalid input");
			scanner.nextLine();
			value = false;
		}
		return value;
	}
}
