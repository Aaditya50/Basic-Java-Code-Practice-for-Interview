

class HelloWorld {
    public static void main(String[] args) {
       String s = "Aaditya";
       char[] arr = s.toCharArray();
       int i=0;
       int j=arr.length-1;
       while(i<j){
           char c = arr[i];
           arr[i]=arr[j];
           arr[j]=c;
           i++;
           j--;
       }
       for(char c:arr){
           System.out.print(c);
       }
    }
}
