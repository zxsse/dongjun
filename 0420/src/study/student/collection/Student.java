package study.student.collection;



/* 1. 멤버변수
 *    학년,반 ,번호,이름,국어,영어,수학s
 * 2. getter 와 setter
 *    getter : 이전과동일
 *    setter : chainning기법활용	
 * 3. 생성자
 *    
 * 4. 멤버 메소드
 * 4.1 일반메소드
 * 4.2 부모클레스의 메소드 오버라이딩 
 * 4.2.1 hashcode()
 * 4.2.2 equals()
 * 4.2.3 toString() -> 선택
 */
public class Student
{
	private String name;  //이름
	private int grade;  //학년
	private int classNumber;  //반
	private int number;  //번호
	private double kor;  //국어
	private double eng;  //영어
	private double math; //수학
	public String getName() 
	{
		return name;
	}
	public int getGrade() {
		return grade;
	}

	Student setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	public int getClassNumber() {
		return classNumber;
	}
	Student  setClassNumber(int classNumber) {
		this.classNumber = classNumber;
		return this;
	}
	public int getNumber() {
		return number;
	}
	Student  setNumber(int number) {
		this.number = number;
		return this;
	}
	public double getKor() {
		return kor;
	}
	Student  setKor(double kor) {
		this.kor = kor;
		return this;
	}
	public double getEng() {
		return eng;
	}
	Student  setEng(double eng) {
		this.eng = eng;
		return this;
	}
	public double getMath() {
		return math;
	}
	Student  setMath(double math) {
		this.math = math;
		return this;
	}
	Student  setName(String name) {
		this.name = name;
		return this;
	}

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
	public int hashCode()
	{	//return 1; 그룹을 학교1개로 생성
		//return grade; 학년을 통해 3개의 그룹생성
		return grade*100 + classNumber +number ;
		//학년 반을 통해 30개의 그룹 생성
		//1학년2반 =3 2학년 1반 = 3
		//100을 곱해서 102,201
		
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof Student) //instanceof 형변환이가능한지
		{										 //Null 값이면 형변환해도 볼값이없어서 null이아니여야함
		    Student tmp = (Student)obj; 
	          if(this.number == tmp.number)
	      	return true;
    	
		}
		return false;
		
	}
	
	
	
	 public String toString()
	    {
	    	super.toString();
	    	return "[ 이름 :"+ name + ", 학년 :" + grade + ", 반 :" + classNumber +", 번호 :" + number +", 국어 :" 
	    			+ kor +", 영어 :" + eng + ",수학 " + math + "]";
	    }
	 
		public void printStudent()
		{
			System.out.println("----------------");
			System.out.println(" 학생정보 출력 ");
			System.out.println("학생이름 : " + name);
			System.out.println("학생학년 : " + grade);
			System.out.println("학생반 : " + classNumber);
			System.out.println("학생번호 : " + number);
			System.out.println("국어 성적 : " + kor);
			System.out.println("영어성적  : " + eng);
			System.out.println("수학성적  : " + math);
			System.out.println("----------------");
			
		}
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
		public void insert(String name2, int grade2, int classNumber2, int number2, int kor2, int eng2, int math2) {
			// TODO Auto-generated method stub
			
		}
		
	
	
	 
	



















}

 	
