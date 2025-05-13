package Arrayprogram;

import java.util.Scanner;

class Songs  {
   
 public static void main(String[]args)
    {
 String[] playlist = new String[5];

 playlist[0] = "SONG 1";
 playlist[1] = "SONG 2";
 playlist[2] = "SONG 3";
 playlist[3] = "SONG 4";
  
 System.out.println(playlist[0]);
 System.out.println(playlist[1]);
 System.out.println(playlist[2]);
 System.out.println(playlist[3]);

 }
}

//Subject score  
class Score {
   
   public static void main(String[]args)
      {
   int[]  Score = new int[5];

    Scanner scan= new Scanner(System.in);
    
    Score[0] = scan.nextInt();
    Score[1] = scan.nextInt();
    Score[2] = scan.nextInt();
    Score[3] = scan.nextInt();
    Score[4] = scan.nextInt();

   System.out.println( Score[0]+Score[1]+ Score[2]+ Score[3]+Score[4]);

      }
   }

    // rightarray

    class Rightarray {
    public static void main(String[] args) {
      
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
 }
  
 //Updatearray

 class Updatearray {
   
   public static void main(String[] args) {
     
  int[] arr = {2,4,6,8,10};
   
  System.out.print("orignal array");
 

   int index = 0;
   int newvalue = 20;

   if(index >=0 && index < arr.length){
      arr[index]= newvalue;
   }
   else{
      System.out.println("invalid index");

      System.out.println("updated array");
for(int i=0; i< arr.length; i++){
         System.out.print(arr[i]+ " ");
      }
   }
}
   }

//Reverse array


class Reversearray {
   public static void main(String[] args) {
     
       int[] numbers = {10, 20, 30, 40, 50};

       int start = 0;
       int end = numbers.length-1;

       while(start < end){
         int themp = numbers[start];
         numbers[start] = numbers[end];
         numbers[end] = themp;

         start++;
         end--;
       }
       System.out.print("reversed array:");
       for(int num : numbers) {
         System.out.print(num+" ");
       }  

      }
   }

