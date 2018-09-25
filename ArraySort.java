package array;

public class ArraySort {

	public static void main(String[] args) {
		int nArray[] = { -1, -5, 4, 2, 1};
    	boolean Flag = false;
    	while (!Flag)
    	{
			Flag=true;
      		for (int i = 0; i < nArray.length - 1; i++)
      		{
        		if (nArray[i] < nArray[i + 1])
        		{
          			int temp = nArray[i];
          			nArray[i] = nArray[i + 1];
          			nArray[i + 1] = temp;
          			Flag = false;
        		}
      		}

    	}
    	for(int i=0;i<nArray.length;i++)
      		System.out.println(nArray[i]+" ");
	}

}
