import java.util.Scanner;

// 1 Hello
public class hello {
    public static void main(String[] args)
    {
        int i=5;
      int j=0;
      while(j <= 5){
       System.out.println(i+ " * " + j + "=" +(i * j));
       j++;
      }
    }
 }

 // 2 Rightreverse

 class Rightreverse  {
    public static void main(String[]args)
    {
      int n=6;
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

  // 3 lefthalf

  class Lefthalf  {
    public static void main(String[]args)
    {
    int n=5;
    for(int i=1; i<=n; i++){
    for(int j=n; j>=i;j--){
      System.out.print(" ");
    }
    for(int j=1; j<=i; j++){
      System.out.print("@");
    }
    System.out.println();
    }
    }
  }

  //  4 Numbertriangle
  class Numbertriangle  {
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
   }


   // 5 Numbertype

   class Numbertype  {
    public static void main(String[]args)
    { 
    int n=10;
    for(int i=1; i<=n;i++){
    for(int j=1; j<=i; j++){
    System.out.print(j);
    }
    System.out.println();
}
    }
}

//  6 Numberright

class Numberright  {
  
  public static void main(String[]args)
  {
  System.out.print("Enter the number for terms");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i=1; i<=n; i++){
    int num=i;
    for(int j=1; j<=i; j++){
      System.out.print(num+" ");
      num=num+n-j;
    }
    System.out.println();
  }
}
}

// 7 Increaseorder

class Increaseorder {
  
  public static void main(String[]args)
  {
  Scanner sc = new Scanner(System.in);
   int n1 = sc.nextInt();
   System.out.println("Enter the value of first Number ");
   
   int n2=sc.nextInt();
   System.out.println("Enter the value of second Number");

   int n3=sc.nextInt();
   System.out.println("Enter the value of third Number");

   if(n1<n2 && n2<n3){
    System.out.print("Increase to the Number");
   }
   else if(n1>n2 && n2>n3){
    System.out.print("Decrease to the Number");
   }
   else{
    System.out.print("Neither increase or decrease order");
   }
  }
}
  