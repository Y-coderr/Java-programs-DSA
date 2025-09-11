import java.util.*;
public class Solution{

    public static ArrayList<Integer> duplicateInArray(){
      ArrayList<Integer> list = new ArrayList<>();

      System.out.println("Enter Array Length:");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] arr = new int[n];
      for(int i=0;i<n;i++){
        System.out.println("Enter "+i+"th Element");
        arr[i] = sc.nextInt();
      }
      
      
      
      HashMap<Integer , Integer> hm = new HashMap<>();
      for(int i=0;i<n;i++){
        if(!hm.containsKey(arr[i])){
            hm.put(arr[i],1);
        }else{
            hm.put(arr[i],hm.get(arr[i])+1);
        }
      }

      for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        if(entry.getValue()>1){
           list.add(entry.getKey());
        }
      }

      return list;

    }
    public static void main(String[] args) {
        System.out.println(duplicateInArray());
    }
}