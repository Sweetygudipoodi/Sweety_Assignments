package JavaA4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {
	
    public static void main(String[] args) {
		
    	List<String> list = new ArrayList<>();
        list.add("Sugar");
        list.add("Weight");
        list.add("Egg");
        list.add("Enjoy");
        list.add("Tiger");
        list.add("Yellow");
       
        Consumer<List<String>> firstLetter = a -> {
            StringBuilder s = new StringBuilder();

            a.forEach(firs -> s.append(firs.charAt(0)));
            System.out.println(s);
        };
        firstLetter.accept(list);
    }
}
		
