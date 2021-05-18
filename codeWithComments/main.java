// Java Program to Remove Duplicate Elements from the Array 
// Assumption: Input array is sorted
 
 
//Test case 1 = {7,(-1,-1,-1,0,0,2,2 )}    output= {(-1,0,2)}
//Test case 2={ 20, (1,1,1,2,2,3,3,3,3,4,5,5,6,7,7,7,11,11,15,17)} 	output= {(1,2,3,4,5,6,7,11,15,17)}
//Test case 3={7,(-10,-9,-5,-5,-5,-3,-3)} output={(-10,-9,-5,-3)}
//Test case 4= {0,()} output={()}

public class Main {
    public static int removeDuplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
 
		// check if the ith element is not equal to
        // the (i+1)th element, then add that element
        // at the jth index in the temporary array
        // which indicates that te particular element
        // will only be added once in the array
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
	
 
    public static void main(String[] args)
    {
		//take the input array.
        System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
        
        int j=0;
       
        // the function will modify the array a[]
        // such that the starting j elements
        // will be having all unique elements
        // and no element will be apearing more than
        // once
        j = removeDuplicates(a, n);
 
        // printing array elements
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }
}