public class Fibonacci_series {
    public static void run(){
        Integer i=0,i1=0,i2=1,i3;
        for(i=0;i<10;i++){
            i3=i2+i1;
            System.debug('Fibonacci series='+i3);
            i1=i2;
            i2=i3; 
        }
    }
}