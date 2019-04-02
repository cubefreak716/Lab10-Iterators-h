import java.util.ArrayList;
import java.util.Iterator;

public class ProvinceInformation {

	Iterator I; 
	
	public ProvinceInformation(Iterator i ){
		I = i; 
	}
	
//    public Iterator<City> iterator() { 
//        return new BCProvinceCityIterator(new BCProvince()); 
//    } 
	
//	Iterable<City> Iterator() {
//		return Iterable<City>(); 
//	}
	
	void printCities( ) {
		while(I.hasNext()) {
			System.out.println((BCProvince)I.next()); 
		}
	}
	
}
