package JavaA3;
import java.util.TreeSet;

import JavaA3.Persons;
public class Person {
	public static void main(String args[]) {
		TreeSet<Persons> set=new TreeSet<Persons>();
		Persons p1=new Persons(70,195,"Sweety");
		Persons p2=new Persons(70,188,"Gudipoodi");
		set.add(p1);
		set.add(p2);
		for(Persons p:set) {
			System.out.println(p.weight+" "+p.height+" "+p.name+"");
		}
	}
}

