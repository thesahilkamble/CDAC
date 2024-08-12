class Sort012{
    public static void sort(int[] arr){
        
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while(mid <= high){
            switch(arr[mid]){
                case 0 : int temp = arr[low];
                            arr[low] = arr[mid];
                            arr[mid] = temp;
                            low++;
                            mid++;
                            break;
                    
                case 1 : mid++;
                         break;
                
                case 2 :  temp = arr[high];
                            arr[high] = arr[mid];
                            arr[mid] = temp;
                            high--;
                            break;
            }
        }
    }
}
