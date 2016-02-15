package home_work2;
import javax.swing.JOptionPane;
public class H3 {
	static String Adrian = "ABCABC";
	static String Bruno  = "BABC";
	static String Goran  = "CCAABB";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int lan, b = 0,a = 0,c = 0, fac = 0;
		String value="", show="";
		set();
		do{
		lan = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number "));
		if(lan==0) break;
		do{
		value = JOptionPane.showInputDialog(null," ");
		}while(value.length()!= lan);
		
		for(int i = 0 ; i < value.length() ; i++){
			if(Adrian.charAt(i) == value.charAt(i)) a++;
			if(Bruno.charAt(i) == value.charAt(i))  b++;
			if(Goran.charAt(i) == value.charAt(i))  c++;
		}
		
		fac = Re_num(a,b,c);
		show+=fac+"\n";
		if(a==fac)show+="Adrian\n";
		if(b==fac)show+="Bruno\n";
		if(c==fac)show+="Goran\n";
		JOptionPane.showMessageDialog(null,show,"",1);
		a = b = c = 0;
		
		}while(true);
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
