package strategy2.upc.pe;

import java.math.BigDecimal;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discounter easterDiscounter = new Discounter() {
		    @Override
		    public BigDecimal applyDiscount(final BigDecimal amount) {
		        return amount.multiply(BigDecimal.valueOf(0.5));
		    }
		};
	}

}
