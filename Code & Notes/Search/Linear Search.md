## Linear Search

<i>Logic</i> : Search through the entire array/String, one element at a time from 0 to n-1, ()where, n -> size of array) and return the index of the target element.

<i>E.g.</i> :

arr = [1, 8, 12, 20, 40]

target = 12

The search will start from index 0 till index 2, where 12 will be found.

<b><i>Pseudocode</i></b> :



```java
 if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            if(a == target){
                return i;
            }
        }
```

<i>Time Complexity</i> : O(n)

<b>Linear Search  in range</b>

<b><i>Pseudocode</i></b> :

```java
if(arr.length == 0){
            return -1;
        }
        //start is searching starting point and end is ending point of search
        for(int i=start; i<=end; i++){ 
            int a = arr[i];
            if(a == target){
                return i;
            }
        }
        return -1;
    }
```
