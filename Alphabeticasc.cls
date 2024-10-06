public class Alphabeticasc {
    public static void run(){
        List<Account> accountlist=new List<Account>();
    for(Account acc1:accountlist){
        System.debug(acc1.Name);  
        List<Account> accountlist1=[SELECT Name FROM Account WHERE Name=:acc1.Name];
        if(accountlist1!=null){
            System.debug('Name of account'+accountlist1); 
        }
        else{
            System.debug('Name of account is not given'); 
        }
    }        
       
    }
}