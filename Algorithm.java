public class Algorithm {

public static void main(String[] args) {
	int[] cards = {9,10,12,10,11,7,8};
	System.out.println(Max(cards));
	int[] sortedarray = Sort(cards);
	for(int x : sortedarray) {
  	System.out.println(x);
  }
  int [] random = {9,6,4,3,2};
  int [] monster = {1,12,14,18,19,21,23,24,25,26,27,28,29,30,31,32,34,35,100,500,10000};
  System.out.println(isthere(sortedarray, 9));
  System.out.println(isthere(random, 1));
  System.out.println(isthere(monster, 100000000));
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
   boolean reverse = (array[0] > array[array.length-1]);
   int middleIndex = (array.length-1)/2;
   int middle = array[array.length-1];
   if (reverse) {
    if (n >= middle) {
      for (int i = middleIndex; i >= 0; i--) {
        if (n == array[i]) {
          return true;
        }
      }
    }
    else {
      for (int i = middleIndex; i <= array.length-1; i++) {
        if (n == array[i]) {
          return true;
        }
      }
    }
   }
   else {
    if (n >= middle) {
      for (int i = middleIndex; i <= array.length -1 ; i++) {
        if (n == array[i]) {
          return true;
        }
      }
    }
    else {
      for (int i = middle; i >= 0; i--) {
        if (n == array[i]) {
          return true;
        }
      } 
    }
   }
   return false;
 }





}
