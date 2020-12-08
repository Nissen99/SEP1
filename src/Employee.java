public class Employee
{
  private int employeeID;
  private String employeeName;
  private int numberOfProjects;
  private String role;

  public Employee(String employeeName)
  {
    this.employeeName = employeeName;
    this.role = "Team member";
  }

  public void setRole(String role){

this.role = role; //Switch case later
  }

  public Employee copy(){

    Employee placeHolder = (Employee) this; //Måske virker det her ??

    return placeHolder;
  }

  public String getRole()
  {
    return role;
  }

  public int getEmployeeID()
  {
    return employeeID;
  }

  public String getEmployeeName()
  {
    return employeeName;
  }

  public int getNumberOfProjects()
  {
    return numberOfProjects;
  }

}
