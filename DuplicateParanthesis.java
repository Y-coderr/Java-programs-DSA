public class DuplicateParanthesis{
    public static boolean isDuplicate(String str){
        Stack <Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            Char ch = str.charAt(i);
            if(ch == '('){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop(ch);
                }
            }else{
                s.push(ch);
            }
            return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isDuplicate(str));
    }
}