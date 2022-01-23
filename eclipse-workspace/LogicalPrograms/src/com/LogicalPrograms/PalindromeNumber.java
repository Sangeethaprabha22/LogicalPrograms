package com.LogicalPrograms;

public class PalindromeNumber {
public static void main(String[] args) {
	int a=1234;
	int sum=0;
		while (a>0) {
		int b= a/10;
		int c=a%10;
		a=b;
		sum=c+(sum*10);
	}
	System.out.println(sum);
}
}
