public class SubArray {

    public static void subArrayPrint(int arr[]){
        int maxSum=0;
        for(int i=0; i<arr.length; i++){
         
            for(int j=i; j<arr.length; j++){
                int currSum=0;
                for(int k=i; k<=j; k++){
                   System.out.print(arr[k]+" ");
                   currSum+=arr[k];
                }
                System.out.println(currSum);
                maxSum=Math.max(currSum,maxSum);
                System.out.println();
            }
           
            System.out.println();
        }
        System.out.println(maxSum+" ans ");
    }


    public static void subArraySum(int arr[]){
        int maxSum=0;
        int prefixArray[]=new int[arr.length];
        prefixArray[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefixArray[i]=prefixArray[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int currSum=0;
            for(int j=i; j<arr.length; j++){
                currSum=i==0? prefixArray[j]:prefixArray[j]-prefixArray[i-1];
            }
            maxSum=Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }






    public static void kadenesAlg(int arr[]){
        int currentSum=0;
        int maximumSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maximumSum=Math.max(maximumSum, currentSum);
        }
        System.out.println(maximumSum);
    }


    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
       kadenesAlg(arr);
    }
}
