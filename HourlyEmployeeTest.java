package PackCodeExercises;
public class HourlyEmployeeTest {

	public static void main(String[] args) {
		HourlyEmployee emp=new HourlyEmployee("Jahanavi", "Chowdary", "12345", 50, 1000);
		System.out.println(emp.toString());
	}

}
class Employee
{
	String firstName;
	String lastName;
	String ssn;
}
class HourlyEmployee extends Employee
{
	double hours;
	double wage;
	public HourlyEmployee(String firstName,String lastName,String ssn,double hours,double wage)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
		this.hours=hours;
		this.wage=wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		if(hours>=0 && hours<=1680)
		{
			this.hours = hours;
		}
		else
		{
			throw new IllegalArgumentException("hours must be in between 0 and 168");
		}
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		if(wage>=0)
		{
			this.wage = wage;
		}
		else
		{
			throw new IllegalArgumentException("Wage must be non-negative");
		}
	}
	public double earnings()
	{
		double earning=0;
		earning=hours*wage;
		if(hours>40)
		{
			earning=earning+((hours-40)*wage/2);
		}
		return earning;
	}
	public String toString()
	{
		return "Employee details: \nfirst name:"+firstName+"\nlast name:"+lastName+"\nssn:"+ssn+"\nhours worked:"+hours+"\nhourly wage:"+wage+"\nearnings:"+earnings();
	}
	
}