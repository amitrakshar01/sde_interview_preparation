## Binary Search

<b>Works only on sorted Arrays</b>

<i>Step 1</i> : Take the middle element of the array -> M

<i>Step 2</i> : Check whether target element -> T is less than, equal to or greater than M

<i>Step 3</i> : If T == M, return index; If T<M search left of M and vice-versa(Considering ascending sorted array)

<i>E.g.</i> :

arr = [2, 4, 6, 8, 12, 15, 22, 40, 48]; T = 8;

M = (0 + 8)/2 -> 0 and 8 are starting and ending indexes. -> M = 4 (12)

8 < 12: Array reduces to [2, 4, 6, 8] <br> Start = 0; End = 3; M = (0 + 3)/2 = 1 (4)

8 > 4: Array reduces to [6, 8]<br> Start = 2; End = 3; M = (2 + 3)/2 = 2 (6)

8 > 6: Array reduces to only [8]<br> Start =  End = 3 (8) -> Element found



<b><i>Pseudocode</i></b> :

```java

```





<b>Time Complexity</b> : O(log n)

<i>To find out whether array sorted in Ascending or Descending order compare the first and last element of the array</i> 
