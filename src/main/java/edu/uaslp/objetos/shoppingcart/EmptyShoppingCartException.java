package edu.uaslp.objetos.shoppingcart;

public class EmptyShoppingCartException extends RuntimeException{

    public EmptyShoppingCartException(){
        super("Empty shopping cart");
    }
}
