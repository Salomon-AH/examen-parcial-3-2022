package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {

    public BigDecimal getTotalCost() {
        BigDecimal totalCost = BigDecimal.ZERO;

        for(Item item: items){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        return totalCost;
    }

    public boolean isEmpty() {
    }

    public void addItem(Item item) {
    }

    public boolean getItemsCount() {
    }

    public List<Item> getItems() {
    }

    public void removeItem(String itemCode1) {
    }
}
