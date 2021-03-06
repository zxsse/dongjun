package Study.student;

public class StudentManager 
{
	/*	1. 필요한멤버변수
	 * 	1.1학생 클래스의 배열
	 * 	1.2학생의 최대 수를 저장하는 변수 : int 
	 * 	1.3현재 저장된 학생의 수 : int
	 */
	
     private Student [] std;
     private int maxCount;
     private int nowCount;
     
     
     
     
     /*	2. getter setter 생성      */
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getNowCount() {
		return nowCount;
	}
	public void setNowCount(int nowCount) {
		this.nowCount = nowCount;
	}
    		
     
	/*	3.생성자
	 * 	3.1 디폴트 생성자 - 맴버 객체 std의 배열을 new 연산자를통해 생성한다.
	 * 		이 때 생성되는 배열의 갯수는 (최대) 30개로 한다.
	 * 	3.2 생성자 오버로딩 - 매개변수로 생성한 배열의 크기(int)를 넘겨받아 해당크기를 이용하여 
	 * 	   	배열을생성한다. 
	 */
	public StudentManager()  
	{
		 //maxCount=30;
		//std = new  Student[maxCount];  
		 this(30); //두줄이 한줄과같음 //std를위에서 배열이라고 선언했기때문에
	}
	public StudentManager(int size) throws RuntimeException
	{
		if(size <= 0)
			throw new RuntimeException("배열의 크기 0 or 음수 불가 ");
		 maxCount = size;
		 std = new Student[maxCount];   //메인에서 값을 지정하여 넣을 수 있도록한다.
	}
	
	
	/* 	4. 필요한 메소드 구현
	 * 	4.1 학생정보를 추가하는 메소드
	 * 	4.1.1 필요한 매개변수 : 학생정보들 (이름,학년,반,번호,국어,영어,수학)
	 * 	4.1.2리턴타입 : 없다(void)
	 * 	4.1.3메소드명 : insert
	 * 	4.1.4구현 : 
	 * 	4.1.4.1 객체를 입력받은 매개변수를 통해 생성해야되는데 생성하는 배열의 번지는
	 * 			nowCount번지에 저장
	 * 	4.1.4.2 현제 저장 된 학생수 (nowCount)를 증가
	 * 	4.2 학생들의 정보를 출력하는 메소드
	 * 	4.2.1필요한 매개변수 : 없다
	 * 	4.2.2리턴타입 : 없다(void)
	 * 	4.2.3메소드명 : print
	 *  4.2.4구현
	 *  4.2.4.1 반복문을이용하여 학생정보가 저장되어있는배열(std)를 0번지부터 시작해서 현제저장된 학생수
	 *			(nowCnt)-1 까지 정보를 출력하는데 학생 정보를 출력 할 때 Student클래스의 멤버 메소드 print
	 *			메소드를 입력한다.(반복문사용)  
	 *	4.3 학생 정보 검색 메소드 
	 *	4.3.1 매개변수:  학년,반,번호
	 *  4.3.2 리턴타입 : 번지( [?] ) int로
	 *  4.3.3 메소드명 : searchIndex
	 *  4.3.3.1 반복문을 이용하는데 0번지 nowCount -1 까지 반복한다.
	 *  4.3.3.2 반복문에는 매개변수 학년,반 ,번호 와 값이 일치하는 객체가있는지 조건문을 통해 확인한다.
	 *  4.3.3.3 확인하여 해당객체가 존재하면 해당하는 번지를 리턴하고 전부검색을 했는데 못찾으면 -1을 리턴한다.
	 *  4.4 학생 정보 수정 메소드
	 *  4.4.1 매개변수 : 학년,반,번호,이름 ,국어,영어 ,수학
	 *  4.4.1.1 검색을 위한 매개변수 : 학년, 반,번호
	 * 	4.4.1.2 수정을위한 매개변수: 이름, 국어,영어, 수학
	 *  4.4.2 리턴타입 : 학생 객체(Student)
	 *  4.4.3 메소드명 : modify
	 *  4.4.4 구현
	 * 	4.4.4.1 매개변수 학년,반,번호를 통해 학생 배열을 검색하여 해당학생 정보가 있으면 해당번지의 학생정보를
	 * 			매개변수 이름, 국어, 영어, 수학으로 수정한다
	 * 			이 때 Student클래스의 modifyStudent를 이용한다.
	 *  4.4.4.2 수정한 후 해당 객체를 리턴한다.
	 * 	4.4.4.3 해당학생의 정보가 없으면 NULL값을 리턴한다.
	 */
	
	
	public void insert(String name, int grade, int classNumber, int number, double kor, double eng, double math) 
	{
		if(nowCount == maxCount)
		throw new RuntimeException("더이상 저장 할 수 없습니다.");
		if(searchIndex(grade, classNumber, number) != -1)
			throw new RuntimeException("이미 해당하는" + "학생의 정보가 있습니다.");
		std[nowCount++] = new Student(name, grade, classNumber, number, kor, eng, math); 
		
		
		/*  검색을해서  매개변수의  학년, 반, 번호와  정보가 일치하는 객체가 있으면 학생정보 추가를 하지않고 예외 처리를 함*/
		
		
	}
	public void print()
	{
		int i ;
		for( i = 0; i<= nowCount-1 ; i++ )
		{
			std[i].printStudent();
		}	

	}
	public int searchIndex(int grade, int classNuber, int number)
	{
		int i;
		for(i=0 ; i<nowCount ; i++)
		{
			if(grade == std[i].getGrade() && classNumber == std[i].getClassNumber() &&  number == std[i].getNumber())
			 return i;
		}    
		
		return -1;
	}
	
	public Student modify(int grade, int classNumber, int number,String name, double kor, double eng, double math )
	{
		int index = searchIndex(grade, classNumber, number);
		
		if(index == -1)
			 return null;
		std[index].modifyStudent(name, grade, classNumber, number, kor, eng, math);
		
		
	
		
		return std[index].clone();
		
	}
	
	
}





