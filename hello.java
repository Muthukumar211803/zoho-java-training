import java.util.Scanner;

//Numberpattern

   class Numberpattern  {
  public static void main(String[]args)
  {
  int n=4;
  for(int i=1; i<=n; i++){ 
  for(int j=n; j>=i; j--) {
  }
  for(int j=1; j<=i;j++){
    System.out.print(i+" ");
    } 
    System.out.println();
  }
 }
}

  // valuenum
 
  class Valuenum {
  
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

//reverse num

   class Reversenum  {
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = sc.nextInt();
    int reversed=0;
    while(num != 0){
      int digit =num % 10;
      reversed= reversed * 10 + digit;
      num = num / 10;
    }
    System.out.println("reverse number: " + reversed);

  }
}

//numwords

  class numwords{
  public static void main(String[]args)
  {
    int n=541;
    String numstr = Integer.toString(n);
    for (int i=0; i< numstr.length(); i++){
      char digit = numstr.charAt(i);
      switch(digit){
      case'0':
      System.out.print("zero");
      break;
      case'1':
      System.out.print("One");
      break;
      case'2':
      System.out.print("Two");
      break;
      case'3':
      System.out.print("Three");
      break;
      case'4':
      System.out.print("Four");
      break;
      case'5':
      System.out.print("Five");
      break;
      case'6':
      System.out.print("Six");
      break;
      case'7':
      System.out.print("Seven");
      break;
      case'8':
      System.out.print("Eight");
      break;
      case'9':
      System.out.print("Nine");
      break;
      default:
      System.out.println("invalid");
      break;
      }
    }
  }
}

//Studentgrades

class Studentgrade {
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of the Subject: ");
     int numsubject = sc.nextInt();
     int totalmarks=0;
   
     for(int i=1; i<=numsubject; i++){
      System.out.print("Enter mark obtained in subject " + i + ": ");
      int marks = sc.nextInt();
       totalmarks += marks;
     }
     double avaragepercentage = (double) totalmarks/numsubject;
     char grade;
     if(avaragepercentage>=90){
      grade = 'A';
     }
     else if (avaragepercentage>=80){
      grade = 'B';
     }
     else if (avaragepercentage>=70){
      grade = 'C';
     }
     else if (avaragepercentage>=60){
      grade = 'D';
     }
     else if (avaragepercentage>=50){
      grade = 'E';
     }
     else {
      grade = 'F';

     }
     System.out.println("totalmarks: " + totalmarks);
     System.out.println("Avaragepercentage: " + avaragepercentage);
     System.out.println("Grade: " + grade);

    }
  }

  //Armstrong value
  class Armstrongvalue {
    public static void main(String[]args)
    {
      int n=153;
      int temp;
      int Armstrong=0;
      int original =n;
      while(n>0){
        temp= n%10;
        Armstrong += Math.pow(temp,3);
         n = n/10;
      }
      if (Armstrong == original){
        System.out.println(" It is Armstrong value");
      }
      else{
        System.out.println("It is Not Armstrong");
      }
    }
  }

  
class armstrong {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int temp;
      int armstrong = 0;
      int original = n;

      while (n > 0) {
          temp = n % 10;
          armstrong += Math.pow(temp, 3);
          n = n / 10;
      }

      if (armstrong == original) {
          System.out.println("It is an Armstrong value");
      } else {
          System.out.println("It is not an Armstrong value");
      }
  }
}

//Magicnumber

class Magicnumber {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int sum=0;
      while(n>0||sum>9){
        if (n==0){
          n=sum;
          sum=0;
        }
        sum=sum+(n%10);
        n=n/10;
      }
      if (sum==1){
        System.out.println("It is Magic Number");
      }
      else{
        System.out.println("It is Not Magic Number");
      }
    }
  }

  //prime number

  class Primenumber {
    public static void main(String[] args) {
      int n=100;
      for(int i=2; i<=n; i++){
        boolean isprime = true;
        for(int j=2; j < i; j++){
         
        if (i% j==0){
           isprime = false;
          break;
        }
        if(isprime){
          System.out.println(i);
        }
      }
    }
  }
}
//Fibonacci series

class Fibonacciseries {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the Fibonacci series n: ");
      int n =sc.nextInt();

     System.out.print("Enter the Fibonacci number 1: ");
      int num1=sc.nextInt();
      
 
     System.out.print("Enter the Fibonacci number 2: ");
      int num2 =sc.nextInt();

     int num3;
     int i=1;
     do{
      num3 = num1+num2;
      num1 = num2 ;
      num2 = num3 ;
      i++;
      System.out.println(num1);
     }
      while(i<=n);
  }
}
    

//Numberpyramid

 class Numberpyramid {
  public static void main(String[] args) {
      int rows = 4; 
      int num = 1;  

      for (int i = 1; i <= rows; i++) {
           num = num + i - 1;

      for (int j = num; j > num - i; j--) {
          
       System.out.print(j+" ");
      }
      System.out.println();
       num++;
    }
  }
}



    

      





  






  

