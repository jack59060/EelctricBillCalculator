
//
package calculator;

//add class template

public abstract class ElectricBill implements BaseCharge{

	
	private int noOfKWH;
	private int billMonth;
	private double bill;

	

	public ElectricBill(int noOfKWH,int billMonth) {
		this.noOfKWH = noOfKWH;
		this.billMonth=billMonth;
	}
	
	
	public int getNoOfKWH() {
		return noOfKWH;
	}



	public void setNoOfKWH(int noOfKWH) {
		this.noOfKWH = noOfKWH;
	}



	public int getBillMonth() {
		return billMonth;
	}



	public void setBillMonth(int billMonth) {
		this.billMonth = billMonth;
	}



	public double getBill() {
		return bill;
	}



	public void setBill(double bill) {
		this.bill = bill;
	}
	
	//add the toString method

		 
}
