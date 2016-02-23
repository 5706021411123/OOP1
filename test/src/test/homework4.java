package home_work2;
import javax.swing.*;

public class homework4 {
	static JTextArea hj,mj;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hj = new JTextArea(40,70);
		mj = new JTextArea();
		String menu;
		menu=JOptionPane.showInputDialog(null,"Enter Menu Program Grade \n"+"1. Sec.3 \n"+
		"2. Sec.4 \n"+"3. Sec.5 \n"+"4. Exit \n","Program Grade ",1);
		switch(menu){
		case "1" : sec3(); break;
		case "2" : sec4(); break;
		case "3" : sec5();break;
		}
	}
	public static void sec3(){
		String n1="Index\tHomeWork\tMidterm\tFanal\tAssiment\tTotal\tGrade\n";
		String n2,n3,n4,g="";
		n2=n3=n4=n1;
		int s=0;
		int h=0,m=0,f=0,a=0;
		JTextArea fj = new JTextArea();
		s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Count Student"));
		int Hw[][] =  new int[s][5];
		int mid[][] =  new int[s][5];
		int fanal[][] =  new int[s][5];
		int Assi[][] =  new int[s][5];
		int sum[] =  new int  [s];
		String Grade[]= new String [s];
		boolean ck;
		for(int i=0;i<s;i++){
				do{
				h=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter HomeWork "+(i+1),"Sec3. "+"Suident "+(i+1),1));
				if(h<0||h>=21)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 20 ","Error",1);
				}while(h<0||h>=21);
				do{
				m=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Mid "+(i+1),"Sec3. "+"Suident "+(i+1),1));
				if(m<0||m>=31)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 30 ","Error",1);
				}while(m<0||m>=31);
				do{
				f=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Fanal "+(i+1),"Sec3. "+"Suident "+(i+1),1));
				if(f<0||f>=31)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 30 ","Error",1);
				}while(f<0||f>=31);
				do{
				a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Assiment "+(i+1),"Sec3. "+"Suident "+(i+1),1));
				if(a<0||a>=21)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 20 ","Error",1);
				}while(a<0||a>=21);
			Hw[i][0]=h;
			Hw[i][1]=m;
			Hw[i][2]=f;
			Hw[i][3]=a;
		sum[i]+=(Hw[i][0]+Hw[i][1]+Hw[i][2]+Hw[i][3]);
		if(sum[i]>=80&&sum[i]<=100){
			g=" Grade A ";
		}
		else if(sum[i]>=70&&sum[i]<=79){
			g=" Grade B ";
		}
		else if(sum[i]>=60&&sum[i]<=69){
			g=" Grade C ";
		}
		else if(sum[i]>=50&&sum[i]<=59){
			g=" Grade D ";
		}
		else 
			g=" Grade F ";
		Grade[i]=g;
			}
		for(int i=0;i<s;i++){
		n1+=(i+1)+"\t"+Hw[i][0]+"\t"+Hw[i][1]+"\t"+Hw[i][2]+"\t"+Hw[i][3]+"\t"+sum[i]+"\t"+Grade[i]+
		"\n";
		}
		hj.setText(n1);
		JOptionPane.showMessageDialog(null,hj,"Show Score ",-1);
	}
	public static void sec4(){
		String n1="Index\tHomeWork\tMidterm\tFanal\tAssiment\tPoint\tTotal\tGrade\n";
		String n2,n3,n4,g="";
		n2=n3=n4=n1;
		int s=0;
		int h=0,m=0,f=0,a=0,j=0;
		JTextArea fj = new JTextArea();
		s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Count Student"));
		int Hw[][] =  new int[s][5];
		int mid[][] =  new int[s][5];
		int fanal[][] =  new int[s][5];
		int Assi[][] =  new int[s][5];
		int sum[] =  new int  [s];
		int Point[][] =  new int  [s][2];
		String Grade[]= new String [s];
		boolean ck;
		for(int i=0;i<s;i++){
				do{
				h=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter HomeWork "+(i+1),"Sec4. "+"Suident "+(i+1),1));
				if(h<0||h>=21)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 20 ","Error",1);
				}while(h<0||h>=21);
				do{
				m=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Mid "+(i+1),"Sec4. "+"Sec4. "+"Suident "+(i+1),1));
				if(m<0||m>=31)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 20 ","Error",1);
				}while(m<0||m>=31);
				do{
				f=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Fanal "+(i+1),"Sec4. "+"Suident "+(i+1),1));
				if(f<0||f>=31)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 20 ","Error",1);
				}while(f<0||f>=31);
				do{
				a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Assiment "+(i+1),"Sec4. "+"Suident "+(i+1),1));
				if(a<0||a>=16)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 15 ","Error",1);
				}while(a<0||a>=16);
				do{
					j=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Points "+(i+1),"Sec4. "+"Suident "+(i+1),1));
					if(j<0||j>=6)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 5 ","Error",1);
					}while(j<0||j>=6);
			Hw[i][0]=h;
			Hw[i][1]=m;
			Hw[i][2]=f;
			Hw[i][3]=a;
			Point[i][0]=j;
		sum[i]+=(Hw[i][0]+Hw[i][1]+Hw[i][2]+Hw[i][3]+Point[i][0]);
		if(sum[i]>=80&&sum[i]<=100){
			g=" Grade A ";
		}
		else if(sum[i]>=70&&sum[i]<=79){
			g=" Grade B ";
		}
		else if(sum[i]>=60&&sum[i]<=69){
			g=" Grade C ";
		}
		else if(sum[i]>=50&&sum[i]<=59){
			g=" Grade D ";
		}
		else 
			g=" Grade F ";
		Grade[i]=g;
			}
		for(int i=0;i<s;i++){
		n1+=(i+1)+"\t"+Hw[i][0]+"\t"+Hw[i][1]+"\t"+Hw[i][2]+"\t"+Hw[i][3]+"\t"+Point[i][0]+"\t"+sum[i]+"\t"+Grade[i]+
		"\n";
		}
		hj.setText(n1);
		JOptionPane.showMessageDialog(null,hj,"Show Score ",-1);
	}

	public static void sec5(){
		String n1="Index\tHomeWork\tMidterm\tFanal\tAssiment\tPoint\tTotal\tGrade\n";
		String n2,n3,n4,g="";
		n2=n3=n4=n1;
		int s=0;
		int h=0,m=0,f=0,a=0,j=0,t=0;
		JTextArea fj = new JTextArea();
		s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Count Student"));
		int Hw[][] =  new int[s][5];
		int mid[][] =  new int[s][5];
		int fanal[][] =  new int[s][5];
		int Assi[][] =  new int[s][5];
		int sum[] =  new int  [s];
		int Point[][] =  new int  [s][2];
		int Test[][] =  new int  [s][2];
		String Grade[]= new String [s];
		boolean ck;
		for(int i=0;i<s;i++){
				do{
				h=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter HomeWork "+(i+1),"Sec5. "+"Suident "+(i+1),1));
				if(h<0||h>=11)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 10 ","Error",1);
				}while(h<0||h>=11);
				do{
				m=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Mid "+(i+1),"Sec5. "+"Suident "+(i+1),1));
				if(m<0||m>=31)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 20 ","Error",1);
				}while(m<0||m>=31);
				do{
				f=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Fanal "+(i+1),"Sec5. "+"Suident "+(i+1),1));
				if(f<0||f>=31)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 20 ","Error",1);
				}while(f<0||f>=31);
				do{
				a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Assiment "+(i+1),"Sec5. "+"Suident "+(i+1),1));
				if(a<0||a>=65)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 15 ","Error",1);
				}while(a<0||a>=16);
				do{
					j=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Points "+(i+1),"Sec5. "+"Suident "+(i+1),1));
					if(j<0||j>=6)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 5 ","Error",1);
					}while(j<0||j>=6);
				do{
					t=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Test Point "+(i+1),"Sec5. "+"Suident "+(i+1),1));
					if(t<0||t>=11)JOptionPane.showMessageDialog(null, "กรอกตัวเลขเกิน ตัวเลขห้ามเกิน 10 ","Error",1);
					}while(t<0||t>=11);
			Hw[i][0]=h;
			Hw[i][1]=m;
			Hw[i][2]=f;
			Hw[i][3]=a;
			Point[i][0]=j;
			Test[i][0]=t;
		sum[i]+=(Hw[i][0]+Hw[i][1]+Hw[i][2]+Hw[i][3]+Point[i][0]);
		if(sum[i]>=80&&sum[i]<=100){
			g=" Grade A ";
		}
		else if(sum[i]>=70&&sum[i]<=79){
			g=" Grade B ";
		}
		else if(sum[i]>=60&&sum[i]<=69){
			g=" Grade C ";
		}
		else if(sum[i]>=50&&sum[i]<=59){
			g=" Grade D ";
		}
		else 
			g=" Grade F ";
		Grade[i]=g;
			}
		for(int i=0;i<s;i++){
		n1+=(i+1)+"\t"+Hw[i][0]+"\t"+Hw[i][1]+"\t"+Hw[i][2]+"\t"+Hw[i][3]+"\t"+Point[i][0]+"\t"+sum[i]+"\t"+Grade[i]+
		"\n";
		}
		hj.setText(n1);
		JOptionPane.showMessageDialog(null,hj,"Show Score ",-1);
	}

}
