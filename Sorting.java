 package Algorithm;

class Sorting {

   public static void bubbeSort(int arr[]){
      for(int i=0; i<arr.length-1; i++){
         for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
         }
      }
   }


   public static void selectionSort(int arr[]){
      for(int i=0; i<arr.length-1; i++){
         int minPosition=i;
         for(int j=i+1; j<arr.length; j++){
                if(arr[minPosition]>arr[j]){
                      minPosition=j;
                }
         }
         int temp=arr[minPosition];
         arr[minPosition]=arr[i];
         arr[i]=temp;
      }
   }

   public static void printArray(int arr[]){
      for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
      }
   }


     public static void main(String[] args) {
       int arr[]={5,4,1,3,2};
      //  bubbeSort(arr);
      selectionSort(arr);
       printArray(arr);
     }
}