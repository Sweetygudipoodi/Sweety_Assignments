package JavaA3;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
public class FileSafe {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> premiumPhone = 
                new ConcurrentHashMap<String,String>();
premiumPhone.put("Apple", "iPhone");
premiumPhone.put("HTC", "HTC one");
premiumPhone.put("Samsung","S5");

Iterator<String> iterator = premiumPhone.keySet().iterator();

while (iterator.hasNext())
{
System.out.println(premiumPhone.get(iterator.next()));
premiumPhone.put("Sony", "Xperia Z");
}

	}

}
