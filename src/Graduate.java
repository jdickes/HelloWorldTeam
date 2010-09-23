
public class Graduate implements Student{
	String name ;
	
	Graduate(String studentName){
		name = studentName;
	}
	
	public String getName(){
		return name;
	}
	
	public String computeGrade(double score){
		String grade ;
		
		if(score >= 90){
			grade = "pass";
			
		}
		else
			grade = "fail";
		
		return grade;
	}
}
