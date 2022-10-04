package method;
import java.util.Scanner;
public class Method {
    static void name() {
        System.out.println("Teccart Institute");
    }
    
    static void addition(int n, int m){
        System.out.println("The sum of this two numbers is " + (n + m));
    }
    
    static int addition2(int n, int m){
        return n+m ;
    }
    
    static int fact(int n){
        if (n == 0)
            return 1;
        else return n*fact(n-1);
        
    }
    
    static int sum(int n){
        int s = 0;
        for(int i=0; i<=n;i++){
            s = s * i; 
        }
        return s;
    }
    
    static void printer(int n){
        if (n==1)
            System.out.println(1);
        else{
            printer(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Write a number n = ");
                
        int n = read.nextInt();
        name();
        addition(3,5);
        int k = addition2(2,5);
        System.out.println(k);
        System.out.println("The factioral of " + n + " is " + fact(n));
        printer(n);
    }
    
}

