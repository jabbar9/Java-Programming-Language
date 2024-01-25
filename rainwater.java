public class rainwater {
    public static int trappedWater(int height[]){
        int n = height.length;
        //Calculate Left Max Boundary - Array
        int LeftMax[] = new int[height.length];
        LeftMax[0] = height[0];
        for(int i=1; i<n; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }
        //Calculate Right Max Boundary - Array
        int RightMax[] = new int[height.length];
        RightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }

        int trappedWater = 0;
        //Loop
        for(int i=0; i<n; i++){
            //WaterLevel = min(LeftMax Boundary. RightMax Boundary)
            int waterlevel = Math.min(LeftMax[i], RightMax[i]);
            //TrappedWater = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}