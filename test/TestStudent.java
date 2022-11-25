package com.inhr.test;

import java.util.Scanner;

import com.inhr.beans.MSc;
import com.inhr.beans.PHd;

public class TestStudent 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MSc [] msc=new MSc[2];
		PHd [] phd=new PHd[2]; 
		
		
	i:while(true)	
		{System.out.println("-------------------------------------University------------------------------------");
		System.out.println("1.Msc Students");
		System.out.println("2.Phd Students");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		System.out.println("Enter the Choice:-");
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			for(int j=0;j<msc.length;j++) {
				System.out.println("Enter the Id:-");
				int id=sc.nextInt();
				
				System.out.println("Enter the Name:-");
				sc.nextLine();
				String name=sc.nextLine   ();
				System.out.println("Enter the Address:-");
				String addr=sc.nextLine();
				System.out.println("Enter the Marks 1:-");
				int m1=sc.nextInt();
				System.out.println("Enter the Marks 2:-");
				int m2=sc.nextInt();
				System.out.println("Enter the Marks 3:-");
				int m3=sc.nextInt();
				
				
				msc[j]=new MSc(id,name,addr,m1,m2,m3);
				
				
			}
			break;
			
		case 2:
			for(int j=0;j<phd.length;j++) {
				System.out.println("Enter the Id:-");
				int id=sc.nextInt();
				System.out.println("Enter the Name:-");
		        sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter the Address:-");
				String addr=sc.nextLine();
				System.out.println("Enter the Marks 1:-");
				int m1=sc.nextInt();
				System.out.println("Enter the Marks 2:-");
				int m2=sc.nextInt();
				System.out.println("Enter the Marks 3:-");
				int m3=sc.nextInt();
				System.out.println("Enter the Special Subject:-");
				sc.nextLine();
				String spsub=sc.nextLine();
				System.out.println("Enter the Special Marks:-");
				int spmark=sc.nextInt();
				
				phd[j]=new PHd(id,name,addr,m1,m2,m3,spsub,spmark);
				
				
			}
			break;
			
			
		case 3:
			System.out.println("1.Msc students details:-");
			System.out.println("2.Phd students details:-");
			System.out.println("Enter Your choice:-");
			int ch=sc.nextInt();
			if(ch==1) {
				for(int i=0;i<msc.length;i++) {
					System.out.println(msc[i]);
				}
			}
			else if(ch==2) {
				for(int i=0;i<phd.length;i++) {
					System.out.println(phd[i]);
				}
			}
			else {
				System.out.println("Invalid");
			}
			
			break;		
		
		
		case 4:
			
			break i;	
			
		
		
		}
		}
		
		
		
	
	}
	
}
