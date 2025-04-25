import java.util.Scanner;

//pattern
/*
 * *
 * * *
 * * * *
 * * * * *  */
class Pattern  {
    public static void main(String[]args)
    {
    for ( int i=1; i<=5; i++){

    for (int j=1; j<=i; j++){
    System.out.print( "* " );
    }
    System.out.println();
    }
    }
  }

  // single Pattern
  /* * * * * 
   * * * *
   * * *
   * *
   *       */
   
  class Singlepattern  {
    public static void main(String[]args)
    {
    for ( int i=1; i<=5; i++){

    for (int j=1; j<=5-i+1; j++){
    System.out.print("* ");
    }
    System.out.println();
    }
    }
  }
  //Num pattern

    class Numpattern  {
    public static void main(String[]args)
    {
      int n=5;
   
    for ( int i=0; i<5; i++){
         int num=i+1;
    for (int j=1; j <= 5; j++){
        
    System.out.print(num+" ");
    num++;
    if(num>5)
    num=1;
    }
    System.out.println();
    
    }
  }
    }
    //numberpattern
    class numberpattern {
      public static void main(String[]args)  
        {
            int n = 5;
        for (int i = 0; i<n; i++ ){
        int num =i+1;
        for (int j = 1; j<=n; j++){
            System.out.print(num+" ");
            num++;
            if(num>5)
            num=1;
        }
        System.out.println();
        }
        }
    }

 //Triangle pattren
     /* 
     * *
    * * *
   * * * *
  * * * * *   */

  class triangle  {
      public static void main(String[]args)  
        {
            int n=5;
       for ( int i=1; i <= 5; i++){
        for(int j=n; j>=i; j--)
        {
            System.out.print(" ");
        }

    for (int j=1; j <= i; j++){
    System.out.print( " *" );
    }
    System.out.println();
    }
    }
  }

  //square fill pattern
  /* * * * * * 
   * * * * * *
   * * * * * *
   * * * * * *
   * * * * * *
   * * * * * *   */

  class Squarefill {
      public static void main(String[]args)  
        {
            int n = 6;
        for (int i = 0; i<n; i++ ){
        int num =i+1;
        for (int j = 1; j<=n; j++){
            System.out.print("* ");
            num++;
            if(num>n)
            num=1;
        }
        System.out.println();
        }
        }
    }

    //numberincrease
    class Numberincrease {
      public static void main(String[]args)  
        {
     for (int i=1; i<=4; i++){
        for (int j=1; j<=i; j++ ){
     System.out.print(j);
        }
        System.out.println();
     }
        }
    }
    //number decrease
    class Numberdecrease {
      public static void main(String[]args)  
        {
     for (int i=1; i<=4; i++){
        for (int j=1; j<=4-i+1; j++ ){
     System.out.print(j);
        }
        System.out.println();
     }
        }
    }
    //numberchanging
    class Numberchanging {
      public static void main(String[] args) {
        int n = 4;
        int num =1; 
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
         System.out.print(num + " ");
         num++;
        
    }
        System.out.println();
        }
    }
}
//palindrome pattern
class Palindromepattern {
 public static void main(String[] args) {
  int n =4;
  for (int i=1; i <= n;i++ ){
  for (int j=1; j <=2*(n-i); j++){
    System.out.print(" ");
  }
   for(int j=i; j>=1; j--){
      System.out.print(j+ " ");
    }
    for(int j=2; j<=i; j++){
    System.out.print(j+" ");
  }
  System.out.println();
  }

 }
}

//diamondtriangle
  /*
  * *
 * * *
* * * *
 * * *
  * *
   *   */

