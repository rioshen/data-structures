public class SortingAlgo {
    /**
     * Selection sort is a in-place comparison sort.
     */
    public static void selection(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (nums[minIndex] > nums[j]) { // remember the min index
                    minIndex = j;
                }
            }

            if (minIndex != i) { // the smallest element is found, update it
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    public static void insertion(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        for (int index = 1; index < nums.length; index++) {
            int key = nums[index];
            int position = index;

            while (position > 0 && nums[position - 1] > key) {
                nums[position] = nums[position - 1];
                position--;
            }
            nums[position] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1 };
        selection(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr2 = {5, 4, 3, 2, 1 };
        insertion(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
