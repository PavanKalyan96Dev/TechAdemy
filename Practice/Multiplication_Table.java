package com.loops;
import java.util.Scanner;
public class Multiplication_Table
{

	
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		
		System.out.println("enter the table number");
		int n=S.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d*%d=%d",n,i,n*i).println();
		}
	}

}
/*
 * 
 *
 
 enter the table number
6
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54
6*10=60

*/
