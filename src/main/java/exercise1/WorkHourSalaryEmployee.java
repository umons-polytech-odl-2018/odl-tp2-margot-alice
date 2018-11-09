package exercise1;
//salaire mensuel = taux horaire * heures prestées
public class WorkHourSalaryEmployee extends Employee {
	private int hourlyRoute;

	public WorkHourSalaryEmployee(String name, int hourlyRoute){
		super(name,0,0);
		this.hourlyRoute=hourlyRoute;
	}
	@Override
	public int computeSalary()
	{
		return (this.hourlyRoute*this.workedHours);
	}
}
