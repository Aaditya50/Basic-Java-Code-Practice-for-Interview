class HelloWorld {
    public static void main(String[] args) {
       String s1 = "Hello";
       String s2 = "TV";
       System.out.println(s1.toLowerCase().matches(".*[aeiou].*"));
       System.out.println(s2.toLowerCase().matches(".*[aeiou].*"));
    }
}
