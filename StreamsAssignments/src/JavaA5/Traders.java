package JavaA5;

public class Traders {
	private String name,city;
	
	public Traders(String name,String city) {
		super();
		this.name=name;
		this.city=city;
		
	}
	public String getname() {
    	return name;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public String getcity() {
    	return city;
    }
    public void setcity(String city) {
    	this.city=city;
    }
    public String toString() {
    	return "Trader [name=" + name + ", city=" + city + "]";
    }
}
