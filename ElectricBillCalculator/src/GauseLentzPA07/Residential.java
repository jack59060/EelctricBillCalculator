package GauseLentzPA07;

//add class template

public class Residential extends ElectricBill{


	// complete the constructor	
		public Residential(int noOfKWH, int billMonth) { 
			super(noOfKWH, billMonth);
			
			computeBill();
		}

		@Override
		public void computeBill() {
			double bill;
			
			int month = 0;
			
			if((month>=10 | month<=12) && (month>=1 | month<=5))
				bill = getNoOfKWH() * 0.04604;
			else {
				if(getNoOfKWH()<=500)
					bill = getNoOfKWH() * 0.04604;
				else
					bill = getNoOfKWH() * 0.09000;
			}
			
			setBill(bill);
			
		}






}


