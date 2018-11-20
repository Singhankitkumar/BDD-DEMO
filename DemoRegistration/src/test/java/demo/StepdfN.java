package demo;



import static org.junit.Assert.assertTrue;

import com.cg.model.Student;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdfN {
	private Student student;
	@Given("^student Name and age$")
	public void student_Name_and_age() throws Throwable {
	   student=new Student("Ankit",23);
	  
	   
	}

	@When("^for valid age$")
	public void for_valid_age() throws Throwable {
		assertTrue(student.getAge()>18);
		assertTrue(student.getAge()<35);
	    
	}

	@Then("^successful registration and store into db$")
	public void successful_registration_and_store_into_db() throws Throwable {
	   System.out.println("Succesfull Registration");
	   
	}



}
