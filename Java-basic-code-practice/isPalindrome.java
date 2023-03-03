import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n=scn.nextInt();
        String str = "navgvan";
        System.out.print(isPalindrome(str));

    }
    public static boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;j--;
            }else{
                return false;
            }
        }
        return true;
    }
   
}
