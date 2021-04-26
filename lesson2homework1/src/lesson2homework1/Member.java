package lesson2homework1;

public class Member {
		public Member(int id,String name, String email, String password) {
			System.out.println("Üye oluþturuldu.");
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