class Diamondtriangle  {
      public static void main(String[]args)  
        {
            int n = 4;
            for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++ ){
            System.out.print(" ");
            }
            for(int j=1; j<=i; j++ ){
            System.out.print("* ");
            }
            System.out.println();
            
            }
            for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
            System.out.print(" ");
            }
            for(int j=1; j <= n-i; j++ ){
            System.out.print("* ");
            }
            
            System.out.println();
            }
}
}
        

  //Kpattern
  /* * * * 
   * * *
   * *
   *
   * *
   * * *
   * * * *   */

  class Kpattern  {
    public static void main(String[]args)
    {
    int n=4;
    for (int i=1; i <= n; i++){
      for (int j=1; j <= n-i+1; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=2; i <= n; i++){
      for (int j=1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    }
  }

  //Rhambus pattern
 /* * * *     
   * * * *   
    * * * *  
     * * * *   */
  class Rhambuspattern  {
    public static void main(String[]args)
    {
      int n=4;
      for(int i=1; i<=n; i++){
      for(int j=1; j <= i-1; j++){
      System.out.print(" ");
      }
      for(int j=1; j<=n; j++ ){
        System.out.print("* ");
      }
      System.out.println();
      }
    }
  }

  //Zero one pattern
  
   class Zeroone  {
    public static void main(String[]args)
    {
      int n=4;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i;j++){
          if((j+i)%2==0){
        System.out.print(1+" ");
          }
          else{
          System.out.print(0+" ");
          }
        }
        System.out.println(" ");
      }
    }
   }
   
   //number triangular
     
    
   }class Numbertriangle  {
    public static void main(String[]args)
    {
    int n=4;
    for(int i=1; i<=n; i++){ 
    for(int j=n; j>=i; j--) {
        System.out.print(" ");
      }
   
      for(int j=1; j<=i;j++){
      System.out.print(i+" ");
      } 
      System.out.println();
    }
   }

   //Left half
    /*
    **
   ***
  ****
 ***** */ 

  class Lefthalf  {
    public static void main(String[]args)
    {
    int n=5;
    for(int i=1; i<=n; i++){
    for(int j=n; j>=i;j--){
      System.out.print(" ");
    }
    for(int j=1; j<=i; j++){
      System.out.print("*");
    }
    System.out.println();
    }
    }
  }
   
   //right reverse
   /*****
     ****
      ***
       **
        *  */

   class Rightreverse  {
    public static void main(String[]args)
    {
      int n=5;
    for(int i=1; i<=n; i++){
    for(int j=1; j<=i;j++){
      System.out.print(" ");
    }
    for(int j=n; j>=i; j--){
      System.out.print("*");
    }
    System.out.println();
    }
    }
  }

  //Rightpascal
   /*
    * *
    * * *
    * * * *
    * *
    *       */
  class Rightpascal  {
    public static void main(String[]args)
    {
     int n =4;
     for(int i=1; i<=n; i++){
     for(int j=1; j<=i; j++){
      System.out.print("* ");
     }
     System.out.println();
     }
     for(int i=1; i<=n; i++){
      for(int j=1;j<=n-i; j++){
        System.out.print("* ");
      }
      System.out.println();
     }
    }
  }

  //Hollow triangle

 class Hollowtriangle  {
    public static void main(String[]args)
    {
      int n = 5;
      for(int i=1; i<=n; i++){
       for(int j=n; j >= i; j--) {
        System.out.print(" ");
       }
       for(int j=1; j<=i; j++){
        if(j==1||i==n||j==i){
        System.out.print("* ");
       }
       else{
        System.out.print("  ");
       }
       }
       System.out.println();
      }
    }
 }
       
     //Hollowreverse
     class Hollowreverse  {
    public static void main(String[]args)
    {
      int n = 5;
      for(int i=1; i<=n; i++){
       for(int j=1; j <= i; j++) {
        System.out.print(" ");
       }
       for(int j=n; j>=i; j--){
        if(j==n||i==1||j==i){
        System.out.print("* ");
       }
       else{
        System.out.print("  ");
       }
       }
       System.out.println();
      }
    }
 }

 //Hollowhourglass
 class Hollowhourglass  {
    public static void main(String[]args)
    {
      int n = 5;
      for(int i=1; i<=n; i++){
       for(int j=n; j >= i; j--) {
        System.out.print(" ");
       }
       for(int j=1; j<=i; j++){
        if(j==1||i==n||j==i){
        System.out.print("* ");
       }
       else{
        System.out.print("  ");
       }
       }
       System.out.println();
      }
    }
 }

 //Pascal triangle

  class Pascal  {
    public static void main(String[]args)
    {
    System.out.print("Enter the number for terms");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    for (int i=0; i<n; i++){
      for(int j=0; j<n-i-1;j++){
        System.out.print(" ");
      }
      int val=1;
      for(int j=0; j<=i; j++){
        System.out.print(val+" ");
        val=val*(i-j)/(j+1);
    }
    System.out.println();
    }
  }
  }

  //reverse number triangle       
  class Reversenum  {
    public static void main(String[]args)
    {
    System.out.print("Enter the number for terms");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();  
     for(int i=1; i<=n; i++)  {
      for(int j=1; j<=i; j++){
        System.out.print(" ");
      }
      for (int j=i;j<=n; j++ ){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
      

class rightnum  {
  public static void main(String[]args)
  {
  System.out.print("Enter the number for terms");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();  
   for(int i=n-1; i>=1; i--)  {
    for(int j=1; j<i; j++){
      System.out.print(" ");
    }
    for (int j=i;j<=n; j++ ){
      System.out.print(j+" ");
    }
    System.out.println();
  }
}
}    

//Mirror image
class Mirrorimage  {
  
  public static void main(String[]args)
  {
  System.out.print("Enter the number for terms");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();  
   for(int i=1; i<=n; i++)  {
    for(int j=1; j<=i; j++){
      System.out.print(" ");
    }
    for (int j=i;j<=n; j++ ){
      System.out.print(j+" ");
    }
    System.out.println();
  }
    for(int i=n-1; i>=1; i--){ 
      for(int j=1; j<=i; j++){
        System.out.print(" ");
      }
      for (int j=i;j<=n; j++ ){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
  } 


   



      



