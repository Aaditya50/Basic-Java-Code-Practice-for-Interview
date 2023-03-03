import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
      System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
      if(n==1 || n==0) return false;
      if(n==2) return true;
      for(int i=2;i<n/2;i++){
          if(n%i==0) return false;
      }
      return true;
    }
}
