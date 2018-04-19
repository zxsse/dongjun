package Study.lotto;

import java.util.EmptyStackException;

public interface LottoInterface 
{
	public boolean inDuplicated(int []arr , int num, int size) throws Exception; //size�� �����ϼ��� �־ 
	public int randomUnsignedInteger(int min, int max) throws Exception; //�������� ���ڻ��� (����) �����ϼ��վ
	public void createLotto(int []arr , int min, int max) throws Exception; // ���� randomInterger������
	public int rank(int[] win, int[] arr) throws Exception;
}

class lotto implements LottoInterface 
{

	@Override
	public boolean inDuplicated(int[] arr, int num, int size) throws Exception {
		// TODO Auto-generated method stub
		if(size < 0)
			throw new Exception("Ž���� ������ ���� �� �� ����");
		if(size > arr.length)
			throw new Exception("Ž���� ������ �迭�� ũ�⺸�� " + " Ŭ������");
		for(int i = 0;i< size ; i++)
		{
			if (arr[i] == num)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public int randomUnsignedInteger(int min, int max) throws Exception {
		// TODO Auto-generated method stub
		if(min < 0  || max <0) throw new Exception("������ �������� ���� �� �� ����");
		if(max < min)
		{
			int tmp = max;
			max = min;
			min = tmp;
		}
		
		return (int)(Math.random()*(max-min+1))+min;
	}

	@Override
	public void createLotto(int[] arr, int min, int max) throws Exception
	{		     
				if(arr.length >Math.abs(max-min))
					throw new Exception(" ������ �������� �迭�� ũ�Ⱑ ŭ");
			      for(int cnt =0; cnt <arr.length;) //cnt ���� �迭������Ǿ��մ°���
			      {
			         int tmp = randomUnsignedInteger(min, max);
			         if(!inDuplicated(arr, tmp, cnt))
			         {
			        	 arr[cnt] = tmp;		
			        	 cnt++;
		        		 
			         }
			        		 
			        	 
			        	
		
	}
	
}

	@Override
	public int rank(int[] win, int[] arr) throws Exception 
	{
	
		int cnt = 0; //���� ����
		boolean isBonus = false;
		if(win.length != 7 && arr.length != 6)
			throw new Exception("��÷��ȣ �Ǵ� ������ȣ ������ " + "�߸� �Ǿ����ϴ�.");
		for (int i=0; i<arr.length; i++)
		{
			if(inDuplicated(arr, win[i], arr.length))
			{
				cnt++;
			}
		}
		if(inDuplicated(arr,win[6], arr.length))
			isBonus = true;
		
		if(cnt == 6)
			return 1;
		else if (cnt == 5)
		{
			if(isBonus)
				return 2;
			else
				return 3;
		}
		else if(cnt == 4) 
			return 4;
		else if(cnt == 3)
			return 5;
		else 
		return  -1;
		
	}

	public void printArr(int[] arr)
	{
		// TODO Auto-generated method stub
		for(int i =0; i < arr.length; i++)
		{
		System.out.print(arr[i] + " ");
		
		}System.out.println();
		
	}
}