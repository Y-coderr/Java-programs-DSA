public class TrappingRainwater{
    public static int calculateWater(int height[]){
        int n = height.length;
        //calculate left max boundry
        int leftmax[] = new int[n];
        leftmax[0]=height[0];
        for(int i=1 ; i<height.length ; i++){
            leftmax [i]=Math.max(height[i],leftmax[i-1]) ;
        }

        // calculate right max boundry
        int rightmax[] = new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater =0;
        // loop
       for(int i =0 ; i<n ; i++){
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        trappedwater += waterlevel- height[i] ;
       }
       return trappedwater;
    }
    public static void main(String args[]){
        int nums[]={4,2,0,6,3,2,5};
        System.out.println("Trapped Water :"+calculateWater(nums));
    }
}