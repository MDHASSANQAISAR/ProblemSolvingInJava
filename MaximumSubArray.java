public class MaximumSubArray {


    public static int maximumSubArray(int arr[]){
       int maxSum=Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
        int sum=0;
        for(int j=i+1; j<arr.length; j++){
            sum=sumArray(arr, i, j);
        }
      
        maxSum=Math.max(maxSum, sum);
       }
       return maxSum;
    }

    public static int sumArray(int arr[], int startingIndex , int endingIndex){
        int sum=0;
        for(int i=startingIndex; i<endingIndex; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println(maximumSubArray(arr));
    }
}
