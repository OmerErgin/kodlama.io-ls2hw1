package lesson2homework1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.id=120;
		category1.name="Programlama";
		
		Instructor instructor1=new Instructor();
		instructor1.id=920;
		instructor1.name="Engin Demiroð";
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", "Yazýlým geliþtirici yetiþtirme kampý","Engin Demiroð", 0);
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)", "Yazýlým geliþtirici yetiþtirme kampý","Engin Demiroð", 0);
		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Temel programlama mantýðý","Engin Demiroð", 0);
		
		Course[] courses= {
				course1,
				course2,
				course3,
		};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Student student1=new Student(01, "Ömer", "deneme@gmail.com", "1234");
		Student student2=new Student(02,"Ece","deneme1@gmail.com","5678");
		
		Student[] members= {
				student1,
				student2
		};
		
		for (Student student: members) {
			System.out.println(student.name);
		}
		
		Login login = new Login();
		login.login(student1);
		
		TermsOfService termsOfService = new TermsOfService();
		termsOfService.getTermsOfService();
		
		
	}

}
