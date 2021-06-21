package sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author JZ
 * @Date 2021/6/17 16:37
 * @Version 1.0
 **/

 class BubbleSort {
    public static int[] sort(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }

        }

        return input;
    }

}
class ChoseSort{
     public  static  int [] sort(int [] input){


         for (int i = 0; i <= input.length-1; i++) {
             for (int j = i; j <=input.length - 1; j++) {
                 if (input[j] < input[i]) {
                     int temp=input[i];
                     input[i] = input[j];
                     input[j]=temp;
                 }
             }
         }

         return input;
     }

    public static void main(String[] args) {
        int [] input={11,2,65,89,45,35,999,8,55,66,75};
         ChoseSort.sort(input);
        for (int i : input) {
            System.out.println(i);
        }
    }


}
class InsertSort{
     public  static  int [] sort(int [] input){

         for (int i = 1; i <input.length ; i++) {
             int j=i;
             while (j>=1&&input[j]<input[j-1] ) {
                int temp=input[j];
                input[j]=input[j-1];
                input[j-1]=temp;
                 j--;
             }


         }
         return  input;
     }


    public static void main(String[] args) {
        int [] input={11,2,65,89,45,35,999,8,55,66,75};
        InsertSort.sort(input);
        for (int i : input) {
            System.out.println(i);
        }
    }
}
class ShellSort{
     public  static  int [] sort(int [] input){
         int length = input.length;
         int h=1;
         while(h<length/2){
             h=h*2+1;
         }

         while(h>=1){
             for (int i = 1; i <input.length ; i++) {
                for (int j=i;j>=h;j-=h){
                    if (input[j]<input[j-h]){
                        int temp =input[j];
                        input[j]=input[j-h];
                        input[j-h]=temp;
                    }
                    else {
                        break;
                    }
                }
             }
             h/=2;
         }
         return  input;

     }
     public  static  void change(int [] a){
         a[1]=9999;
     }
    public static void main(String[] args) {
        int [] input={11,2,65,89,45,35,999,8,55,66,75};
       ShellSort.sort(input);

        for (int i : input) {
            System.out.println(i);
        }
    }
}
class MergeSort{
     public  static  void  sort(int [] arr){
         int [] temp =new int[arr.length];
         sort(arr,0,arr.length-1,temp);
     }

    private static void sort(int[] arr, int left, int right, int[] temp) {

         if (left <right){
             int mid=(left+right)/2;
             sort(arr, left, mid, temp);
             sort(arr, mid+1, right, temp);
             merge(arr,left,mid,right,temp);
         }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {

         int i =left;
         int j= mid+1;
         int t=0;
         while (i <=mid && j<=right){
             if (arr[i]<=arr[j]){
                 temp[t++]=arr[i++];
             }
             else {
                 temp[t++]=arr[j++];
             }
         }
         while (i<=mid){
             temp[t++]=arr[i++];
         }
         while (j<=right){
             temp[t++]=arr[j++];
         }
         t=0;
         while (left<=right){
             arr[left++]=temp[t++];
         }



    }

    public static void main(String[] args) {
        int [] input={11,2,65,89,45,35,999,8,55,66,75};
         sort(input);

        System.out.println(Arrays.toString(input));
    }
}
class QuickSort{
     public  static  void sort(int [] arr){
         int midValue=arr[0];
         sort(arr,0,arr.length-1);
     }

    private static void sort(int[] arr, int left, int  right) {
         if (left<right) {

             int pivotIndex = partition(arr, left, right);
             sort(arr, left, pivotIndex - 1);
             sort(arr, pivotIndex + 1, right);
         }
    }

    private static int partition(int[] arr, int left, int right) {
         int midValue=arr[left];

         while (left<right){
             while (left<right && arr[right]>=midValue){
                right--;
             }
             arr[left]=arr[right];

             while(left<right && arr[left]<=midValue){
                 left++;
             }
             arr[right]=arr[left];

         }
         arr[left]=midValue;
         return left;


    }

    public static void main(String[] args) {
        int [] input={11,2,651,89,45,35,999,8,55,66,75};
        QuickSort.sort(input);
        System.out.println(Arrays.toString(input));
    }

}
