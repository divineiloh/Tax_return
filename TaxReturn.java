package TaxReturn;

//Author: Divine Iloh
//BINS 5312
//Date: 04/03/2022

public class TaxReturn {
	//declaring variables
	private String ssn; 
	private String lastName; 
	private String firstName;
	private String streetAddress; 
	private String city; 
	private String state; 
	private String zipCode; 
	private double annualIncome;
	private String maritalStatus; 
	private double tax; 
	
	//declaring variables
	public TaxReturn(String ss, String lname, String fname, String address, String city, String state, String zip,
			double income, String status) { // Introducing a public method to compute tax return

			ssn = ss;
			lastName = lname;
			firstName = fname;
			streetAddress = address;
			this.city = city;
			this.state = state;
			zipCode = zip;
			annualIncome = income;
			maritalStatus = status;
			calculateTaxLiability(); // calculating tax liability
			}
	
	private void calculateTaxLiability() { // introducing a private method to calculate tax liability

		if (annualIncome >= 0 && annualIncome <= 20000) { 
			
			// Using the if statement to set condition for annual income
			switch (maritalStatus) 
			{  
			case "single": 
				tax = 0.15 * annualIncome; 
				break; 
			case "Married": 
			case "married": 
				tax = 0.14 * annualIncome; 
				break; 
			default: 
				break; 
			}
		
		} else if (annualIncome > 20000 && annualIncome <= 50000) {
			switch (maritalStatus) { 
				case "Single": 
					case "single": 
					tax = 0.22 * annualIncome;
					break; 
					case "Married":
					case "married": 
					tax = 0.20 * annualIncome;
					break; 
					default: 
				break;
		}
		} else if (annualIncome > 50000) {
			switch (maritalStatus) { 
				case "Single":
				case "single": 
				tax = 0.30 * annualIncome;
				break;
				case "Married":
				case "married": 
					tax = 0.28 * annualIncome;
				break; 
				default: 
				break; 

		}
		}

		}
	public String getValidSSN()
	{
		return ssn;
	}
	
	public String getValidZip()
	{
		return zipCode;
	}
	
	
	public void display() {
		System.out.println("=========================================================="); 
		
		System.out.println("Taxpayer ssn: " + ssn + "\nFirst Name: " + firstName + "\nLast Name: " + lastName
		+ "\nStreet Address: " + streetAddress + "\nCity: " + city + "\nState: " + state
		+ "\nZip Code: " + zipCode + "\nMarital status: " + maritalStatus + "\nIncome: $"
		+ annualIncome + "\nTax Liability: $" + tax); 
		System.out.println("=========================================================="); 

		}
	
	
}
