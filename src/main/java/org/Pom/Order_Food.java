package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Food {
	
	
	private WebDriver driver;

	@FindBy(xpath = "//button[text()='ORDER ONLINE NOW']")
	private WebElement Order_online;

	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement Delivery_Button;

	@FindBy(xpath = "//input[@class='srch-cnt-srch-inpt']")
	private WebElement Enter_area;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter Area')]")
	private WebElement location_click;
	
	@FindBy(xpath = "//li[@data-label='location_[object Object]']")
	 private WebElement pincode;
	
	
    @FindBy(xpath = "//span[text()='VEG PIZZA']")
	private WebElement VEG_PIZZA;

	@FindBy(xpath = "(//span[text()='Margherita']/../../div[@class='itm-dsc__actn__adCrt']/div/button/span)[2]")
	private WebElement mar_add_cart;
	
	@FindBy(xpath = "//span[text()='NO THANKS']")
	private WebElement No_thanks;

	@FindBy(xpath ="(//div[@class='crt-cntnt']//child::div[@data-label='increase'])[1]")
	private WebElement mar_QTY;

	@FindBy(xpath ="(//span[text()='Peppy Paneer']/../../div[@class='itm-dsc__actn__adCrt']/div/button/span)[2]")
		
	private WebElement peppy_panner_cart;

	@FindBy(xpath = "(//div[@class='crt-cntnt']//child::div[@data-label='increase'])[2]")
	private WebElement peppy_panner_qty;

	@FindBy(xpath = ("//div[@data-label='Veg Pizza']/div[6]/div/div/div[1]/div/div[3]/span"))
	private WebElement Assert_mar;

	@FindBy(xpath =("//div[@data-label='Veg Pizza']/div[8]/div/div/div[1]/div/div[3]/span"))
	private WebElement Assertpanner;
	
	@FindBy(xpath = ("//div[@class='menu-right']/div/div/div[2]/div[1]/span[2]"))
	private WebElement Subtotal;


	


	public void setSubtotal(WebElement subtotal) {
		Subtotal = subtotal;
	}


	@FindBy(xpath = "(//div[@class='crt-cntnt']//child::div[@data-label='decrease'])[1]")
	private WebElement mar_reduce_qty;

	@FindBy(xpath = "//span[text()='BEVERAGES']")
	private WebElement BEVERAGES;

	@FindBy(xpath = "//span[text()='Pepsi 475ml']/../../div[@class='itm-dsc__actn__adCrt']/div/button/span")
	private WebElement pepsi_cart;
	
	@FindBy(xpath ="//div[@data-label='Pepsi 475ml']//child::div[@data-label='increase']")
	private WebElement pepsi_add_qty;
	
	@FindBy(xpath = ("/html/body//div[@data-label='Beverages']/div/div/div[1]/div/div/div[3]/span"))
	private WebElement Assertpepsi;
	
  


	public void setAssertpepsi(WebElement assertpepsi) {
		Assertpepsi = assertpepsi;
	}

    @FindBy(xpath = "//div[@data-label='Pepsi 475ml']//child::div[@data-label='decrease']")
	private WebElement pepsi_reduce_qty;
	
	@FindBy(xpath = "//button[@data-label='miniCartCheckout']")
	private WebElement checkout;
	
	@FindBy(xpath = ("//div[@class='right']/div/div[6]/div/div/div[1]/span[2]/span"))
	private WebElement Subtotal1;
	
	


	public void setSubtotal1(WebElement subtotal1) {
		Subtotal1 = subtotal1;
	}


	@FindBy(xpath = "//button[@data-label='Place Order']")
	private WebElement place_order;
	
	@FindBy(xpath = "(//button[@class='ng-binding'])[1]")
	private WebElement notification;
	

	public  Order_Food (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver , this);

	
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getOrder_online() {
		return Order_online;
	}


	public WebElement getDelivery_Button() {
		return Delivery_Button;
	}


	public WebElement getEnter_area() {
		return Enter_area;
	}


	public WebElement getLocation_click() {
		return location_click;
	}
	
	public WebElement getPincode2() {
		return pincode;
	}


	public WebElement getVEG_PIZZA() {
		return VEG_PIZZA;
	}


	public WebElement getMar_add_cart() {
		return mar_add_cart;
	}

    public WebElement getNo_thanks() {
		return No_thanks;
	}


	public WebElement getMar_QTY() {
		return mar_QTY;
	}

    public WebElement getPeppy_panner_cart() {
		return peppy_panner_cart;
	}


	public WebElement getPeppy_panner_qty() {
		return peppy_panner_qty;
	}

	public WebElement getAssert_mar() {
		return Assert_mar;
	}


	public WebElement getAssertpanner() {
		return Assertpanner;
	}

	public WebElement getSubtotal() {
		return Subtotal;
	}

	public WebElement getMar_reduce_qty() {
		return mar_reduce_qty;
	}


	public WebElement getBEVERAGES() {
		return BEVERAGES;
	}


	public WebElement getPepsi_cart() {
		return pepsi_cart;
	}


	public WebElement getPepsi_add_qty() {
		return pepsi_add_qty;
	}
	
	  public WebElement getAssertpepsi() {
			return Assertpepsi;
		}
	
	
	public WebElement getPepsi_reduce_qty() {
		return pepsi_reduce_qty;
	}


	public WebElement getCheckout() {
		return checkout;
	}
	
	public WebElement getSubtotal1() {
		return Subtotal1;
	}


	public WebElement getPlace_order() {
		return place_order;
	}


	public WebElement getNotification() {
		return notification;
	}






}
