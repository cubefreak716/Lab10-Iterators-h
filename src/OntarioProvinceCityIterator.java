import java.util.ArrayList;
import java.util.Iterator;
public class OntarioProvinceCityIterator implements Iterator<City>{
	ArrayList<City> list;
	//Ontario o; 
	int pos = 0; 
	Iterator<City> o; 
	
	public OntarioProvinceCityIterator(Ontario items) {
		//o = items; 
		list = items.cities; 
		o = items.cities.iterator(); 
	}
	
	public City next() {
//		City c = list.get(pos);  
//		pos+=1; 
//		return(c); 
		
		return o.next(); 
		
	}
	
	public boolean hasNext() {
//		if(pos>= list.size()) {
//			return false; 
//		}
//		else {
//			return true; 
//		}
		
		return o.hasNext();
		
		
	}
	

}
