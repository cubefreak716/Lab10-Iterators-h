import processing.core.PApplet.*;

public class City{

	String n;
	boolean c;
	float pop;
	
	public City(String name, boolean capital, float population_density){
		n = name;
		c = capital;
		pop = population_density;
	}
	
	public String getName() {
		return(n);
	}
	
	public boolean isCapital() {
		return c;
	}
	
	public float getPopulationDensity() {
		return pop; 
	}
	
}
