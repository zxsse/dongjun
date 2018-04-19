package score;

public class student
{
		private String name;
		private int grade;
		private int classNumber;
		private int kor;
		private int eng;
		private int number;
		private int math;
		

		
		public student() {}
		public student(String name, int grade, int classNumber, int number)
		{
			this(name,grade,classNumber,number,0,0,0);
		}
		public student(String name, int grade, int classNumber, int number, int kor, int eng, int math)
		{
			this.name =name;
			this.grade = grade;
			this.classNumber = classNumber;
			this.number = number;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		
		public boolean compareTo(student s)
		{/*학년,반,번호가 같으면 같은객체로 취급
		  비록 이름과 성적들이 다르다할지라도   */
			return compareTo(s.grade, s.classNumber, s.number);
		}
		public boolean compareTo(int grade, int classNumber,int number)
		{
			if(this.grade == grade && this.classNumber == classNumber && this.number ==  number)  			
			{
				return true;
			}
			return false;
		}
		
		
		
		public void printinfo()
		{
			System.out.println("이름 : " + name);
			System.out.println("학년 : " + grade);
			System.out.println("학반 : " + classNumber);
			System.out.println("학번 : " + number);
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
		}
		
		
		
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public int getClassNumber() {
			return classNumber;
		}
		public void setClassNumber(int classNumber) {
			this.classNumber = classNumber;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
	
   
	
}

