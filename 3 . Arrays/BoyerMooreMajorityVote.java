public class BoyerMooreMajorityVote {

    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}

/*The Java program implements the Boyer-Moore Majority Vote algorithm to efficiently find the majority element in an array. The majority element is defined as the element that appears more than n/2 times in an array of length n. The algorithm operates with constant space complexity and linear time complexity.

In the `findMajorityElement` method, the program initializes a `candidate` variable with the first element of the array and a `count` variable to keep track of occurrences. It then iterates through the array, updating the candidate and count based on the Boyer-Moore Majority Vote algorithm rules. If the count becomes zero, the candidate is reassigned to the current element, and count is reset to one. If the current element matches the candidate, the count is incremented; otherwise, the count is decremented.

The `main` function exemplifies the usage of the algorithm by providing an array of integers, {2, 2, 1, 1, 1, 2, 2}, and prints the majority element found using the `findMajorityElement` method. The output indicates the majority element in the given array, demonstrating the effectiveness of the Boyer-Moore Majority Vote algorithm in identifying the majority element with minimal space and time complexity.*/
