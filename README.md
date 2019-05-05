# insertionSort

**insert1** method
parameters: List_iAS list, int alreadyInserted

1. The valueToInsert is at index alreadyInserted in the list
- iterate indexToCompare through the sorted region from high values towards low
  - If previous iterations found that even the smallest value in the sorted region exceeds valueToInsert, then drop the valueToInsert at the beginning of the sorted region.
  - otherwise…
    - if valueToInsert < list[ indexToCompare], then shift()
    - else dropValue()

**insertionSort** method
parameter: List_iAS list

2. iterate goodNameNeeded through list's indexes, from 1 to the end of the list
  - insert1( list, _goodNameNeeded_ )
  - for debugging: display the data. Humility helps me. I expect to make errors. Here's the code I wrote and tested before I wrote any sorting logic:
```
// for debugging
System.out.println( "    dbg: "
  + "after inserting element " + goodNameNeeded
  + " elements: " + elements
  );
```
