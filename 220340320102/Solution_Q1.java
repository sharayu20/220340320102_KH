import java .util.*;
class Result{
	public static void insertionSort1(int n, List<Integer>arr){
		 int lenght;
		 int elementToInserted=arr[lenght-1];
		 for(int i=lenght-2;i>=0;i--){
			 if(arr[i]>elementToInserted){
				 arr[i+1]=arr[i];
				 printArray(arr);
				 

			 }
			 else{
				 arr[i+1]=elementToInserted;
				 printArray(arr);
				 break;
			 }
			 if((i==0) &&(arr[i]>elementToInserted)){
				 arr[i]=elementToInserted;
				 printArray(ar);
			 }
		 }
	}

class Solution_Q1{
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		int s=in.nextInt();
		int arr[]=new int[s];
		for(int i=0;i<s;i++){
			arr[i]=in.nextInt();
		}
		insertionSort1(arr);
		in.close();
	}
		private static void printArray(int []arr)
		{
			for(int n :arr){
				System.out.println(n+"");
				
			}
			System.out.println("");
				
		}}