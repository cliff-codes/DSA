package Dsa;

public class LinearSearch {
    public static void main(String arg[]){
        //linear search algorithm
        int[] numbers = {1,3,4,5,6,9,10};

        int searchResult = linear_search(numbers, 6);

        System.out.println("Search Result is at "+ searchResult);
    }

    /**
     *
     * @param list the array to search through*
     * @param target the value to find
     * @return returns the index of the target value if found else returns -1
     */

    public static int linear_search(int[] list, int target){
        //returns the index position of the target if found else return none.
        for(int i = 0; i<list.length; i++){
            if(list[i] == target ){
                return i;
            }
        }
        return -1;
    }
}
