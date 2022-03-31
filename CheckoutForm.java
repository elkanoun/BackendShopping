package com.infokmed.web;


import java.util.List;

public class CheckoutForm {
//	this.data.push(this.shipInfo);
	private ShipInfo shipInfo;
//    this.data.push(this.payInfo);
	private PayInfo pyInfo;
//    this.data.push(this.shippingRate);
	private double shppingRate;
//    this.data.push(this.cartService.cart);
	private List<Item> items;
//    this.data.push(this.cartService.subTotalPrice);
	private double subTotalPrice;
	
	//global get and set checkoutForm
	public ShipInfo getShipInfo() {
		return shipInfo;
	}

	public void setShipInfo(ShipInfo shipInfo) {
		this.shipInfo = shipInfo;
	}

	public PayInfo getPyInfo() {
		return pyInfo;
	}

	public void setPyInfo(PayInfo pyInfo) {
		this.pyInfo = pyInfo;
	}

	public double getShppingRate() {
		return shppingRate;
	}

	public void setShppingRate(double shppingRate) {
		this.shppingRate = shppingRate;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getSubTotalPrice() {
		return subTotalPrice;
	}

	public void setSubTotalPrice(double subTotalPrice) {
		this.subTotalPrice = subTotalPrice;
	}
    //to string checkoutForm
	@Override
	public String toString() {
		return "CheckoutForm [shipInfo=" + shipInfo + ", pyInfo=" + pyInfo + ", shppingRate=" + shppingRate + ", items="
				+ items + ", subTotalPrice=" + subTotalPrice + "]";
	}
	
	

}

class ShipInfo {
	private String address1;
	private String address2;
	private String city;
	private String country;
	private String firstName;
	private String lastName;
	private String telephone;
	private boolean useBillingAddress;
	private String zipCode;
    //get and set
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean getUseBillingAddress() {
		return useBillingAddress;
	}

	public void setUseBillingAddress(boolean useBillingAddress) {
		this.useBillingAddress = useBillingAddress;
	}
    //to string
	@Override
	public String toString() {
		return "ShipInfo [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", city=" + city
				+ ", address1=" + address1 + ", address2=" + address2 + ", zipCode=" + zipCode + ", telephone="
				+ telephone + ", useBillingAddress=" + useBillingAddress + "]";
	}
	
	

}

class PayInfo {
	private String cvn;
	private String expirationMonth;
	private String expirationYear;
	private String method;
	private String nameOnCard;
	private String numberCard;
	private String type;
    //get and set
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	public String getCvn() {
		return cvn;
	}

	public void setCvn(String cvn) {
		this.cvn = cvn;
	}
    //to string
	@Override
	public String toString() {
		return "PayInfo [method=" + method + ", nameOnCard=" + nameOnCard + ", type=" + type + ", numberCard="
				+ numberCard + ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear + ", cvn="
				+ cvn + "]";
	}
	
	

}

class ShoppingCart {
	private double currentPrice;
	private String description;
	private Long id;
	private String images;
	private String name;
	private int promotion;
	private double purchasePrice;
	private int quantity;
	private String reference;
	private double weight;
	//get and set
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPromotion() {
		return promotion;
	}
	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//to string
	@Override
	public String toString() {
		return "ShoppingCart [currentPrice=" + currentPrice + ", description=" + description + ", id=" + id
				+ ", images=" + images + ", name=" + name + ", promotion=" + promotion + ", purchasePrice="
				+ purchasePrice + ", quantity=" + quantity + ", reference=" + reference + ", weight=" + weight + "]";
	}
	
	

}

class Item {
	private double price;
	private ShoppingCart product;
	private int qty;
    //get and set
	public ShoppingCart getProduct() {
		return product;
	}

