// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;


class HelloWorld {
    public static void main(String[] args) {
        String s1="aabaabcda";
        String s2="";
        int count=1;
        int ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)==1){
                s2+=c;
            }
        }
        System.out.println(s2);
    }
}
