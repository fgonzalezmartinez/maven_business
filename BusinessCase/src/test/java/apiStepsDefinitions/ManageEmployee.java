package apiStepsDefinitions;

import apiPageObjects.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONObject;
import org.testng.Assert;
import java.lang.*;

public class ManageEmployee {
    GetEmployees employees;
    GetEmployees employee;
    JSONObject json;
    //CreateEmployees createEmployee;
    int id;

    @Given("User sets valid auth key")
    public void user_sets_valid_auth_key(){
        System.out.println("Correct auth");
    }

    @When("User sends a Get request to \\/users {string}")
    public void users_sends_a_get_request(String endPoint) {
        employees = new GetEmployees(endPoint);
    }

    @Then("User should get {int} as Expected Status Code")
    public void expected_status_code(int statusCode){
        System.out.println(statusCode);
       Assert.assertTrue(statusCode == 200);
    }

    @Then("User should get an array of employees")
    public void get_employees_array(){
        employees.response.prettyPrint();
    }
}

//api.docs.import.io
