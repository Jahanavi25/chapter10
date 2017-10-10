/* Class to test if it displays the enum constants with their durations*/

package enumerations;


public class TrafficLightTest{
	public static void main(String[] args){
	
	TrafficLight lights = null;
	System.out.println("RED LIGHT:"+lights.RED.getTime()+"MINUTES");
	System.out.println("YELLOW LIGHT:"+lights.YELLOW.getTime()+"MINUTES");
	
	System.out.println("GREEN LIGHT:"+lights.GREEN.getTime()+"MINUTES");

}
}
