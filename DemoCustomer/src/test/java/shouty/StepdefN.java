package shouty;

import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.cap.model.Address;
import org.cap.model.Customer;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefN {
	private Customer customer;
	private double openingBalance;
	


	@Given("^customer and opening balance$")
	public void customer_and_opening_balance() throws Throwable {
	    Address address=new Address("North Avenue","Pune");
	    customer=new Customer("Ankit","Singh",address);
	    openingBalance=5000;
	 
	}

	@When("^For valid customer$")
	public void for_valid_customer() throws Throwable {
	    assertNotNull(customer);
	}

	@When("^valid opening balance create account number$")
	public void valid_opening_balance_create_account_number() throws Throwable {
	  assertTrue(openingBalance>=5000);
	}

	@Then("^create account and store it in db$")
	public void create_account_and_store_it_in_db() throws Throwable {
	    
	}



}
