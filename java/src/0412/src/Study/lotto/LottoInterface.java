package Study.lotto;

import java.util.EmptyStackException;

public interface LottoInterface 
{
	public boolean inDuplicated(int []arr , int num, int size) throws Exception; //size가 음수일수도 있어서 
	public int randomUnsignedInteger(int min, int max) throws Exception; //랜덤으로 숫자생성 (정수) 음수일수잇어서
	public void createLotto(int []arr , int min, int max) throws Exception; // 위에 randomInterger때문에
	public int rank(int[] win, int[] arr) throws Exception;
}

class lotto implements LottoInterface 
{

	@Override
	public boolean inDuplicated(int[] arr, int num, int size) throws Exception {
		// TODO Auto-generated method stub
		if(size < 0)
			throw new Exception("탐색할 갯수는 음수 일 수 없음");
		if(size > arr.length)
			throw new Exception("탐색할 갯수는 배열의 크기보다 " + " 클수없음");
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
		if(min < 0  || max <0) throw new Exception("음수를 랜덤으로 생성 할 수 없음");
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
					throw new Exception(" 랜덤의 범위보다 배열의 크기가 큼");
			      for(int cnt =0; cnt <arr.length;) //cnt 현제 배열에저장되어잇는갯수
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
	
		int cnt = 0; //맞힌 갯수
		boolean isBonus = false;
		if(win.length != 7 && arr.length != 6)
			throw new Exception("당첨번호 또는 생성번호 갯수가 " + "잘못 되었습니다.");
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