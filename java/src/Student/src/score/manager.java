package score;

public class manager
{   //final ������ ���ȭ ��Ű�� Ű����
	public static final int STUDENT_MAX = 30;
	private student []std;
	private int cnt = 0; //���� ����� �л���
	/*int []arr,arr2;
	int arr3[], arr4;*/
	public manager()
	{
		std = new student [STUDENT_MAX];
	}
	
	
	public void addstudent(String name, int grade, int classNumber, int number, int kor, int eng, int math)
	{
		std[cnt]=new student(name, grade, classNumber, number, kor, eng, math);
		cnt++;
	}
	public void printstudent()
	{
		for(student s:std)    // ���� for��
		{
			if(s != null)
				s.printinfo();
		}
		/*for(int i=0; i<cnt; i++)   �����̰�����
		{
			std[i].printinfo();
		}*/  
	}
	public void modifystudent(int searchGrade, int searchClassNumber, int searchNumber, String modifyName, int modifyKor, int modifyMath ,int modifyEng)
	{
		for(int i = 0; i<cnt ; i++)
		{
			if(std[i].compareTo(searchGrade,searchClassNumber,searchNumber))
			{
				
				std[i].setName(modifyName);
				std[i].setKor(modifyKor);
				std[i].setEng(modifyEng);
				std[i].setMath(modifyMath);
	}
}
}
}