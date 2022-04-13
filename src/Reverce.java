class StringFormatter1 {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
public class Reverce {
    public static void main(String[] args) {

      System.out.println(StringFormatter1.reverseString("my name is sanjay"));
    System.out.println(StringFormatter1.reverseString("I am sanjay Patil"));
}
}