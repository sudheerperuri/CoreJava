interface Bank{
	
	double getROI();
}

 class SBI implements Bank{
	
	public double getROI(){
		
		return 8.0;
	}
}
 
 class HDFC implements Bank{
	 
	 public double getROI(){
			
			return 10.0;
		}
 }
 
class ICICI implements Bank{
	 
	 public double getROI(){
			
			return 12.0;
		}
 }


 class InterfaceDemo{
	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println("SBI ROI = "+b.getROI());
		
		b = new HDFC();
		System.out.println("HDFC ROI = "+b.getROI());
		
		b = new ICICI();
		System.out.println("ICICI ROI = "+b.getROI());
		
		
	}
	
	

}
