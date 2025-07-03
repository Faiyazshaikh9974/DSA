public class Trapping_water {

    public static int trapWater(int height[]) {
        int n = height.length;

        // auxiliary Array that store the Left Max and Right Max...

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[n - 1]; // put the last element first on the 0th index..

        // find the leftMax and RightMax value
        for (int i = 1; i < n; i++) {

            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            // System.out.println(leftMax[i]);
        }
        ;

        for (int j = n - 2; j >= 0; j--) {

            rightMax[j] = Math.max(height[j], rightMax[j + 1]);
        }
        ;

        int totalTrapWater = 0;
        for (int k = 0; k < height.length; k++) {
            int waterLevel = Math.min(leftMax[k], rightMax[k]);
            int trapWater = waterLevel - height[k];
            totalTrapWater += trapWater;
            // System.out.println(rightMax[k]);
        }

        return totalTrapWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(trapWater(height));

    }
}
