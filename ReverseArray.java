public class ReverseArray {



    public static void reverseArray(int arr[]){
               for(int i=0; i<arr.length/2; i++){
                int temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=temp; 
               }
    }

    public static void reverseArray2(int arr[]){
        int first=0; 
        int last=arr.length-1;
        while (first<last) {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
            
        }
    }

public static void main(String[] args) {
    int arr[]={3,5,6,7,8,100};
    reverseArray2(arr);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
}
