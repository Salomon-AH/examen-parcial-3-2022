package edu.uaslp.objetos.shoppingcart;

public class ItemNotFoundException extends Exception{

    public ItemNotFoundException(){
        super("Item not found");
    }
}
