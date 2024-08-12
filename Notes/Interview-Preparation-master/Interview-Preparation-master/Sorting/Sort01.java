class Sort01{
    public static void sort(int[] arr){
        
        int n = arr.length;
        int i = 0; 
        int j = n - 1;
        
        while(i<j){
            while(arr[i] == 0 && i < j)
               i++;
               
            while(arr[j] == 1 && i<j)
               j--;
               
            if(i < j){ 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }  
        }
        
    }
}
