package com.LogicalPrograms;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
        	String s= "HCL#123Technolgy@()solutions.,ltd";
			//Regular Expression
			s=s.replaceAll("[^a-zA-Z]","");
			System.out.println(s);
	}
}
