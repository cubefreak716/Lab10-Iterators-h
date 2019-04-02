import java.util.Iterator;

import processing.core.*;
public class LAB10 extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PApplet.main("LAB10");
		
//		City c = new City();
		//System.out.println("hiya"); 
		
		BCProvince bc = new BCProvince(); 
		Ontario on = new Ontario(); 
		
		Iterator<City> bci = bc.iterator(); 
		Iterator<City> oni = on.iterator(); 
		//OntarioProvinceCityIterator oni = new OntarioProvinceCityIterator(on);
		ProvinceInformation pi = new ProvinceInformation(bci); 
		
		
		//System.out.println(bc.cities.get(1).getName()); 
		System.out.println("BC cities");
		while(bci.hasNext()) {
			City c = bci.next();
			System.out.println(System. lineSeparator()+ "City: "+c.getName()); 
			System.out.println("Capital? "+ c.isCapital()); 
			System.out.println("Pop Dens: " + c.getPopulationDensity()); 
		}
		System.out.println(System.lineSeparator()+System. lineSeparator()+"Ontairio cities");
		while(oni.hasNext()) {
			City c2 = oni.next();
			System.out.println(System. lineSeparator()+"City: "+c2.getName()); 
			System.out.println("Capital? "+ c2.isCapital()); 
			System.out.println("Pop Dens: " + c2.getPopulationDensity()); 
		}
		
		
		
		
		
		
		
		
	}
	
//	public void settings() {		
//		
//	}
//	
//	public void setup() {
//		
//	}
//	
//	public void draw() {
//		
//	}

}
