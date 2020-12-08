import java.util.ArrayList;

public class Project
{
  private Client client;
  private ArrayList<Requirement> requirements;
  private MyDate projectDeadline;
  private TeamMemberList teamMemberList;
  private int projectID;
  private String projectName;
  private int projectEstimatedHours;
  private int projectHoursWorked;
  private String projectStatus;


  public Project(String projectName, int projectEstimatedHours, Client client, TeamMemberList teamMemberList, MyDate projectDeadline){
    this.projectName = projectName;
    this.projectEstimatedHours = projectEstimatedHours;
    this.client = client;
    this.teamMemberList = teamMemberList;
    this.projectDeadline = projectDeadline.copy();

    this.projectStatus = "Not Started";

    //Somthing adding reqirements
  }

  public void appointProductOwner(int employeeID){
    for (int i = 0; i < teamMemberList.getNumberOfTeamMembers(); i++)
    {
      if (teamMemberList.getAllTeamMembers().get(i).getRole().equals("product owner")){
        teamMemberList.getAllTeamMembers().get(i).setRole("team member");
      }
    }


    for (int i = 0; i < teamMemberList.getNumberOfTeamMembers(); i++)
    {
      if (teamMemberList.getAllTeamMembers().get(i).getEmployeeID() == employeeID){
        teamMemberList.getAllTeamMembers().get(i).setRole("product owner");
      }
    }
  }

  public Client getClient()
  {
    return client;
  }

  public ArrayList<Requirement> getRequirements()
  {
    return requirements;
  }

  public MyDate getProjectDeadline()
  {
    return projectDeadline;
  }

  public TeamMemberList getTeamMemberList()
  {
    return teamMemberList;
  }

  public int getProjectID()
  {
    return projectID;
  }

  public String getProjectName()
  {
    return projectName;
  }

  public int getProjectEstimatedHours()
  {
    return projectEstimatedHours;
  }

  public int getProjectHoursWorked()
  {
    return projectHoursWorked;
  }

  public String getProjectStatus()
  {
    return projectStatus;
  }
}
