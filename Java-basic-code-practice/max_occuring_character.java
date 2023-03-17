
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s1="aabababasscbabaaa";
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        char ans=0;
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            if(count<map.get(c)){
                ans=c;
                count=map.get(c);
            }
        }
        System.out.println(count+" "+ans);
    }
}
