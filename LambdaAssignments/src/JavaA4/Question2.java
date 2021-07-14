package JavaA4;

public class Question2 {

	public static void main(String[] args) {
		priceLambda my= str -> {
            if(str>10000) {
                return ("The order status is accepted");
            }
            else {
                return ("The order status is not accepted");
            }
        };
        System.out.println(my.price(70000));
        System.out.println(my.price(14500));
        System.out.println(my.price(6500));
        System.out.println(my.price(73000));
    }
    interface priceLambda {
        String price(int str);


	}

}
