
package home_work2;

import javax.swing.JOptionPane;
public class H1 {
	static int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String n1="";
		
		int sum=0,over=0,ck=1;
		do{
			//System.out.print("number 1.");
		a1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  1 " ));
		if(a1>99||a1<=0||Check(a1,1)==false)
			JOptionPane.showMessageDialog(null,"number 1. Error!","Error ! ",0);
		}while(a1>99||a1<=0||Check(a1,1)==false);
		do{
			a2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  2 " ));
		if(a2>99||a2<=0||Check(a2,2)==false)
			JOptionPane.showMessageDialog(null,"number 2. Error!","Error ! ",0);
		}while(a2>99||a2<=0||Check(a2,2)==false);
		
		do{
			a3=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  3 " ));
		if(a3>99||a3<=0||Check(a3,3)==false)
			JOptionPane.showMessageDialog(null,"number 3. Error!","Error ! ",0);
		}while(a3>99||a3<=0||Check(a3,3)==false);
		
		do{
			a4=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  4 " ));
		if(a4>99||a4<=0||Check(a4,4)==false)
			JOptionPane.showMessageDialog(null,"number 4. Error!","Error ! ",0);
		}while(a4>99||a4<=0||Check(a4,4)==false);
		
		do{
			a5=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  5 " ));
		if(a5>99||a5<=0||Check(a5,5)==false)
			JOptionPane.showMessageDialog(null,"number 5. Error!","Error ! ",0);
		}while(a5>99||a5<=0||Check(a5,5)==false);
		
		do{
			a6=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  6 " ));
		if(a6>99||a6<=0||Check(a6,6)==false)
			JOptionPane.showMessageDialog(null,"number 6. Error!","Error ! ",0);
		}while(a6>99||a6<=0||Check(a6,6)==false);
		
		do{
			a7=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  7 " ));
		if(a7>99||a7<=0||Check(a7,7)==false)
			JOptionPane.showInputDialog(null,"Enter Your Number  7 " );
		}while(a7>99||a7<=0||Check(a7,7)==false);
		
		do{
			a8=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  8 " ));
		if(a8>99||a8<=0||Check(a8,8)==false)
			JOptionPane.showInputDialog(null,"Enter Your Number  8 " );
		}while(a8>99||a8<=0||Check(a8,8)==false);
		
		do{
			a9=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Number  9 " ));
		if(a9>99||a9<=0||Check(a9,9)==false)
			JOptionPane.showInputDialog(null,"Enter Your Number  9 " );
		}while(a9>99||a9<=0||Check(a9,9)==false);
		
		
		sum=a1+a2+a3+a4+a5+a6+a7+a8+a9;
		over=sum-100;
		if(a1+a2==over)a1=a2=0;
		else if(a1+a3==over)a1=a3=0;
		else if(a1+a4==over)a1=a4=0;
		else if(a1+a5==over)a1=a5=0;
		else if(a1+a6==over)a1=a6=0;
		else if(a1+a7==over)a1=a7=0;
		else if(a1+a8==over)a1=a8=0;
		else if(a1+a9==over)a1=a9=0;
		
		else if(a2+a3==over)a2=a3=0;
		else if(a2+a4==over)a2=a4=0;
		else if(a2+a5==over)a2=a5=0;
		else if(a2+a6==over)a2=a6=0;
		else if(a2+a7==over)a2=a7=0;
		else if(a2+a8==over)a2=a8=0;
		else if(a2+a9==over)a2=a9=0;
		
		else if(a3+a4==over)a3=a4=0;
		else if(a3+a5==over)a3=a5=0;
		else if(a3+a6==over)a3=a6=0;
		else if(a3+a7==over)a3=a7=0;
		else if(a3+a8==over)a3=a8=0;
		else if(a3+a9==over)a3=a9=0;
		
		else if(a4+a5==over)a4=a5=0;
		else if(a4+a6==over)a4=a6=0;
		else if(a4+a7==over)a4=a7=0;
		else if(a4+a8==over)a4=a8=0;
		else if(a4+a9==over)a4=a9=0;
		
		else if(a5+a6==over)a5=a6=0;
		else if(a5+a7==over)a5=a7=0;
		else if(a5+a8==over)a5=a8=0;
		else if(a5+a9==over)a5=a9=0;
		
		else if(a6+a7==over)a6=a7=0;
		else if(a6+a8==over)a6=a8=0;
		else if(a6+a9==over)a6=a9=0;
		
		else if(a7+a8==over)a7=a8=0;
		else if(a7+a9==over)a7=a9=0;
		
		else if(a8+a9==over)a8=a9=0;
		
		else {
			JOptionPane.showMessageDialog(null,"Your Enter number Error","Error ! ",0);
			a1=a2=a3=a4=a5=a6=a7=a8=a9=ck=0;
		}
		
	if (a1!=0)n1+=a1+"\n";
	if (a2!=0)	n1+=a2+"\n";
	if (a3!=0)	n1+=a3+"\n";
	if (a4!=0)	n1+=a4+"\n";
	if (a5!=0)	n1+=a5+"\n";
	if (a6!=0)	n1+=a6+"\n";
	if (a7!=0)	n1+=a7+"\n";
	if (a8!=0)	n1+=a8+"\n";
	if (a9!=0)	n1+=a9+"\n";
	if(ck==1)	

	JOptionPane.showMessageDialog(null,n1,"Show Value ",1);
	}
		
	public static boolean Check(int n,int s){
	boolean  	n1=true;
		
	if (a1==n&&s!=1)n1=false;
	else if (a2==n&&s!=2)n1=false;
	else if (a3==n&&s!=3)	n1=false;
	else if (a4==n&&s!=4)	n1=false;
	else if (a5==n&&s!=5)	n1=false;
	else if (a6==n&&s!=6)	n1=false;
	else if (a7==n&&s!=7)	n1=false;
	else if (a8==n&&s!=8)n1=false;
	else if (a9==n&&s!=9)	n1=false;

		
		
		return (n1);
		
	}
	


}
