import java.util.ArrayList;

public class BCProvinceIterator implements Iterator{

	ArrayList cities;
	int position = 0;

	public BCProvinceIterator( ArrayList cities ) {
		this.cities = cities;
	}

	public Object next() {
	    Object obj = cities.get( position );
	    position = position + 1 ;
	    return obj ;
	}
	
	public boolean hasNext() {
	    if (position >= cities.size()) {
	        return false;
	    } else {
	        return true;
	    }
	}

}
