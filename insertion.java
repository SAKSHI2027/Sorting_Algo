public class insertion {
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
        for (int i= 1; i < n; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp){    
                arr[j+1] = arr[j];
                j --;
            }
             arr[j+1] = temp;
        }        
        System.out.println("Sorted array");
        printArray(arr);

        
    
    }
}