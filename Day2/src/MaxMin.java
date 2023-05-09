
 public class MaxMin {
   public int max(int[] array ) {
      int max = 0;
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }
   public int min(int[] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }
	   public static void main(String args[]) {
	      int[] array = {35, 29, 75, 12, 64};
	      MaxMin m =  new MaxMin();
	      System.out.println("Maximum value in the array is: "+m.max(array));
	      System.out.println("Minimum value in the array is: "+m.min(array));
	   }
	}