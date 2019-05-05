public class Insert {

    public void insert1( List_inArraySlots list, int alreadyInserted){
	String valueToInsert = list[ alreadyInserted];

	if( list[ 0] > valueToInsert){
	    //shift 
	    for( int index = alreadyInserted; index != 0; index--)
		list[ index] = list[ index-1];
            //drop
	    list[ 0] = valueToInsert;
	}

	else{
	    for( int indexToCompare = alreadyInserted
		     ; indexToCompare != 0
		     ; indexToCompare--){
		if( valueToInsert < list[ indexToCompare]){
		    //shift 
		    for( int index = alreadyInserted; index != 0; index--)
			list[ index] = list[ index-1];
		}
		else
		    //drop
		    list[ indexToCompare] = valueToInsert;
	    }
	}
    }

    public void insertionSort( List_inArraySlots list){
	for( int goodNameNeeded = 1
		 ; goodNameNeeded < list.size()
		 ; goodNameNeeded++){
	    insert1( list, goodNameNeeded);
	    // for debugging
	    System.out.println( "    dbg: "
				+ "after inserting element " + goodNameNeeded
				+ " elements: " + list
				);
	}
    }
    
}
