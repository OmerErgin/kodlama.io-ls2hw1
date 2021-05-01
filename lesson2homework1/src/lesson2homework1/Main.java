package lesson2homework1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.id=120;
		category1.name="Programlama";
		
		Instructor instructor1=new Instructor();
		instructor1.id=920;
		instructor1.name="Engin Demiro�";
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", "Yaz�l�m geli�tirici yeti�tirme kamp�","Engin Demiro�", 0);
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)", "Yaz�l�m geli�tirici yeti�tirme kamp�","Engin Demiro�", 0);
		Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs", "Temel programlama mant���","Engin Demiro�", 0);
		
		Course[] courses= {
				course1,
				course2,
				course3,
		};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Member member1=new Member(01, "�mer", "deneme@gmail.com", "1234");
		Member member2=new Member(02,"Ece","deneme1@gmail.com","5678");
		
		Member[] members= {
				member1,
				member2
		};
		
		for (Member member: members) {
			System.out.println(member.name);
		}
		
		Login login = new Login();
		login.login(member1);
		
		TermsOfService termsOfService = new TermsOfService();
		termsOfService.getTermsOfService();
		
		
	}

}
