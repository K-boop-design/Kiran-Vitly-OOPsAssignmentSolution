package techDepartment;
import superDepartment.SuperDepartment;
public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Tech Department";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "core Java";
	}
}

