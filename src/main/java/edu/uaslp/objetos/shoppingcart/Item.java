package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {
    private String code;
    private String providerCode;
    private BigDecimal unitCost;
    private int quantity;

    public Item(String itemCode, String providerCode, BigDecimal unitCost, int quantity) {
        this.code = itemCode;
        this.providerCode = providerCode;
        this.unitCost = unitCost;
        this.quantity = quantity;
    }

    public Item() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String itemCode) {
        this.code = itemCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }
}
