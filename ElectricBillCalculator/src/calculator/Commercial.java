package calculator;

//add class template

public class Commercial extends ElectricBill {

	// complete the constructor
	public Commercial(int noOfKWH, int billMonth) {
		super(noOfKWH, billMonth);

		computeBill();
	}

	@Override
	public void computeBill() {
		double bill;

		int month = 0;

		if ((month >= 10 | month <= 12) && (month >= 1 | month <= 5))
			bill = getNoOfKWH() * 0.03920;
		else
			bill = getNoOfKWH() * 0.06450;

		setBill(bill);

	}

}