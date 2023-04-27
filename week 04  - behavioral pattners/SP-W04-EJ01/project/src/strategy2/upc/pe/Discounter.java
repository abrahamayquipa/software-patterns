package strategy2.upc.pe;

import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}