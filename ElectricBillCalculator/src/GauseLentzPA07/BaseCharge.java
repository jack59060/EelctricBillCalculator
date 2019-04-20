package GauseLentzPA07;

public interface BaseCharge {
	
	final static double BASE_RESIDENTIAL_CUST = 6.75;
	final static double BASE_COMMERCIAL_CUST = 10.75;
	
	/** Abstract method computeBill */
	abstract void computeBill(); // computes the customer bill


}
