
public class Undergraduate implements Student {
	
	String name ;
	
	Undergraduate (String studentName){
		name = studentName;
	}
	
	public String getName(){
		return name;
	}
	
	public String computeGrade(double score){
		String grade ;
		
		if(score >= 60){
			grade = "pass";
			
		}
		else
			grade = "fail";
		
		return grade;
	}

}
