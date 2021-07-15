package JavaA5;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Question10 {

	public static void main(String[] args) {

		Traders sohail = new Traders("Sohail", "Pune");
		Traders kumar = new Traders("Kumar","Telangana");
		Traders amit = new Traders("Amit","Pune");
		Traders kiran = new Traders("Kiran","Andhra Pradesh");

		List<Transaction> transactions = Arrays.asList(
		    new Transaction(kiran, 2011, 300),
		    new Transaction(sohail, 2012, 1000),
		    new Transaction(sohail, 2011, 400),
		    new Transaction(kumar, 2012, 710),
		    new Transaction(kumar, 2012, 700),
		    new Transaction(amit, 2012, 950)
		);
		
		List<Traders> traders =
			    transactions.stream()
			                .map(Transaction::gettrader)	
			                .filter(trader -> trader.getcity().equals("Pune"))	
			                .distinct()	
			                .sorted(comparing(Traders::getname))	
			                .collect(toList());
		System.out.println(traders);

	}

}
