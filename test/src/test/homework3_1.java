package home_work2;

import java.util.Scanner;

public class homework3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		
		String name;
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0;
		
		System.out.print("Enter Name :");
		name=scan.nextLine();
		
		for(int i=0;i<name.length();i++){
			String s=name.substring(i,i+1);
		if(s.equals("A")){a1+=1;}
		else  if(s.equals("E")){a2+=1;}
		else if(s.equals("I")){a3+=1;}
		else if(s.equals("O")){a4+=1;}
		else if(s.equals("U")){a5+=1;}
		else if(s.equals("a")){a6+=1;}
	    else if(s.equals("e")){a7+=1;}
		else if(s.equals("i")){a8+=1;}
		else if(s.equals("o")){a9+=1;}
		else if(s.equals("u")){a10+=1;}
		
		System.out.println(s);
		}
		System.out.println("Show name : "+name);
		System.out.println(" A : "+a1);
		System.out.println(" E : "+a2);
		System.out.println(" I : "+a3);
		System.out.println(" O : "+a4);
		System.out.println(" U : "+a5);
		System.out.println(" a : "+a6);
		System.out.println(" e : "+a7);
		System.out.println(" i : "+a8);
		System.out.println(" o : "+a9);
		System.out.println(" u : "+a10);


	}

}
