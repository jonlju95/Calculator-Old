package se.ec.jonatan.first_app;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		ArrayList<Double> ns = new ArrayList<Double>();
		boolean quit = false;
		boolean more = true;
		System.out.println("Enter numbers and finish with an operation:");
		while(quit!=true) {
			while(more) {
				String temp = in.nextLine();
				if(temp.equals("+")) {
					more = false; 
					System.out.println("\n" + "Answer: " + addition(ns));
					break;
				}
				else if(temp.equals("-")) {
					more = false;
					System.out.println("\n" + "Answer: " + subtraction(ns));
				    break;
				}
				else if(temp.equals("*")) {
					more = false; 
					System.out.println("\n" + "Answer: " + multiplication(ns));
				    break;
				}
				else if(temp.equals("/")){
					more = false;
					if(division(ns)==0) {
						System.out.println("\nUndefined");
					}
					else {
						System.out.println("\n" + "Answer: " + division(ns));
					}
				    break;
				}
				ns.add(Double.parseDouble(temp));
			}
				
			System.out.println("\n" + "Do you want to continue? If no, type Exit!"
							 + " Otherwise, press enter.");
			answer = in.nextLine();
			if(answer.equals("Exit") || answer.equals("exit")) {
				quit = true;
				System.out.println();
			}
			else {
				ns.clear();
				System.out.println("Enter numbers and finish with an operation:");
				more = true;
			}
		}
		System.out.println("Program Ended!");
		in.close();
	}
	
	public static double addition(ArrayList<Double> calc) {
		double result = 0;
		for(int i=0; i<calc.size(); i++) {
			result += calc.get(i);
		}
		return result;
	}
	
	public static double subtraction(ArrayList<Double> calc) {
		double result = calc.get(0);
		for(int i=1; i<calc.size(); i++) {
			result -= calc.get(i);
		}
		return result;
	}
	
	public static double multiplication(ArrayList<Double> calc) {
		double result = calc.get(0);
		for(int i=1; i<calc.size(); i++) {
			result *= calc.get(i);
		}
		return result;
	}
	
	public static double division(ArrayList<Double> calc) {
		double result = calc.get(0);
		for(int i=1; i<calc.size(); i++) {
			if(calc.get(i)==0) {
				return 0;
			}
			result /= calc.get(i);
		}
		return result;
	}
}