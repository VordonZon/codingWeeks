package week03;

public class Heehee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HeeHee");
		
		String[] students = new String[3];
		
		students[0] = "Tom Foolery";
		students[1] = "Stan Lee";
		students[2] = "Bill Nye";
		
		for (String student : students) {
			System.out.println(student);
		}
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName,lastName);
		
		System.out.println(fullName);
		
		
		//answer with instructor help
		int numInt = 234;
		String numString = String.valueOf(numInt);
		
		int sum = 0;
		for (int i=0;i<numString.length();i++) {
			sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
		}
		
		//Instructor answer
		int result = 0;
		while(numInt > 0) {
			//when numInt = 234
			//numInt adds the remainder 4 to result
			result += numInt % 10;
			
			//numInt dives 234 / 10 = 23.4 then becomes 23 since int cuts decimals
			numInt /= 10;
		}
		System.out.println(result);
		
		
		
	}
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
	
	
	
}
