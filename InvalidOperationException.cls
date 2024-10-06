/**
 * @description       : 
 * @author            : Ranjeet@hicglobalsolutions.com
 * @group             : 
 * @last modified on  : 10-02-2024
 * @last modified by  : Ranjeet@hicglobalsolutions.com
**/
public class InvalidOperationException extends Exception {
    public override string getMessage(){
            return 'dispatch should not be used outside of trigger execution';
        }
     
    }