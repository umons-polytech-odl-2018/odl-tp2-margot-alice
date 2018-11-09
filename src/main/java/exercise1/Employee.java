package exercise1;
import exercise2.Payable;
public abstract class Employee implements Payable {
	protected String name;
	protected int Sales=0;
	protected int workedHours=0;
	public int computeSalary() {
		return 0;
	}
	public Employee(String name, int workedHours, int Sales){
		this.name=name;
		this.workedHours=workedHours;
		this.Sales=Sales;

}
	public void sell() {Sales++; }

	public void workOneHour() { workedHours++;}

	public String getName() {
		return name;
	}

}
