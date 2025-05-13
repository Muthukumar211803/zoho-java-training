
import java.util.Arrays; 
import java.lang.reflect.Array;
import java.util.Scanner;

 //01 Maximum array
 class Maximumarray {
   
   public static void main(String[] args) {
     
  int[] arr = {3,5,1,9};
   int max = arr[0];
   for(int i = 1; i<arr.length;i++){
      if(arr[i]>max){
      max=arr[i];
      }
      
   }
   System.out.println("Maximum = " + max);
}
 }

 //02 Minimumarray
 class Minimumarray {
   
   public static void main(String[] args) {
     
  int[] arr = {7,2,10,4};
   
   int min = arr[0];
   for(int i = 1;  i < arr.length;i++){
      if(arr[i]<min){
      min=arr[i];
      }
      
   }
   System.out.println("Minimum = " + min);
}
 }

//03 Avaragearray
class Avaragearray {
   
   public static void main(String[] args) {
     
  int[] array = {3,5,7,9};
  int sum =0;
  for(int num : array){
   sum += num;
  }
  double avarage = (double) sum / array.length;
  System.out.println (avarage);
}
}

//04 EvenOdd count  
  class EvenOddcount {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};

        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

//05 MergeArray

class MergeArray {
    public static void main(String[] args) {
      int[] array1 ={1, 3, 5};
      int[] array2 ={2, 4, 6};
      int[] array3 = new int[array1.length + array2.length];

      for(int i=0; i<array1.length; i++){
         array3[i] = array1[i];
      }
      for(int i=0; i<array2.length; i++){
         array3[array1.length+i]=array2[i];
      }
      System.out.println(Arrays.toString(array3));
   }
}




//06 Secondlargeelement
class Secondlargeelement {
    public static void main(String[] args) {
        int[] num = {12,35,1,10,34};
        int max1,max2;
        if(num[0] > num[1]){
         max1 = num[0];
         max2 = num[1];
        }
        else{
         max1= num[1];
         max2 = num[0];
        }
        for(int i=2; i < num.length; i++){
         if(num[i]>max1){
            max2=max1;
            max1 = num[i];
         }
         else if(num[i]>max2 && num[i] < max1){
            max2 = num[i];
         }
      }
      System.out.println("Second large Element: " + max2);
   }
}

//07 Evenindices
class Evenindices {
    public static void main(String[] args) {
        int[] num = {2,4,6,8,10};
        int sum =0;
        for(int i=0; i< num.length; i+=2){
         
         sum += num[i];
        }
        System.out.println(sum);
      }
   }

   //08 Sortarray


   class SortArray {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};

      Arrays.sort(arr);
      System.out.print("Sorted Array: ");
     for(int num : arr){
      System.out.print(num +" ");
     }
   }
}

//09 frequncyelement

 class FreqOfElements{
    public static void main(String[] args) {
        
      int[] arr={2,3,2,5,3};
        int visited=-1;

        for(int i=0;i<arr.length;i++){
        if(arr[i]!=visited){
         int count=1;
       for(int j=i+1;j<arr.length;j++){
         if(arr[i]==arr[j]){
        count++;
         arr[j]=visited;
      }
     }
      System.out.println(arr[i]+"->"+count);
   }
   }
}
 }  
 
 //10RemoveDuplicates
class RemoveDuplicates {
    public static void main(String[] args) {

      int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int dup = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != dup) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = dup;
                    }
                }
            }
        }

        int count = 0;
        for (int value : arr) {
            if (value != dup) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value != dup) {
                result[index++] = value;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
 







