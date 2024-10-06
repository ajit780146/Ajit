public class LargestNumber {
	public static void run(){
        List<Integer> oddlist=new List<Integer>();
        oddlist.add(13);
        oddlist.add(16);
        oddlist.add(137);
        oddlist.add(1131);
        System.debug('The list of integers are='+oddlist);
        Integer[] ab=oddlist;
        System.debug(ab);
        Integer temp,j;
        temp=ab[0];
            for( j=1;J<oddlist.size();j++){
                if(ab[j]>temp){
                    temp=ab[j];
                }
            } 
            System.debug('The largest element is='+temp); 
        }
}