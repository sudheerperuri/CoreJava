interface Bill{
	
	double PUC = 5.0;
	double calBill(int units);
	
}
abstract class Display implements Bill {
	
	public void displayBill(double amount) {
		
		System.out.println("Bill amount is = "+ amount);
	}
	
}

 class Ebill extends Display{
	 
	 public double calBill(int units) {
		 
		 return units * PUC;
	 }
 }
class Wbill extends Display{

	public double calBill(int units) {
		
		return units * PUC;
	}
}


public class BillPayment {

	public static void main(String[] args) {
		
		Display d = new Ebill();
		double ele = d.calBill(510);
		d.displayBill(ele);
		
		
		Display f = new Wbill();
		double water = f.calBill(3000);
		f.displayBill(water);

	}

}
