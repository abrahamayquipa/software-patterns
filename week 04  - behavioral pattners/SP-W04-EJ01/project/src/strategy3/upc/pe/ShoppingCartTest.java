package strategy3.upc.pe;
public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1000",10);
		Item item2 = new Item("4500",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("cliente@empresa.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Luis Perez", "1234567890123456", "786", "12/15"));
	}

}