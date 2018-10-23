# Algorithms
An implementation of the common searching and sorting and algorithms implemented in Java.

## Searching Algorithms
### Binary Search
The Binary search algorithm describes the process of searching for a specific value
in an ordered collection. <br/>
The algorithm starts from the middle of the collection. If the element you are searching for
is greater than the middle element, the search will continue with the upper half of the collection.
If the search element is smaller than the middle element, the search will then continue with the lower half of the database.
The algorithm keeps repeating this process, cutting the collection in half each time until it finds a match.
<br/>
The time complexity of a binary search is O(Log n)
<br/>
This means that the time this algorithm takes to execute given an input set of size n will not exceed `log n`

### Linear Search
The Linear search algorithm is a good choice for small lists. It looks at the first list item to see whether it is the element
you are searching for. If so, the search is done. If not, it looks at the next item in the list and does the comparision again.
In certain cases, it is referred to as sequential search. It doesn't require the array to be arranged in any given order as the case
for the Binary Search.
<br/>
The execution time for a linear search is O(n)

## Sorting Algorithms
### Quicksort
Quicksort also known as partition-exchange-sort is an efficient sorting algorithm, serving as a systematic method for placing elements of an array in order.
It leverages the divide and conquer principle. It has an average execution complexity of O(n log n) and it is one 
of the most efficient sorting algorithms, especially for big data volumes.
<br/>
The input list is divided into two sub-lists by an element called a pivot. One sub-list has elements less than the pivot and the other one has 
elements greater than the pivot. This process repeats for each sub-list.
Finally, all sorted sub-lists merge to form the final output.
<br/>
#### Algorithm Steps
1. We choose an element from the list called the pivot. It is used to divide the list into two sub-lists. <br/>
2. Elements are re-ordered around the pivot, the ones with a smaller value are placed before it, and all elements greater than the pivot
are placed after it. After this step, the pivot is in its final position . This is the important partition step. <br/>
3. The above steps are applied recursively to both sub-lists on the left and right of the pivot.


### Heap Sort
Heap sort is a comparision based sorting technique based on the Binary Heap data structure. 
It is similar to the selection sort where we first find the maximum element and place the maximum element at the end. 
The same process is repeated for the remaining elements.
<br/>
A Binary Heap is a Complete Binary Tree where items are stored in a special order such that the value of the parent node is greater(or smaller) than the values 
in its two children nodes. Hence a max heap and min heap respectively. 
#### Algorithm Steps
Since a Binary Heap is a Complete Binary Tree, it can be represented as an array. If the parent node is stored at index i, the left child can be calculated 
by 2 * i + 1 and right child by 2 * i + 2, assuming the indexing starts at 0.
<br/>
1. Build a max heap from the input data. <br/>
2. At this point, the largest item is stored at the roof of the heap. Replace it with the last item of the heap followed by reducing the size of the heap by 1. 
Finally, heapify the root of the tree.<br/>
3. Repeat the above steps while the size of the heap is greater than 1.
<br/>
The time complexity of this algorithm is O(n log n).
