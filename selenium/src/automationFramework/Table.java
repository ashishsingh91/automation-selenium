package automationFramework;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int a,value,sum = 0;
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
		value=a*i;	
		System.out.println(value);
		sum=sum+value;
		}
       System.out.println(sum);
	}

}
