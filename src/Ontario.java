import java.util.ArrayList;
import java.util.Iterator;

public class Ontario {

	ArrayList<City> cities;
	
	public Ontario() {
		cities = new ArrayList<City>();
		cities.add(new City("Toronto",true, (float)4334.4)); 
		cities.add(new City("Mississauga",false, (float) 2467.6)); 
		cities.add(new City("Kitchener",false, (float)1705.2)); 
		cities.add(new City("Waterloo", false, (float)1639.8)); 
		cities.add(new City("Cornwall", false, (float)756.8)); 
	}
	
	Iterator<City> iterator(){
		return new OntarioProvinceCityIterator(this); 
	}

	
}
