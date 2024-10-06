public class ContactRecord {
    public static void run(){
        List<Account> accountlist=new List<Account>();
      //  Account record=new Account();
        for(Account record:accountlist){
            Contact t=new Contact();
            t.FirstName='Ajit';
            t.LastName='Pandit';
            t.OwnerId=record.Id;
            t.Phone='4566565';
            t.Email='ajit123@gmail.com';
            System.debug(t);
            insert t;
		}
    }
}