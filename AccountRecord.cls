public class AccountRecord {
    public static void run(){
        List<Account> accountlist=new List<Account>();
        for(Integer i=0;i<20;i++){
        Account accountrecord=new Account();
        accountrecord.Phone='764763636';
        accountrecord.BillingPostalCode='2344';
        accountrecord.Name='beko';
        accountrecord.BillingCity='koderma';
        accountrecord.BillingCountry='india';
        accountlist.add(accountrecord);  
        }
          insert accountlist;
    }
}