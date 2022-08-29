package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(4321);
    }
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int new_number = 0;
        int num = number;
        while(number>0){
            new_number*=10;
            new_number += number%10;
            number = number/10;
        }
        if(new_number==num){
            return true;
        }
        return false;
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int last = number%10;
        int first = 0;
        while(number>0){
            first=number%10;
            number=number/10;
        }
        return last+first;
    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            if((number%10)%2==0){
                sum+=number%10;
            }
            number/=10;
        }
        return sum;
    }
    public static boolean hasSharedDigits(int a, int b){
        if(a<10 || a > 99|| b<10||b>99){
            return false;
        }
        int la = a/10,ra = a%10;
        int lb = b/10,rb = b%10;
        return la==lb || la==rb||ra==lb||ra==rb;
    }
    public static boolean hasSameLastDigit(int a,int b,int c){
        if(isValid(a)&&isValid(b)&&isValid(c)){
            int ra=a%10,rb=b%10,rc=c%10;
            return ra==rb||ra==rc||rb==rc;
        }
        return false;
    }
    public static boolean isValid(int a){
        return a >= 10 && a <= 1000;
    }
    public static int getGreatestCommonDivisor(int first,int second){
        if(first<10 || second<10){
            return -1;
        }
        int gcd = 0;
        for(int i = 2 ;i<= (long) Math.min(first,second);i++){
            if(first%i==0 && second%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for(int i = 1 ; i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sum = 0;
        for(int i = 1 ; i<=number/2;i++){
            if(number%i==0){
                sum +=i;
            }
        }
        return number == sum;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        while (number>0){
            count++;
            number/=10;
        }
        return count;
    }
    public static int reverse(int number){
        int num = Math.abs(number);
        int rev = 0;
        while(num>0){
            rev*=10;
            rev+=num%10;
            num/=10;
        }
        return rev*(number/Math.abs(number));
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }

        int reverse = reverse(number);
        int num = Math.abs(reverse);
        while(num>0){
            switch (num%10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            num/=10;
        }
    }
}
