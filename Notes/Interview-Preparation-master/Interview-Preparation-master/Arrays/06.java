/*  You are given an array of positive numbers. You have to rearrange array such that even numbers
 *  at even position and odd numbers at odd positions. If suppose odd numbers exceeds the even
 *  numbers or vice-versa than keep them untouched. Do this in one pass and without using any
 *  extra memory.
 */
class solution{
	public static void arrangeArray(int[] A, int size) {
		
      int EvenIndex = 0;
      int oddIndex = 1;
      
      while(true){
          while(EvenIndex < size && A[EvenIndex]%2 == 0)
            EvenIndex+=2;
          while(oddIndex < size && A[oddIndex]%2 != 0)
            oddIndex+=2;
        
          if(EvenIndex < size && oddIndex < size){
            int temp = A[EvenIndex];
            A[EvenIndex] = A[oddIndex];
            A[oddIndex] = temp;
          }
        else 
          break;
      }
	}
}
