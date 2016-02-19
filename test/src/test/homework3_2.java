package home_work2;

import java.util.Scanner;

public class homework3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		long num,d=0,h,c,s,s1=0,count=0,min=0,hose=0;
		
		System.out.print("Enter Count time :");
		num=scan.nextLong();
		
		s=num*86400;
		
		System.out.println("Show Time "+num+" วัน  "+s+" วินาที ");
	
		System.out.print("Enter Sec: ");
		c=scan.nextLong();
		while(true){
		if(c>86400)	{
		c=c-86400;	
		count++;}
		else if (c<86400 && c>=60) {
			while(true){
			if(c>=3600){	
			hose++;
			c-=3600;
			}
			else if(c<3600&&c>=60){
			min++;
			c-=60;
			}
			else break;	
		}
		}
		else break;
		}	
		System.out.println("Show Time "+count+" วัน  "+hose+" ชั่วโมง  "+min+" นาที  "+c+" วินาที ");
	}

}