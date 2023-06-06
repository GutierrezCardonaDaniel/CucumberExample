package org.example.cucumber.bindings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculator;
import org.testng.Assert;

public class multiplyStepDefinitions {
    private int x;
    private int y;
    private int actualResult;

    @Given("the first number is {int}")
    public void theFirstNumberIs(int number) {
        this.x = number;
    }

    @Given("the second number is {int}")
    public void theSecondNumberIs(int number) {
        this.y = number;
    }

    @When("the calculator multiplies both numbers")
    public void theCalculatorMultipliesBothNumbers() {
      actualResult = Calculator.multiply(x,y);
    }

    @Then("the resulting value should be {int}")
    public void theResultingValueShouldBe(int expectedResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }
}
