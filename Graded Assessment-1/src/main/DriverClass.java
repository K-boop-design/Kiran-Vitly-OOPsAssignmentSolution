package main;
import adminDepartment.AdminDepartment;
import hrDepartment.HrDepartment;
import techDepartment.TechDepartment;
public class DriverClass {
	public static void main(String [] args) {
		HrDepartment hrObj=new HrDepartment();
		TechDepartment techObj=new TechDepartment();
		AdminDepartment adminObj=new AdminDepartment();
		
		System.out.println("\nWelcome to "+adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());
		
		System.out.println("\nWelcome to "+hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());
		
		System.out.println("\nWelcome to "+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
	}
}
