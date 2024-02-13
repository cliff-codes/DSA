package Dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        int result = binary_search(numbers, 9);
        System.out.println("result is at index"+ result);
    }

    public static int binary_search(int[] list, int target){
          int first = 0;
          int last = list.length-1;

          while (first <= last){
            int mid = (first + last) / 2;

              System.out.println(mid);

              if(list[mid] == target){
                  return mid;
              }

              //if target is greater, ignore left half
              if(list[mid] < target){
                  first = mid + 1;
              }
              //else if target is smaller, ignore right half
              else {
                  last = mid -1;
              }
          }
          return -1;
    }
}
