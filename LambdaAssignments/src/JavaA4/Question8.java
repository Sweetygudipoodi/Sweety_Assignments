package JavaA4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question8 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
	        list.add(468);
	        list.add(798);
	        list.add(563);
	        list.add(531);
	        
	        Consumer<List<Integer>> iterate = a-> {a.forEach(System.out::println);};
	        Thread t = new Thread(()-> iterate.accept(list));
	        t.start();
	}

}
