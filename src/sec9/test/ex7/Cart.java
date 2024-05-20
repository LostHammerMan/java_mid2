package sec9.test.ex7;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Product product;
    private int amount;

    Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int amount){
//
        if (!cartMap.containsKey(product)){
            cartMap.put(product, amount);
        }else {
            cartMap.replace(product, cartMap.get(product) + amount);
//            cartMap.get(product).
        }
    }

    public void minus(Product product, int amount) {
        if (cartMap.get(product) - amount <= 0){
            cartMap.remove(product);
        }else {
            cartMap.replace(product, cartMap.get(product) - amount);
        }
    }

    public void printAll(){
        System.out.println("모든 상품 출력");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()){
            System.out.println("상품 : " + entry.getKey() + ", 수량 : " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartMap=" + cartMap +
                '}';
    }


}
