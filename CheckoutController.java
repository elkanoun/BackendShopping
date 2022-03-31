package com.infokmed.web;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import com.infokmed.dao.CustomerRepository;
import com.infokmed.dao.OrdersRepository;
import com.infokmed.dao.PaymentRepository;
import com.infokmed.dao.ProductRepository;
import com.infokmed.dao.ShippingRepository;
import com.infokmed.dao.ShopRepository;
import com.infokmed.entities.City;
import com.infokmed.entities.Country;
import com.infokmed.entities.Customer;
import com.infokmed.entities.Orders;
import com.infokmed.entities.Payment;
import com.infokmed.entities.Product;
import com.infokmed.entities.Shipping;
import com.infokmed.entities.Shop;
import com.infokmed.entities.ShopId;

@CrossOrigin("*")
@RestController
public class CheckoutController {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ShopRepository shopRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	OrdersRepository ordersRepository;
	@Autowired
	ShippingRepository shippingRepository;
	@Autowired
	PaymentRepository paymentRepository;
	
	@PostMapping("/checkout")
	public Payment processCheckout(@RequestBody CheckoutForm checkoutForm) {
		//Treatment customer
		System.out.println(checkoutForm.toString());
		Customer customer=customerRepository.findById((long) 1).get();
		System.out.println(customer.getId());
		//Treatment order
		Orders order=new Orders();
		order.setCustomer(customer);
		order.setDate(new Date());
		order=ordersRepository.save(order);
		for(Item i:checkoutForm.getItems()) {
			Shop shop=new Shop();
			Product product=productRepository.findById(i.getProduct().getId()).get();
			ShopId shopId=new ShopId(order, product);
			shop.setPk(shopId);
			shop.setQuantity(i.getQty());
			shopRepository.save(shop);
		}
		order.setPrice(checkoutForm.getSubTotalPrice());
		ordersRepository.save(order);
		//Treatment shipping
		Shipping shipping=new Shipping();
		String adress=(checkoutForm.getShipInfo().getAddress1()+"|"+checkoutForm.getShipInfo().getAddress2());
		shipping.setAddress(adress);
		shipping.setDate(new Date());
		shipping.setZipCode(checkoutForm.getShipInfo().getZipCode());
		shipping.setOrder(order);
		City city=new City();
		city.setId(Long.parseLong(checkoutForm.getShipInfo().getCity()));
		shipping.setCity(city);
		Country country=new Country();
		country.setId(Long.parseLong(checkoutForm.getShipInfo().getCountry()));
		shipping.setCountry(country);
		shipping.setFrais(checkoutForm.getShppingRate());
		//Treatment payment
		Payment payment=new Payment();
		payment.setDate(new Date());
		payment.setMode(checkoutForm.getPyInfo().getMethod());
		payment.setOrder(order);
		double total=0;
		total=checkoutForm.getSubTotalPrice()+checkoutForm.getShppingRate();
		payment.setTotalPrice(total);
        System.out.println("Order est payé de n:"+order.getId());
        
		return paymentRepository.save(payment);
		
	}
	
	

}
