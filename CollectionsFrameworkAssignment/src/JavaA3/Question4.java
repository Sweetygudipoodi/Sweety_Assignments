package JavaA3;
import java.util.HashMap;
import java.util.Map;
public class Question4 {

	public static void main(String[] args) {
			Dates empdob1=new Dates(23,5,1998);
			Dates empdob2=new Dates(18,6,1995);
			Dates empdob3=new Dates(23,5,1978);
			Dates empdob4=new Dates(18,11,1995);
			Map<Dates,String >  EmpdobMap = new HashMap<>();
			EmpdobMap.putIfAbsent(empdob1,"sweety");	
			EmpdobMap.putIfAbsent(empdob2,"malar");	
			EmpdobMap.putIfAbsent(empdob3,"rakesh");	
			EmpdobMap.putIfAbsent(empdob4,"prem");	
			System.out.println(EmpdobMap);

		}

	}


