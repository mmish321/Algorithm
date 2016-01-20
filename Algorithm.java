public class Algorithm {

public static void main(String[] args) {
	int[] cards = {9,10,12,10,11,7,8};
	System.out.println(Max(cards));
	int[] sortedarray = Sort(cards);
	for(int x : sortedarray) {
  	System.out.println(x);
  }
  System.out.println(isthere(cards, 9));
}

public static int Max(int[] array) {
	int max = array[0];
	for(int x : array) {
    if (x > max) {
     max = x;
    }
	}
	return max; 
}

public static int[] Sort(int[] array) {
  for (int i = 0; i < array.length; i++ ) {
  	int minIndex = i;
  	for (int j = i +1 ; j <array.length; j++) {
  		if (array[j] < array[minIndex]) {
  			minIndex = j;
  		}
  	}
  	int temp = array[i];
  	array[i] = array[minIndex];
  	array[minIndex] = temp;
  }
 return array;
}
public static boolean isthere(int[] array, int n) {
   for (int x : array) {
   	if (x == n) {
   		return true;
   	}
   }
   return false;
  }
}
