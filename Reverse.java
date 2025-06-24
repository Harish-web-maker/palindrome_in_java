import java.util.*;
class Reverse{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n, rev = 0, temp, d;
        n = obj.nextInt();             // Taking user input.
                    
        while(n!=0){                 // check the condition.
            d = n % 10;              // it's for finding single digit from a large number like 2 digits or more digits. it take's last digit to check and continue the process. 
            rev = rev * 10 + d;      // formula for reverse of number.
            n = n / 10;              // it's for removing last digit and sends to loop again to continue the processs.
        }
        System.out.println(rev);
    }
}


// o/p:- 23458
//  85432
