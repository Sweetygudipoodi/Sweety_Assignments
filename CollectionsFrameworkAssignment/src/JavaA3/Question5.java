package JavaA3;
import java.util.HashMap;
public class Question5 {

	public static void main(String[] args) {
		HashMap<Employee,String> empTable = new HashMap<>();
        empTable.put(new Employee(2),"Sweety");
        empTable.put(new Employee(3),"Rakesh");
        empTable.put(new Employee(4),"Malar");
        empTable.put(new Employee(5),"Prem");
        
        for (Employee i : empTable.keySet()){
            System.out.println(empTable.get(i));
	}
  }
	}

