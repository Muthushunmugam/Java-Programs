package random;



public class University {
	
	String name  = "CIT";
	String address = "Coimbatore";
    public void student()
    {
		String dept = "ECE";
		int roll = 10;
		System.out.println("Student department:"+dept);
		System.out.println("Student roll number:"+roll);
		System.out.println("College :"+name);
		System.out.println("College Address:"+address);
		
    }
	public void staff()
	{
		String sub = "Electronics";
		int section = 2;
		System.out.println("Staff subject:"+sub);
		System.out.println("Staff class:"+section);
		System.out.println("College :"+name);
		System.out.println("College Address:"+address);
		
	}
	public static void main(String args[]) {
		University obj = new University();
		obj.student();
		obj.staff();
	}
			

}
