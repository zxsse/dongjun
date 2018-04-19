package Study.student;

public class StudentManager 
{
	/*	1. �ʿ��Ѹ������
	 * 	1.1�л� Ŭ������ �迭
	 * 	1.2�л��� �ִ� ���� �����ϴ� ���� : int 
	 * 	1.3���� ����� �л��� �� : int
	 */
	
     private Student [] std;
     private int maxCount;
     private int nowCount;
     
     
     
     
     /*	2. getter setter ����      */
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
    		
     
	/*	3.������
	 * 	3.1 ����Ʈ ������ - �ɹ� ��ü std�� �迭�� new �����ڸ����� �����Ѵ�.
	 * 		�� �� �����Ǵ� �迭�� ������ (�ִ�) 30���� �Ѵ�.
	 * 	3.2 ������ �����ε� - �Ű������� ������ �迭�� ũ��(int)�� �Ѱܹ޾� �ش�ũ�⸦ �̿��Ͽ� 
	 * 	   	�迭�������Ѵ�. 
	 */
	public StudentManager()  
	{
		 //maxCount=30;
		//std = new  Student[maxCount];  
		 this(30); //������ ���ٰ����� //std�������� �迭�̶�� �����߱⶧����
	}
	public StudentManager(int size) throws RuntimeException
	{
		if(size <= 0)
			throw new RuntimeException("�迭�� ũ�� 0 or ���� �Ұ� ");
		 maxCount = size;
		 std = new Student[maxCount];   //���ο��� ���� �����Ͽ� ���� �� �ֵ����Ѵ�.
	}
	
	
	/* 	4. �ʿ��� �޼ҵ� ����
	 * 	4.1 �л������� �߰��ϴ� �޼ҵ�
	 * 	4.1.1 �ʿ��� �Ű����� : �л������� (�̸�,�г�,��,��ȣ,����,����,����)
	 * 	4.1.2����Ÿ�� : ����(void)
	 * 	4.1.3�޼ҵ�� : insert
	 * 	4.1.4���� : 
	 * 	4.1.4.1 ��ü�� �Է¹��� �Ű������� ���� �����ؾߵǴµ� �����ϴ� �迭�� ������
	 * 			nowCount������ ����
	 * 	4.1.4.2 ���� ���� �� �л��� (nowCount)�� ����
	 * 	4.2 �л����� ������ ����ϴ� �޼ҵ�
	 * 	4.2.1�ʿ��� �Ű����� : ����
	 * 	4.2.2����Ÿ�� : ����(void)
	 * 	4.2.3�޼ҵ�� : print
	 *  4.2.4����
	 *  4.2.4.1 �ݺ������̿��Ͽ� �л������� ����Ǿ��ִ¹迭(std)�� 0�������� �����ؼ� ��������� �л���
	 *			(nowCnt)-1 ���� ������ ����ϴµ� �л� ������ ��� �� �� StudentŬ������ ��� �޼ҵ� print
	 *			�޼ҵ带 �Է��Ѵ�.(�ݺ������)  
	 *	4.3 �л� ���� �˻� �޼ҵ� 
	 *	4.3.1 �Ű�����:  �г�,��,��ȣ
	 *  4.3.2 ����Ÿ�� : ����( [?] ) int��
	 *  4.3.3 �޼ҵ�� : searchIndex
	 *  4.3.3.1 �ݺ����� �̿��ϴµ� 0���� nowCount -1 ���� �ݺ��Ѵ�.
	 *  4.3.3.2 �ݺ������� �Ű����� �г�,�� ,��ȣ �� ���� ��ġ�ϴ� ��ü���ִ��� ���ǹ��� ���� Ȯ���Ѵ�.
	 *  4.3.3.3 Ȯ���Ͽ� �ش簴ü�� �����ϸ� �ش��ϴ� ������ �����ϰ� ���ΰ˻��� �ߴµ� ��ã���� -1�� �����Ѵ�.
	 *  4.4 �л� ���� ���� �޼ҵ�
	 *  4.4.1 �Ű����� : �г�,��,��ȣ,�̸� ,����,���� ,����
	 *  4.4.1.1 �˻��� ���� �Ű����� : �г�, ��,��ȣ
	 * 	4.4.1.2 ���������� �Ű�����: �̸�, ����,����, ����
	 *  4.4.2 ����Ÿ�� : �л� ��ü(Student)
	 *  4.4.3 �޼ҵ�� : modify
	 *  4.4.4 ����
	 * 	4.4.4.1 �Ű����� �г�,��,��ȣ�� ���� �л� �迭�� �˻��Ͽ� �ش��л� ������ ������ �ش������ �л�������
	 * 			�Ű����� �̸�, ����, ����, �������� �����Ѵ�
	 * 			�� �� StudentŬ������ modifyStudent�� �̿��Ѵ�.
	 *  4.4.4.2 ������ �� �ش� ��ü�� �����Ѵ�.
	 * 	4.4.4.3 �ش��л��� ������ ������ NULL���� �����Ѵ�.
	 */
	
	
	public void insert(String name, int grade, int classNumber, int number, double kor, double eng, double math) 
	{
		if(nowCount == maxCount)
		throw new RuntimeException("���̻� ���� �� �� �����ϴ�.");
		if(searchIndex(grade, classNumber, number) != -1)
			throw new RuntimeException("�̹� �ش��ϴ�" + "�л��� ������ �ֽ��ϴ�.");
		std[nowCount++] = new Student(name, grade, classNumber, number, kor, eng, math); 
		
		
		/*  �˻����ؼ�  �Ű�������  �г�, ��, ��ȣ��  ������ ��ġ�ϴ� ��ü�� ������ �л����� �߰��� �����ʰ� ���� ó���� ��*/
		
		
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
			if(grade == std[i].getGrade() && classNuber == std[i].getClassNumber() &&  number == std[i].getNumber())
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




