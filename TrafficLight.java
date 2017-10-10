/* To write an enumtype traffic light
 
 * Where each trafficlight(RED,GREEN,YELLOW) takes one parameter - the duration of the light
 
 * to check if it displays the enum constants with their durations
  
 
 * */

package enumerations;

public enum TrafficLight {
	
	/* Defining enum constants with the parameter */
	
	
	RED(1),
	GREEN(3),
	YELLOW(5);
	
	
	
	private final int time;    
	
	TrafficLight(int time){
		this.time = time;
	}
	
	public int getTime(){
		return time;
	}
	

}
