public class arry {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // create an array of the same length as nums
        
        // Iterate over the nums array and build the ans array
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]]; // set ans[i] as nums[nums[i]]
        }
        
        return ans;
    }

    // Main method to test the code
    public static void main(String[] args) {
        arry solution = new arry();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