	public void setProduct(ShoppingCart product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [product=" + product + ", qty=" + qty + ", price=" + price + "]";
	}
	
	

}



//import java.util.ArrayList;
//import java.util.List;
//
//import com.infokmed.entities.Product;
//
//import lombok.Data;
//
//@Data
//public class CheckoutForm {
//	private List<OrderProduct> productsCheckout=new ArrayList<>();
//	private PaymentInfo paymentCheckout=new PaymentInfo();
//	private ShippingInfo shippingCheckout=new ShippingInfo();
//	private double shippingRateCheckout;
//	private double subTotalPriceCheckout;
//	//getters and setters
//	public ShippingInfo getShippingCheckout() {
//		return shippingCheckout;
//	}
//	public void setShippingCheckout(ShippingInfo shippingCheckout) {
//		this.shippingCheckout = shippingCheckout;
//	}
//	public PaymentInfo getPaymentCheckout() {
//		return paymentCheckout;
//	}
//	public void setPaymentCheckout(PaymentInfo paymentCheckout) {
//		this.paymentCheckout = paymentCheckout;
//	}
//	public double getShippingRateCheckout() {
//		return shippingRateCheckout;
//	}
//	public void setShippingRateCheckout(double shippingRateCheckout) {
//		this.shippingRateCheckout = shippingRateCheckout;
//	}
//	public List<OrderProduct> getProductsCheckout() {
//		return productsCheckout;
//	}
//	public void setProductsCheckout(List<OrderProduct> productsCheckout) {
//		this.productsCheckout = productsCheckout;
//	}
//	public double getSubTotalPriceCheckout() {
//		return subTotalPriceCheckout;
//	}
//	public void setSubTotalPriceCheckout(double subTotalPriceCheckout) {
//		this.subTotalPriceCheckout = subTotalPriceCheckout;
//	}
//	
//	
//	
//}
//@Data
//class ShippingInfo{
//	private String address1;
//	private String address2;
//	private String city;
//	private String country;
//	private String firstName;
//	private String lastName;
//	private String telephone;
//	private String useBillingAddress;
//	private String zipCode;
//	//get and set
//	public String getAddress1() {
//		return address1;
//	}
//	public void setAddress1(String address1) {
//		this.address1 = address1;
//	}
//	public String getAddress2() {
//		return address2;
//	}
//	public void setAddress2(String address2) {
//		this.address2 = address2;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getTelephone() {
//		return telephone;
//	}
//	public void setTelephone(String telephone) {
//		this.telephone = telephone;
//	}
//	public String getUseBillingAddress() {
//		return useBillingAddress;
//	}
//	public void setUseBillingAddress(String useBillingAddress) {
//		this.useBillingAddress = useBillingAddress;
//	}
//	public String getZipCode() {
//		return zipCode;
//	}
//	public void setZipCode(String zipCode) {
//		this.zipCode = zipCode;
//	}
//	
//}
//
//@Data
//class PaymentInfo{
//	private String cvn; 
//	private String expirationMonth;
//	private String expirationYear;
//	private String method;
//	private String nameOncard;
//	private String numberCard;
//	private String type;
//	//get and set
//	public String getCvn() {
//		return cvn;
//	}
//	public void setCvn(String cvn) {
//		this.cvn = cvn;
//	}
//	
//	public String getExpirationMonth() {
//		return expirationMonth;
//	}
//	public void setExpirationMonth(String expirationMonth) {
//		this.expirationMonth = expirationMonth;
//	}
//	public String getExpirationYear() {
//		return expirationYear;
//	}
//	public void setExpirationYear(String expirationYear) {
//		this.expirationYear = expirationYear;
//	}
//	public String getMethod() {
//		return method;
//	}
//	public void setMethod(String method) {
//		this.method = method;
//	}
//	public String getNameOncard() {
//		return nameOncard;
//	}
//	public void setNameOncard(String nameOncard) {
//		this.nameOncard = nameOncard;
//	}
//	public String getNumberCard() {
//		return numberCard;
//	}
//	public void setNumberCard(String numberCard) {
//		this.numberCard = numberCard;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//}
//
//@Data
//class OrderProduct{
//	private int qty;
//	private Product product;
//	private double price;
//	//get and set
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//	
//	
//	
//}
