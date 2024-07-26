package org.Step_Definition_Dominos_Poc;

import org.Base_Class_Dominos_Poc.Base_Class_Dominos_Poc;
import org.Pom.Order_Food;
import org.Runner_Class_Dominos_Poc.Runner_Class_Dominos_Poc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition_Class_Dominos_Poc extends Base_Class_Dominos_Poc{

	private static final int pepsi1 = 0;

	public static WebDriver driver = Runner_Class_Dominos_Poc.driver;

	public static Order_Food a = new Order_Food(driver);

	@Given("the user launch Dominos url")
	public void the_user_launch_dominos_url() {
	
		driver.get("https://www.dominos.co.in/");
    }
	@When("the user click order online now button Naviates The user to location page")
	public void the_user_click_order_online_now_button_naviates_the_user_to_location_page() throws InterruptedException {
		Thread.sleep(3000);
		click(a.getOrder_online());
	}
	@When("user enter the adress and Pin code in Loaction Field")
	public void user_enter_the_adress_and_pin_code_in_loaction_field() throws InterruptedException {
		Thread.sleep(5000);
		click(a.getNotification());
		click(a.getEnter_area());
        Thread.sleep(6000);
        send_keys(a.getLocation_click(),"607002");
		Thread.sleep(7000);
		click(a.getPincode2());
    }
	@When("the user click VEG PIZZA in the top of the margin menu")
	public void the_user_click_veg_pizza_in_the_top_of_the_margin_menu() throws InterruptedException {
		Thread.sleep(9000);
       click(a.getVEG_PIZZA());
    }
	@When("user Have to click the Margherita pizza add to card")
	public void user_have_to_click_the_margherita_pizza_add_to_card() {
		click(a.getMar_add_cart());
    }
	@When("user Have to I want to add extra cheese Page")
	public void user_have_to_i_want_to_add_extra_cheese_page() {
		click(a.getNo_thanks());
    }
	@When("user Have to click the Margherita pizza Two Qty")
	public void user_have_to_click_the_margherita_pizza_two_qty() {
		click(a.getMar_QTY());
	}
	@When("user Have to click the Peppy Paneer pizza add to card")
	public void user_have_to_click_the_peppy_paneer_pizza_add_to_card() throws InterruptedException {
		Thread.sleep(6000);
        click(a.getPeppy_panner_cart());
    }
    @When("user Have to click the Peppy Paneer pizza Two Qty")
	public void user_have_to_click_the_peppy_paneer_pizza_two_qty() {	
		click(a.getPeppy_panner_qty());

		String price = a.getAssert_mar().getText();
		String price1 =a.getAssertpanner().getText();

		double pizza = Double.parseDouble(price);
		double pizaa1 = Double.parseDouble(price1);

		Double d = pizza*1+pizaa1*2;

		String price2 = a.getSubtotal().getText();

		double Totalprice = Double.parseDouble(price2);
		Assert.assertEquals(d,Totalprice, d);
	}

	@When("the user click BEVERAGES in the top of the margin menu")
	public void the_user_click_beverages_in_the_top_of_the_margin_menu() throws InterruptedException {
		Thread.sleep(6000);
        click(a.getBEVERAGES());
    }
	@When("user Have to click the Pepsi 475ml add to card")
	public void user_have_to_click_the_pepsi_475ml_add_to_card() throws InterruptedException {
		click(a.getPepsi_cart());
    }
	@When("user have to click thePepsi 475ml twelve Qty")
	public void user_have_to_click_the_pepsi_475ml_twelve_qty() throws InterruptedException {
		Thread.sleep(6000);
		for(int i=0;i<11;i++) {	
		click(a.getPepsi_add_qty());


			String price = a.getAssert_mar().getText();
			String price1 =a.getAssertpanner().getText();

			double pizza = Double.parseDouble(price);
			double pizaa1 = Double.parseDouble(price1);

			String price2= a.getAssertpepsi().getText();

			Double d = pizza*1+pizaa1*2+pepsi1*12;

            double pepsi1 = Double.parseDouble(price2);

			String price13 = a.getSubtotal().getText();
			double Totalprice1 = Double.parseDouble(price13);
			Assert.assertEquals(d, Totalprice1, d);
		}     
    }
	@When("the user remove  one qty Margherita from the cart")
	public void the_user_remove_one_qty_margherita_from_the_cart() {
		click(a.getMar_reduce_qty());
	}
	@When("the user remove six qty Pepsi 475ml from the cart")
	public void the_user_remove_six_qty_pepsi_475ml_from_the_cart() throws InterruptedException {
		Thread.sleep(6000);

		for(int i=0;i<6;i++) {	
			click(a.getPepsi_reduce_qty());
		}

		String price = a.getAssert_mar().getText();
		String price1 =a.getAssertpanner().getText();
		
		double pizza = Double.parseDouble(price);
		
		double pizaa1 = Double.parseDouble(price1);
		
		String price2=  a.getSubtotal().getText();
		double pepsi1 = Double.parseDouble(price2);
		Double d = pizza*1+pizaa1*1+pepsi1*12;
		

		String price3 = a.getSubtotal().getText();
		double Totalprice1 = Double.parseDouble(price3);
		Assert.assertEquals(d, Totalprice1, d);
		
	}
	@When("the user verify the cart click the checkout button")
	public void the_user_verify_the_cart_click_the_checkout_button() {
	        click(a.getCheckout());
	}
	@When("the user view the place order page")
	public void the_user_view_the_place_order_page() throws InterruptedException {		
		 driver.navigate().back();
         Thread.sleep(5000);
        
         		String price= a.getSubtotal().getText();
         		double Totalprice = Double.parseDouble(price);
         		click(a.getCheckout());
                driver.navigate().forward();
                Thread.sleep(5000);
		
		String price1 = a.getSubtotal1().getText();
		double Totalprice1 = Double.parseDouble(price1);
		
		Assert.assertEquals(Totalprice1, Totalprice, Totalprice1);
	}
	@Then("the user verify the address and price details click place order button")
	public void the_user_verify_the_address_and_price_details_click_place_order_button() throws InterruptedException {
		Thread.sleep(6000);
		click(a.getPlace_order());


	}


}
