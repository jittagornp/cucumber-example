/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pamarin.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jittagornp <http://jittagornp.me>
 * create : 2016/09/29
 */
public class CaculatorStepdefs {

    private Calculator calculator;

    @Given("^x is (\\d+) and y is (\\d+)$")
    public void define_x_and_y(int x, int y) {
        calculator = new Calculator(x, y);
    }

    @When("^x plus y$")
    public void x_plus_y() {
        calculator.add();
    }

    @When("^x minus y$")
    public void x_minus_y() {
        calculator.minus();
    }

    @When("^x multiplied by y$")
    public void x_multiplied_by_y() {
        calculator.multiply();
    }

    @When("^x divided by y$")
    public void x_divided_by_y() {
        calculator.divide();
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int expected) {
        assertThat(calculator.getResult()).isEqualTo(expected);
    }
}
