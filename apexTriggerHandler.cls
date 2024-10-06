/**
 * @description       : 
 * @author            : Ranjeet@hicglobalsolutions.com
 * @group             : 
 * @last modified on  : 10-02-2024
 * @last modified by  : Ranjeet@hicglobalsolutions.com
**/
public class apexTriggerHandler implements ITriggerHandler {
    private static ITriggerHandler instance;
     public static void onBeforeInsert(List<sObject> newObjects){
       
     }
     public static void onAfterInsert(List<sObject> newObjects, Map<ID, sObject> newMap){  
        apexTriggerHelper.handleBeforeInsert(newObjects);
     }
     public static void onBeforeUpdate(List<sObject> newObjects,List<sObject> oldObjects, Map<ID, sObject> newMap,Map<ID, sObject> oldMap){
      
     } 
     public static void onAfterUpdate(List<sObject> newObjects,List<sObject> oldObjects, Map<ID, sObject> newMap, Map<ID, sObject> oldMap){   
     }
     public static void onBeforeDelete(List<sObject> oldObjects, Map<ID, sObject> oldMap){    
     }
     public static void onAfterDelete(List<sObject> oldObjects, Map<ID, sObject> oldMap){   
     }
     public static void onAfterUndelete(List<sObject> newObjects, Map<ID, sObject> newMap){   
     }
     public
         static ITriggerHandler getInstance() {
             if (instance == null) {
                 instance = new apexTriggerHandler();
             }
             return instance;
         }
   
   }