public class SortedScores{
public String[] SortedScores(String [] returnVal){
       int [] scs = new int[10];

       for(int i = 0; i < 10; i++){
       	       scs[i] = Integer.parseInt(returnVal[i]);
       }

       for( int o = 0; o < scs.length-1; ++o )
       	{
			if(scs[o] < scs[o+1]) {
	             int temp = scs[o];
	             scs[o] = scs[o+1];
	             scs[o+1] = temp;
			 }
       	}

       for(int j = 0; j < 10; j++){
	   returnVal[j] = Integer.toString(scs[j]);
       }

       for(int x = 0; x < returnVal.length; x++)
       {
		   System.out.println(returnVal[x]);
	   }
       return returnVal;
}

}
