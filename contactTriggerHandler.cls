public class contactTriggerHandler {
    public static void handleBeforeInsert(List<Contact> contactList){
        for(Contact acc:contactList){
            acc.Title='pandit';
             System.debug(acc.Fax);
            List<Contact> accList2=[SELECT Id,Fax FROM Contact WHERE fax=:acc.Fax];
            Account ab=new Account();
            if(accList2==null){
                acc.Fax=ab.Fax;
            }
            if(acc.Email==null&&acc.MobilePhone==null){
                acc.Email.addError('The email field cannot be null');
                acc.MobilePhone.addError('The mobile field cannot be null');
            }
            System.debug(acc.LeadSource);
            System.debug(acc.Email);
            List<Contact> accList=[SELECT Id,LeadSource,Email FROM Contact WHERE LeadSource=:acc.LeadSource AND Email=:acc.Email LIMIT 1];
            if(accList!=null && accList.size()>0){
                 acc.addError('Duplicate account exist with same leadsource and email');
                 acc.LeadSource.addError('Duplicate account exist with same leadsource');
                 acc.Email.addError('Duplicate account exist with same email');
            }
        }
    }
   public static void handleBeforeUpdate(List<Contact> contactList,List<Contact> contactList1){
        for(Contact acc:contactList){  
            if(acc.Gender__c=='Male'){
                acc.Salutation='Mr';
            }
            if(acc.Gender__c=='Female'){
                acc.Salutation='Mrs';
            }
            acc.Title='pandit';
            Set<Id> account1=new Set<Id>();
             System.debug(acc.Fax);
            List<Contact> accList2=[SELECT Id,Fax FROM Contact WHERE Id IN:account1];
            Account ab=new Account();
            if(accList2==null){
                acc.Fax=ab.Fax;
            }
            if(acc.Email==null&&acc.MobilePhone==null){
                acc.Email.addError('The email field cannot be null');
                acc.MobilePhone.addError('The mobile field cannot be null');
            }
            System.debug(acc.LeadSource);
            System.debug(acc.Email);
            List<Contact> accList=[SELECT Id,LeadSource,Email FROM Contact WHERE LeadSource=:acc.LeadSource AND Email=:acc.Email LIMIT 1];
            if(accList!=null && accList.size()>0){
                 acc.addError('Duplicate account exist with same leadsource and email');
                 acc.LeadSource.addError('Duplicate account exist with same leadsource');
                 acc.Email.addError('Duplicate account exist with same email');
            }
        }
   }
}