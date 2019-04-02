
public class OntarioIterator implements Iterator{
	
	
	City [] cities;
	int position = 0;

	public OntarioIterator( City[] cities ) {
	    this.cities = cities;
	}

	public Object next() {
	    City menuIt = cities[position];
	    position = position + 1;
	    return menuIt ;
	}

	public boolean hasNext() {
	    if ( position >= cities.length || cities[position] == null ) {
	         return false;
	    } else {
	        return true;
	    }
	}

}
