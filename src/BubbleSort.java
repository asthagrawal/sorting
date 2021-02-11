
public class BubbleSort {
	
	void bubbleSort(int arr[])
	{
		int N= arr.length;
		for(int i = 0; i<N-1; i++)
			for(int j=0; j<N-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					
					int temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}

	/* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSort ob = new BubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
        

	}

}
