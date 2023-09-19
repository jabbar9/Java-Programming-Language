public class rainwater {

    public static int trappingRainwater(int height[]){
        int n = height.length;
        //Calculate Left max boundary -array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        //Calculate Right max Boundary -array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        int trappedWater = 0;        
        //loops
        for(int i=0; i<n; i++){
            //waterlevel = min(Leftmax boundary, Rightmax Boundary)
            int waterlevel = Math.min(leftmax[i],rightMax[i]);

            //Trapped Water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappingRainwater(height));
    }
}
