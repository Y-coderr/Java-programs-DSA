public class SubStr{
    public static String SubString(String str , int si, int ei){
        String substring = "";
        for(int i=si;i<ei;i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]){
        String str = "Hello World";
        System.out.println("Substring is  :  "+SubString(str,0,5));
    }
}