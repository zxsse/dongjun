package study.student.collection;



/* 1. �������
 *    �г�,�� ,��ȣ,�̸�,����,����,����s
 * 2. getter �� setter
 *    getter : ����������
 *    setter : chainning���Ȱ��	
 * 3. ������
 *    
 * 4. ��� �޼ҵ�
 * 4.1 �Ϲݸ޼ҵ�
 * 4.2 �θ�Ŭ������ �޼ҵ� �������̵� 
 * 4.2.1 hashcode()
 * 4.2.2 equals()
 * 4.2.3 toString() -> ����
 */
public class Student
{
	private String name;  //�̸�
	private int grade;  //�г�
	private int classNumber;  //��
	private int number;  //��ȣ
	private double kor;  //����
	private double eng;  //����
	private double math; //����
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
	{	//return 1; �׷��� �б�1���� ����
		//return grade; �г��� ���� 3���� �׷����
		return grade*100 + classNumber +number ;
		//�г� ���� ���� 30���� �׷� ����
		//1�г�2�� =3 2�г� 1�� = 3
		//100�� ���ؼ� 102,201
		
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof Student) //instanceof ����ȯ�̰�������
		{										 //Null ���̸� ����ȯ�ص� �����̾�� null�̾ƴϿ�����
		    Student tmp = (Student)obj; 
	          if(this.number == tmp.number)
	      	return true;
    	
		}
		return false;
		
	}
	
	
	
	 public String toString()
	    {
	    	super.toString();
	    	return "[ �̸� :"+ name + ", �г� :" + grade + ", �� :" + classNumber +", ��ȣ :" + number +", ���� :" 
	    			+ kor +", ���� :" + eng + ",���� " + math + "]";
	    }
	 
		public void printStudent()
		{
			System.out.println("----------------");
			System.out.println(" �л����� ��� ");
			System.out.println("�л��̸� : " + name);
			System.out.println("�л��г� : " + grade);
			System.out.println("�л��� : " + classNumber);
			System.out.println("�л���ȣ : " + number);
			System.out.println("���� ���� : " + kor);
			System.out.println("�����  : " + eng);
			System.out.println("���м���  : " + math);
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

 	