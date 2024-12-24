public class selection {
    public static void printArray (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4 ,1,9,2,3,6,5,8,7 };
        int n = arr.length;
        for (int i= 0; i < n-1; i++){
            int min_index = i;
            for (int j = i+1; j < n; j++){
                if (arr[j]> arr[min_index]){
                    min_index = j;
                }
            }        
                if (min_index != i){

                    // swap arr[j+1] and arr[j]                    
                    int temp = arr[min_index];
                    arr[min_index]= arr[i];
                    arr[i]= temp;
                    
                }
            }
        
        System.out.println("Sorted array");
         printArray(arr);

    }
}
   
    

