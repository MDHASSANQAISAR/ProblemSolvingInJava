public class BinarySearch {


    public static int binarySearch(int arr[], int key){
        int startingIndex=0;
        int endingIndex=arr.length-1;
        
        while (startingIndex<=endingIndex) {
            int mid=(startingIndex+endingIndex)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
               endingIndex=mid-1;
            }else{
                startingIndex=mid+1;
            }
            
        }
        return -1;

    }
     public static void main(String[] args) {
        int arr[]={2,3,4,10,12,14,24,56,100,102};
        System.out.println(binarySearch(arr, 24));
        System.out.println(binarySearch(arr, 110));
     }
}