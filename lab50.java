package model;
import java.lang.*;


class SuperDepartment								//super class
{
	public String departmentName()
	{
		return "Super Department";					//returns the super department
	}
	public String getTodaysWork()
	{
		return "No Work as of now";					//returns no work
	}
	public String getWorkDeadline()
	{
		return "Nil";								//returns Nil
	}
	public String isTodayAHoliday()
	{
		return "Today is not a Holiday";			//returns not a holiday
	}
}

class AdminDepartment extends SuperDepartment		
{
	public String departmentName()
	{
		return "Admin Department";					
	}
	
	public String getTodaysWork()
	{
		return "Complete your documents Submission";	
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD";						
	}
}

class HrDepartment extends SuperDepartment				
{
	public String departmentName()
	{
		return "HR Department";						
	}
	public String getTodaysWork()					
	{
		return "Fill today's timesheet and mark your attendance";
	}
	public String getWorkDeadline()						
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "team Lunch";
	}
}

class TechDepartment extends SuperDepartment			
	public String departmentName()						
		return "Tech Department";
	}
	public String getTodaysWork()						
	{
		return "Complete coding of module 1";
	}
	public String getWorkDeadline()						
	{
		return "Complete by EOD";
	}
	public String getTechStackInformation()
	{
		return "core Java";
	}
}