package Study.student;

public class Student 
{
	private String name;  //이름
	private int grade;  //학년
	private int classNumber;  //반
	private int number;  //번호
	private double kor;  //국어
	private double eng;  //영어
	private double math; //수학
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}

 /* 3.생성자
  * 3.1 디폴트 생성자 만들기 - 매개변수가 없는
  * 3.2 생성자 오버로딩을 이용하여 매개변수가 이름,학년,반, 번호,국어 ,영어,수학이
  *     주어졌을 때 각 멤버변수 값들을 저장
  * 3.3 생성자오버로딩을 이용하여 매개변수가 이름,학년,반,번호가 주어 졌을 때
  * 	각멤버 변수에 해당하는 매개 변수 값을 저장    하는데 3.2에서 생성한 생성자를 
  * 	이용 할 수 있다.
  */
  
	public Student() {}

	public Student(String name, int grade, int classNumber, int number, double kor, double eng, double math)
	{
		this.setName(name);	
		this.setGrade(grade);
		this.setClassNumber(classNumber);
		this.setNumber(number);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	public Student(String name, int grade, int classNumber, int number)
	{
		this(name,grade,classNumber,number,0,0,0);
		
	}
	/* 4. 메소드생성
	 * 4.1출력메소드 = 학생정보를 출력하는 메소드
	 *    필요한 매개변수는 없다
	 *    리턴타입은 없다.
	 *    메소드명 : printStudent 
	 * 4.1.1 System.out.println을 이용하여 학생 정보를 출력한다.
	 * 
	 * 4.2 정보 수정 메소드 - 학생 정보를수정한다
	 * 	    필요한 매개변수는 이름,학년,반,번호,국어,영어,수학
	 * 	  리턴타입은 없다(void)
	 *   메소드명 : modifyStudent
	 * 4.2.1 setter(set메소드)를 통해서 각 매개변수 값들로변경(생성자와동일한 형태)
	 * 		 다만 매개변수랑 메소드명이다름
	 */
	
	
	
	public void modifyStudent(String name, int grade, int classNumber, int number, double kor, double eng, double math)
	{
		this.setName(name);
		this.setGrade(grade);
		this.setClassNumber(classNumber);
		this.setNumber(number);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
		
	}
	public Student clone()
	{
		Student tmp = new Student(this.getName(),this.getGrade(),this.getClassNumber(),this.getNumber(),this.getKor(),this.getEng(),this.getMath());
		return tmp;
	}
	
}





