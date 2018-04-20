package Study.student;

public class Student 
{
	private String name;  //�̸�
	private int grade;  //�г�
	private int classNumber;  //��
	private int number;  //��ȣ
	private double kor;  //����
	private double eng;  //����
	private double math; //����
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

 /* 3.������
  * 3.1 ����Ʈ ������ ����� - �Ű������� ����
  * 3.2 ������ �����ε��� �̿��Ͽ� �Ű������� �̸�,�г�,��, ��ȣ,���� ,����,������
  *     �־����� �� �� ������� ������ ����
  * 3.3 �����ڿ����ε��� �̿��Ͽ� �Ű������� �̸�,�г�,��,��ȣ�� �־� ���� ��
  * 	����� ������ �ش��ϴ� �Ű� ���� ���� ����    �ϴµ� 3.2���� ������ �����ڸ� 
  * 	�̿� �� �� �ִ�.
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
	/* 4. �޼ҵ����
	 * 4.1��¸޼ҵ� = �л������� ����ϴ� �޼ҵ�
	 *    �ʿ��� �Ű������� ����
	 *    ����Ÿ���� ����.
	 *    �޼ҵ�� : printStudent 
	 * 4.1.1 System.out.println�� �̿��Ͽ� �л� ������ ����Ѵ�.
	 * 
	 * 4.2 ���� ���� �޼ҵ� - �л� �����������Ѵ�
	 * 	    �ʿ��� �Ű������� �̸�,�г�,��,��ȣ,����,����,����
	 * 	  ����Ÿ���� ����(void)
	 *   �޼ҵ�� : modifyStudent
	 * 4.2.1 setter(set�޼ҵ�)�� ���ؼ� �� �Ű����� ����κ���(�����ڿ͵����� ����)
	 * 		 �ٸ� �Ű������� �޼ҵ���̴ٸ�
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





