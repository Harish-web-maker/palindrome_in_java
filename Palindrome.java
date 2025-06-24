import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n, rev = 0, temp, d;
        n = obj.nextInt();             // Taking user input.
        temp = n;                     // when the process is going on the 'n' value gets 0. it means changing the value so before prevention we storing the 'n' value before the process.

        while(n!=0){                 // check the condition.
            d = n % 10;              // it's for finding single digit from a large number like 2 digits or more digits. it take's last digit to check and continue the process. 
            rev = rev * 10 + d;      // formula for reverse of number.
            n = n / 10;              // it's for removing last digit and sends to loop again to continue the processs.
        }
        if(temp==rev){              // comparing the temp and rev it's equal print's palindrome.
            System.out.println("Palindrome number");
        } else{
            System.out.println("Not a palidrome number");
        }
    }
}


//  o/p:-  121
//  Palindrome number
