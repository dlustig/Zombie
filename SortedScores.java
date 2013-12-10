public class SortedScores{
public String[] SortedScores(String [] returnVal){
       int [] scs = new int[10];
       
       for(int i = 0; i < 10; i++){
       	       scs[i] = Integer.parseInt(returnVal[i]);
       }

       for( int o = 0; o < scs.length/2; ++o )
       	{
             int temp = scs[o];
             scs[o] = scs[scs.length - o - 1];
             scs[scs.length - o - 1] = temp;
       	}

       for(int j = 0; j < 10; j++){
	   returnVal[j] = Integer.toString(scs[j]);
       }
       return returnVal;
}

}
