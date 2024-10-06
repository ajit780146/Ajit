public class DeleteContact {
    public static void run(){
        List<Account> accountlist=new List<Account>();
        for(Account acc:accountlist){
            System.Debug(acc.Name);
            List<Account> account1=[SELECT Id,Name FROM Account WHERE Name LIKE '%A%'];
            
            System.debug('list of account'+account1);
           
        }
        
    }
}