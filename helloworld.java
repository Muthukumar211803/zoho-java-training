 import java.util.Scanner;
//Weekdays

 class Weekdays{
    public static void main(String[] args)
    {
    int day = 3;
    
    switch (day){

    case 1:
        System.out.print("Monday");
    

    case 2:
        System.out.print("Tuesday");
    break;
    case 3:
        System.out.print("Wednesday");
    
    case 4:
        System.out.print("Thursday");
    break;
    case 5:
        System.out.print("Friday");
    break;
    case 6:
        System.out.print("Saturday");
    break;
    case 7:
        System.out.print("Sunday");
    break;
    
    }
 
    }
}


 //Weeks

 

    class Weeks{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    int day = scan.nextInt();
    
    switch (day){

    case 1:
        System.out.print("Monday");
    break;
    case 2:
        System.out.print("Tuesday");
    break;
    case 3:
        System.out.print("Wednesday");
    break;
    case 4:
        System.out.print("Thursday");
    break;
    case 5:
        System.out.print("Friday");
    break;
    case 6:
        System.out.print("Saturday");
    break;
    case 7:
        System.out.print("Sunday");
    break;
    
    }
 
    }
}

//Weekend

class Weekend{
    public static void main(String[] args)
    {
    
     int day = 3;
    //weekend
    switch (day){
     
    
    case 6:
        System.out.print("Saturday");
    break;
    case 7:
        System.out.print("Sunday");
    break;
    
    default:
        System.out.println("look forward to Weekend");
    }
 
    }

}

// While loop
class Whileloop {
    public static void main(String[] args)
    {
     int i =11;
     int j =13;
     while (i < 16) {
        System.out.println(i+"*"+j+"="+(i*j));
        i++;
        j++;
        
        }
     }
}

//Do Whileloop

class Dowhileloop {
    public static void main (String[] args)
    {
     int count = 1;
     do{
        System.out.println("Muthu");
     count=count+1; 
     }
     while(count <= 1);
    }
}

//Dowhile
class dowhile{
 public static void main(String[]args)
    {
   Scanner scan = new Scanner(System.in);
      int count = 1;   
   do{
    System.out.println("Enter the Number > 10");
     count = scan.nextInt();
   }
   while(count<10);
    }
}

  // helloloop

  class helloloop  {
    public static void main(String[]args)
    {
    for (i=1; i<=5; i++){

    for (j=1; j<=i; j++){
    System.out.print("*");
    }
    System.out.println();
    }
    }
  }

  //Odd number
  class Oddnumber  {
    public static void main(String[]args)
    {
      int i=5;
      int j=0;
      while(i<=10){
       System.out.println(i+ "*" + j +"="+(i*j));
       j++;
      }
    }
 }



    