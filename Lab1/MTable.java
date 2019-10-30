public class MTable{
	int mnumber;
	int r_start;
	int r_end;

	public void setm_no(int m_no){
		mnumber=m_no;
	}
	
	public void setr_s(int r_s){
		r_start=r_s;
	}
	
	public void setr_e(int r_e){
		r_end=r_e;
	}
	
	public void printTable(){
		System.out.println("Multiplication Table of "+mnumber+" from "+r_start+" to "+r_end+":");
		for(int i=r_start;i<=r_end;i++){
			System.out.println(mnumber+"x"+i+"="+mnumber*i);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		MTable three=new MTable();
		three.setm_no(3);
		three.setr_s(17);
		three.setr_e(25);
		
		MTable seventeen=new MTable();
		seventeen.setm_no(17);
		seventeen.setr_s(3);
		seventeen.setr_e(49);
		
		MTable zero=new MTable();
		zero.setm_no(0);
		zero.setr_s(1);
		zero.setr_e(5);
		
		three.printTable();
		seventeen.printTable();
		zero.printTable();
	}
}