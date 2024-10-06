/**
 * @description       : 
 * @author            : Ranjeet@hicglobalsolutions.com
 * @group             : 
 * @last modified on  : 10-02-2024
 * @last modified by  : Ranjeet@hicglobalsolutions.com
**/
public with sharing class apexTriggerHelper {
    public static void handleBeforeInsert(List<Account> accountList){
        for(Account acc:accountList){
            acc.Industry='Education';
            if(acc.Description==null){
                acc.Description='Account description is blank';
            }
            if(acc.ShippingAddress==null){
                acc.ShippingStreet=acc.BillingStreet;
                acc.ShippingCity=acc.BillingCity;
                acc.ShippingState=acc.BillingState;
                acc.ShippingPostalCode=acc.BillingPostalCode;
                acc.ShippingCountry=acc.BillingCountry;
                
            }
            if(acc.Type==null){
                acc.addError('Type should not be null');
            }
        }
    }
    
    public static void handleAfterInsert(List<Account> accountList){  
        List<Task> tasklist=new List<Task>();
        for(Account acc: accountList){
            Task t=new Task();
            t.Subject='Created from Apex Trigger';
            t.Description='Created from Apex Trigger';
            t.Status='Not Started';
            t.WhatId=acc.Id;
            t.Priority='High';
            t.OwnerId=acc.OwnerId;
            t.ActivityDate = System.today().addDays(7);
            tasklist.add(t);    
        }
        insert tasklist; 
    }
    public static void handleBeforeUpdate(List<Account> accountList, Map<Id,Account> oldaccMap){    
        
    }
}