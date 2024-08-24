public class ArrayClass {

    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static int largestInArray(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int minInArray(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        
        System.out.println("hello hassan array learn today");
        int arr[]={10,23,52,52,11,44,22,5,345,58};
        System.out.println(linearSearch(arr, 22));
        System.out.println(largestInArray(arr));
        System.out.println(minInArray(arr));
    }
}
