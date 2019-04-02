
public class Main {
	
	public static void main(String args[]){
			
		BCProvince bc = new BCProvince();
		Iterator bc_iterator = new BCProvinceIterator(bc.getCities());
		
		Ontario onta = new Ontario();
		Iterator onta_iterator = new OntarioIterator(onta.getCities());
		
	    System.out.println( "BC Cities" );
	    printCities( bc_iterator );
	    System.out.println();
	    System.out.println( "Ontario Cities" );
	    printCities( onta_iterator );
		
	}
	
	private static void printCities(Iterator iterator) {
	    while ( iterator.hasNext() ) {
	    	City city = (City)iterator.next();
	        System.out.print( city.getName() + ", " );
	        System.out.print( city.isCapital() + ", ");
	        System.out.print( city.getPopulationDensity() + ", " );
	        System.out.println();
	    }
	}
}




