import javax.swing.plaf.synth.SynthSpinnerUI;

public class arrays {
    
    public static int linearSearch(int numbers[], int key) { //linearsearch function
        for (int i=0; i<numbers.length; i++) {
            //condition
            if (numbers[i] == key) {
                System.out.println(i);
            }
        }
        return -1;
    }

    public static int largestinArray(int numbers[]) { //finds largest element in array
        // creating a minimum value {- infinity} 
        int largest = Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int BinarySearch(int nums[], int key) { //Binary search function
        int start = 0; int end = nums.length-1;
        //while loop
        while (start <= end) {
            int mid = (start + end) / 2;
            //conditions
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) { //right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void ReverseArray(int numbers[]) { // to reverse an array
        int start = 0; int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[end]; // temparary beaker to exchange
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }

    public static void PairsinArray(int array[]) { // to get pairs in an array
        //loop -1 
        for (int i=0; i<array.length; i++) {
            // loop-2
            for (int j=i+1; j<array.length; j++) {
                System.out.print("("+ array[i] + ", " + array[j] + ") " );
            }
            System.out.println();
        }
        
    }

    public static void PrintSubarrays(int array[]) { // prints subarrays
        //loop-1
        for (int i=0; i<array.length; i++) {
            int start = i;
            //loop-2
            for (int j=i; j<array.length; j++) {
                int end = j;
                //loop-3
                for (int k=start; k<=end; k++) {
                    System.out.print(array[k] + " ");
                } 
                System.out.println();
            }
        }
    }

    public static void maxSubarraysum(int array[]) { //max subarray sum {Brute force}
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<array.length; i++) {
            int start = i;
            for (int j=i; j<array.length; j++) {
                int end = j;
                currSum = 0;
                for (int k=start; k<=end; k++) {
                    currSum += array[i];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max subarraysum: " + maxSum);
    }
    
    public static void main(String[] args) { 
        int numbers[] = {2, 4, 6, 8, 16, 10, 7, 1}; // for linear search
        int nums[] = {2, 4, 6, 8, 10, 12, 14}; // for binary search
        int array[] = {2, 4, 6, 8, 10}; //for pairs in an array
        int key = 10;
        //linearSearch(numbers, key);
        //System.out.println("largest number is: " + largestinArray(numbers));
        //int nums[] = {2, 4, 6, 8, 10, 12, 14}; // for binary search
        //System.out.println(BinarySearch(nums, key)); 
        
        //for reverse an array
        // ReverseArray(numbers);
        // for (int i=0; i<numbers.length; i++) {
        //     System.out.print(numbers[i]+ " ");
        // } 
        // System.out.println();
        //PairsinArray(array);
        //PrintSubarrays(array);
        maxSubarraysum(array);



    }
}
