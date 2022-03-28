package main;

public class SuperDepartment {
	public static void main(String[] args)
	{
		SuperDepartment sup=new SuperDepartment();						
		System.out.println("Welcome to "+sup.departmentName());			
		System.out.println(sup.getTodaysWork());
		System.out.println(sup.getWorkDeadline());
		System.out.println(sup.isTodayAHoliday());
	}
	private char[] isTodayAHoliday() {
	
		return null;
	}
	private char[] getWorkDeadline() {

		return null;
	}
	private char[] getTodaysWork() {
		
		return null;
	}
	private String departmentName() {
	
		return null;
	}
	public class AdminDepartment{
		public static void main(String[] args)
		{
		
		AdminDepartment ad=new AdminDepartment();						
		System.out.println("Welcome to "+ad.departmentName());			
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		}
		
		
		private char[] getWorkDeadline() {
			
			return null;
		}


		private char[] getTodaysWork() {
		
			return null;
		}


		private String departmentName() {
			
			return null;
		}


		public class HrDepartment{
			public static void main(String[] args)
			{
		
		HrDepartment hr=new HRDepartment();								
		System.out.println("Welcome to "+hr.departmentName());			
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
			}
		
		private char[] getWorkDeadline() {
		
				return null;
			}

		private char[] getTodaysWork() {
			
				return null;
			}

		private char[] doActivity() {
			
				return null;
			}

		private String departmentName() {
			
				return null;
			}
		public class TechDepartment{
			public static void main(String[] args)
			{

		TechDepartment td=new TechDepartment();							
		System.out.println("Welcome to "+td.departmentName());			
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}

	private char[] isTodayAHoliday() {
		
		return null;
	}

	private char[] getWorkDeadline() {
	
		return null;
	}

	private char[] getTodaysWork() {
	
		return null;
	}

	private String departmentName() {
		
		return null;
	}

		}
		}
	}
}
		
