Sorting
=======
###Sorting Definition
Sorting is the process of arranging a group of items into a defined order, either descending or ascending, based on some criteria. Sorting algorithms generally divided into two categories: sequential sorts, which typically use a nested loops and require roughly n^2 comparisons to sort n elements and logarithmic sorts, which typically require roughly nlogn comparisons to sort n elements.

###Why we use sorting
Many important problems can be reduced to sorting. An important algorithm design technique is to use sorting as a basic building block, because many other problems become easy once a set of items is sorted.
+ Searching - Binary search tests whether an item is in a dictionary in O(logN) time, provided the keys are sorted.
+ Closest pair - Given a set of n numbers, how do you find the pair of numbers that have the smallest difference between them? Once the numbers are sorted, the closest pair of numbers must lie next to each other somewhere in sorted order.
+ Element uniqueness – Are there any duplicates in a given set of n items? This is a special case of the closest-pair problem above, where we ask if there is a pair separated by a gap of zero. The most efficient algorithm sorts the numbers and then does a linear scan though checking all adjacent pairs.
+ Frequency distribution – Given a set of n items, which element occurs the largest number of times in the set? If the items are sorted, we can sweep
from left to right and count them, since all identical items will be lumped together during sorting.

###Sorting Considerations
+ Increasing or Decreasing.
+ Sorting just the key or the entire record. A mailing list of names, addresses, and phone numbers may be sorted by names as the key field, but it
had better retain the linkage between names and addresses.
+ What should we do with equal keys? Suppose an encyclopedia contains both Michael Jordan (the basketball player) and Michael Jordan (the statistician). Which entry should appear first? You may need to resort to secondary keys, such as article size, to resolve ties in a meaningful way.
+ What about non-numerical data? - Alphabetizing is the sorting of text strings. Libraries have very complete and complicated rules concerning the relative collating sequence of characters and punctuation. Is Skiena the same key as skiena? Is Brown-Williams before or after Brown America, and before or after Brown, John?

The right way to specify such matters to your sorting algorithm is with an application-specific pairwise element `comparison function`. By abstracting the pairwise ordering decision to such a comparison function, we can implement sorting algorithms independently of such criteria. We simply pass the comparison function in as an argument to the sort procedure.

###Basic Sorting Algorithms
####Selection Sort
The selection sort algorithm sorts a list of values by repetitively putting a particular value into its final, sorted, position.

The general strategy of the selection algorithm is as follows:
+ Scan the entire list to find the smallest value.
+ Exchange that value with the value in the first position.
+ Scan the rest of the list to find the smallest value and then exchange it with the value in the second position of the list.
+ Continue this process for each position in the list.

Selection sort is specified an in-place comparison sort. It has O(N^2) time complexity. Selection is noted for its simplicity, it is useful when auxiliary memory is limited.

This more efficient variation of selection sort remembers the index of the smallest element that it finds in each pass. At the end of each pass it makes one exchange, if necessary. This is more efficient.
```
public void selection(int[] nums) {
    if (nums == null || nums.length == 1) {
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
            final int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
```

The `selection sort` improves on the `bubble sort` by reducing the number of swaps necessary from O(N ^ 2) to O(N). The time complexity of `selection sort` is still O(N ^ 2), however, it is faster than `bubble sort` because it reduces the swap times.

####Insertion Sort
The _insertion sort_ algorithm sorts a list of values by repetitively inserting a particular value into a subset of the list that has already been sorted.

+ Sort the first two values in the list relative to each other by exchanging them if necessary.
+ Insert the list’s third value into the appropriate position relative to the first two (sorted) values.
+ Then insert the fourth value into its proper position relative to the first three values in the list.
+ Each time an insertion is made, the number of values in the sorted subset in- creases by one. Continue this process until all values in the list are completely sorted.

```
public void insertion(int[] nums) {
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
```

####Quick Sort
The quick sort algorithm sorts a list by partitioning the list using an arbitrarily chosen partition element and then recursively sorting the sublists on either side of the partition element.

The general strategy of the quick sort algorithm is as follows:
+ Choose one element of the list to act as a partition element.
+ Partition the list so that all elements less than the partition element are to the left of that element and all elements greater than the partition element are to the right.
+ Apply this quick sort strategy (recursively) to both partitions.

####Merge Sort
The merge sort algorithm, another recursive sort algorithm, sorts a list by recursively dividing the list in half until each sublist has one element and then recombining these sublists in order.

The general strategy of the merge sort algorithm is as follows: Begin by dividing the list in two roughly equal parts and then recursively calling itself with each of those lists. Continue the recursive decomposition of the list until the base case of the recursion is reached, where the list is divided into lists of length one, which are by definition sorted. Then, as control passes back up the recursive calling structure, the algorithm merges the two sorted sublists resulting from the two recursive calls into one sorted list.

