import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet.*;


public class BCProvince {
	
	ArrayList<City> cities;
	
	
	public BCProvince() {
		cities = new ArrayList<City>();
		cities.add(new City("Victoria", true, (float)4109.4)); 
		cities.add(new City("Vancouver",false, (float)5249.1)); 
		cities.add(new City("Burnaby",false, (float)2463.5));
		cities.add(new City("Richmond", false, (float)1473.5));
		cities.add(new City("Surrey", false, (float)1479.9));
		
	}
	
	Iterator<City> iterator(){
		return new BCProvinceCityIterator(this); 
//		return cities.iterator(); 
	}
	

//	public String getName() {
//		return("dfla");
//	}
//	public boolean isCapital() {
//		return true;
//	}
//	
//	public float getPopulationDensity() {
//		return 1;
//	}
//	
	
}
