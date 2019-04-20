package calculator;

// add class template
public class Customer {

	private int customerID;
	private String fName;
	private String lName;
	private int status;
	private ElectricBill bill;
	private static int numberOfCustomers = 0;
	
	public Customer(int customerID, String fName, String lName, int status, ElectricBill bill) {
		this.customerID = customerID;
		this.fName = fName;
		this.lName = lName;
		this.status = status;
		this.bill = bill;
	}

	

	// add the class overloaded constructor
		public Customer() {
			this(0,"","",0,null);
		}

		// add setter and getter methods

		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public static int getNumberOfCustomers() {
			return numberOfCustomers;
		}
		
		//override the toString() method


}
