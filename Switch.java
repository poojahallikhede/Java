package com.ex;
import java.util.*;

public class Switch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the + or - or * or / ");
		char opt=scan.next().charAt(0);
		switch(opt)
		{
		case '+':
			System.out.println("Addition operator");
			break;
		case '-':
			System.out.println("substract operator");
			break;
		case '*':
			System.out.println("multiplication operator");
			break;
		case '/':
			System.out.println("division operator");
			break;
			default:
				System.out.println("Idiot pls look into the msg carefully");
				break;
		}
		
		}
		
	}


