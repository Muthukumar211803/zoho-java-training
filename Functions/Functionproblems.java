import java.util.Arrays;

//01 factorial

class Factorial {


    public static int factFunction(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
         fact = fact * i;
     }

    return fact; 
    }

    public static void main(String[] args) {
        
        int checkNumber = factFunction(5);
        System.out.println(checkNumber);
    }
}

// 02 SumOfDigits
class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234)); 
    }
}

//03 PrimeNumber Checker
class PrimeNumber {

    public static boolean Prime(int n) {

        if (n < 2) {
            System.out.println("Provide Number Greater than 1");
            return false;
        }

        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }

        return isPrime;
    }

    public static void main(String[] args) {

        Prime(7);

    }
}

//04 LCM Calculator

    class LcmCalculator {

    public static int findLCM(int a, int b) {
        int max = Math.max(a, b);

       
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; 
            }
            max++;
        }
    }

  
    public static void main(String[] args) {

        int num1 = 12, num2 = 15;
        int lcm = findLCM(num1, num2);
        System.out.println("LCM = " + lcm);  
    }
}

//05 Fibonacci Sequence


 class FibonacciSeries{
    public static int[] fiboSeries(int n) {
        int[] fib = new int[n];

        int num1 = 0, num2 = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            fib[i] = num1;
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        return fib;
    }

    public static void main(String[] args) {
        int[] series = fiboSeries(6);
        System.out.println(Arrays.toString(series));
    }
}

//06 GCD
 class GreatestCommonDivisor {
     public static int gcd(int a, int b) {
        int min = Math.min(a, b); 

       
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i; 
            }
        }

        return 1; 
    }

    public static void main(String[] args) {
        int a = 24, b = 36;

        System.out.println("GCD = " + gcd(a, b)); 
    }
}

// 07 Factor Count
class FactorCounter {

    public static int countFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 12;

        int result = countFactors(number);
        System.out.println("Number of factors = " + result); 
}
}

// 08 Digit Reverser

class ReverseNumber{

    public static int reverseNum(int n){

        int rev=0;

        while(n!=0){
            int mod=n%10;
            rev=rev*10+mod;
            n=n/10;
        }
        return rev;
    }


    public static void main(String[] args) {
        System.out.println(reverseNum(12345));
    }
}

//09 Power Function
 
class PowerFunction{

    public static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }


    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;

        int result = power(base, exponent);
        System.out.println("Result = " + result);  
    }
}

//10 Perfect Number
 
class PerfectNumber {

    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;

        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}

//11 Armstrong number
class ArmstrongNumber{

    public static void checkArms(int n){

        int original=n;
        int digit=String.valueOf(n).length();
        double sum=0;

        while(n!=0){
            int digits=n%10;
            sum=sum+Math.pow(digits,digit);
            n=n/10;   
        }
        if(sum==original){
            System.out.println(original+" is a Armstrong Number");
        }
        else{
            System.out.println(original+" is not a Armstrong Number");
        }

    }
    public static void main(String[] args) {
        checkArms(153);

    }
}

//12 Palindrome Checker

class Palindrome{

    public static void Palindrome(String str){

        String reversed="";
        str=str.toLowerCase();

        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }

        if(reversed.equals(str)){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" is not a Palindrome");
        }
    }

    public static void main(String[] args) {

        Palindrome("Madam");

        
    }
}

