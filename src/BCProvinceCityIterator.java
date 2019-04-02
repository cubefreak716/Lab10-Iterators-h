import java.util.ArrayList;
import java.util.Iterator;

public class BCProvinceCityIterator implements Iterator<City>{

	ArrayList<City>list; 
	Iterator<City> ci; 
	int pos = 0; 
	
	public BCProvinceCityIterator(BCProvince items){
		//list = items.cities; 
		ci = items.cities.iterator(); 
	}
	
	public City next() {
//		City c = list.get(pos);  
//		pos+=1; 
//		return(c); 
		return ci.next();
		
	}
	
	public boolean hasNext() {
//		if(pos>= list.size()) {
//			return false; 
//		}
//		else {
//			return true; 
//		}
		return ci.hasNext();
		
	}
	
}
