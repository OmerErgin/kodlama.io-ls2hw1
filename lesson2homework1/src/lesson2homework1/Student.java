package lesson2homework1;

public class Student {
		public Student(int id,String name, String email, String password) {
			System.out.println("Öðrenci oluþturuldu.");
			this.id=id;
			this.name=name;
			this.email=email;
			this.password=password;
			
		}
		
		int id;
		String name;
		String email;
		String password;
		String registeredCourseIds;
}
