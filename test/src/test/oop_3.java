package test;
import java.util.Scanner;

public class oop_3 {
	static String Adrian = "ABCABC";
	static String Bruno  = "BABC";
	static String Goran  = "CCAABB";
	public static void main(String[] args) {
		int lan, b = 0,a = 0,c = 0, fac = 0;
		String value="";
		Scanner sc = new Scanner(System.in);
		set();
		do{
		lan = sc.nextInt();
		do{
		value = sc.nextLine();
		}while(value.length()!= lan);
		
		for(int i = 0 ; i < value.length() ; i++){
			if(Adrian.charAt(i) == value.charAt(i)) a++;
			if(Bruno.charAt(i) == value.charAt(i))  b++;
			if(Goran.charAt(i) == value.charAt(i))  c++;
		}
		fac = Re_num(a,b,c);
		System.out.println(fac);
		if(a==fac)System.out.println("Adrian");
		if(b==fac)System.out.println("Bruno");
		if(c==fac)System.out.println("Goran");
		a = b = c = 0;
		}while(lan!=0);
	}
	public static void set(){
		while(Bruno.length()<100){
			Bruno  += "BABC";	
			if(Adrian.length()<100)	Adrian += "ABCABC";	
			if(Goran.length()<100)  Goran  += "CCAABB";
		}
	}
	public static int Re_num(int a1, int a2, int a3){
		int tem = 0;
		if(tem < a1) tem = a1;
		if(tem < a2) tem = a2;
		if(tem < a3) tem = a3;
		return tem;
	}
}