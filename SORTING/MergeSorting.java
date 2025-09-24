package SORTING;
public class MergeSorting {           //---> TC = O(nlogn)

     public static void mergeSort(int arr[] , int si , int ei){

          if(si >= ei){
               return;
          }

          int mid = (si+(ei-si))/2;

          //left part ki sorting
          mergeSort(arr,si,mid);

          //right part ki sorting
          mergeSort(arr,mid+1,ei);

          //merging 
          merge(arr,si,mid,ei);
     }

     public static void merge(int [] arr , int si ,int mid, int ei){
          int temp [] = new int[ei-si+1];

          int i = si; //for left part
          int j = mid+1;  //for right part
          int k = 0;

          //sorting
          while(i <= mid && j <= ei){
               if(arr[i] < arr[j]){
                    temp[k] = arr[i];
                    i++;
               }else {
                    temp[k] = arr[j];
                    j++;
               }
               k++;
          }

          //left ke leftover elements
          while( i <= mid){
               temp[k++] = arr[i++];
          }

          //right ke leftover elements
          while( j <= ei){
               temp[k++] = arr[j++];
          }

          //store the temp into the original elements

          for(i = si , k = 0 ; k < temp.length ; i++,k++){
               arr[i] = temp[k];
          }
     }

     public static void printArr (int arr[]){
          
          int i = 0;
          while(i < arr.length){
               System.out.print(arr[i]+" ");
          }
          System.out.println();
     }
     public static void main (String [] args){
          int [] arr = {6, 3, 9, 5, 2, 8};
          mergeSort(arr,0,arr.length-1);

          printArr(arr);
     }
}