package lesson2homework1;

public class Course {
		public Course (int id,String name,String detail,String educator,double price) {
				
				System.out.println("Constructor �al��t�.");//nesne �rne�i olu�turuldu�una dair sim�lasyon ama�l�
				this.id=id;
				this.name=name;
				this.detail=detail;
				this.educator=educator;
				this.price=price;
		}
		
		int id;
		String name;
		String detail;
		String educator;
		double price;
		
}
