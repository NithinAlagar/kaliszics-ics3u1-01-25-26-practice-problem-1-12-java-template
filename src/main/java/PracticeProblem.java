/**
 * File: Converting Data Types
 * Author: Nithin.A
 * Date Created: Mar 4, 2026
 * Date Last Modified: Mar 4, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		double num = input.nextDouble();
		int num1 = (int)num + 3; 
		System.out.println(num1);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = input.nextLine();
		num = num + 4;
		System.out.println(Double.parseDouble(num)+2);

	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a radius: ");
		String rad = s.nextLine();
		double radius = Double.parseDouble(rad); 
		System.out.println((radius*radius)*3.14);

	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = s.nextLine();
		Double num1 = Double.parseDouble(num);
		double num2 = Math.floor(num1*12);
		System.out.println(num2);
	}

}
