/**
 * @description       : 
 * @author            : Ranjeet@hicglobalsolutions.com
 * @group             : 
 * @last modified on  : 10-02-2024
 * @last modified by  : Ranjeet@hicglobalsolutions.com
**/
public interface ITriggerHandler 
{
    void onBeforeInsert(List<SObject> newList);
    void onAfterInsert(List<SObject> newList, Map<Id, SObject> newMap);
    
    void onBeforeUpdate(List<SObject> oldList, List<SObject> newList, 
                      Map<Id, SObject> newMap, Map<Id, SObject> oldMap);
    
    void onAfterUpdate(List<SObject> oldList, List<SObject> newList, 
                     Map<Id, SObject> newMap, Map<Id, SObject> oldMap);
    
    
    void onBeforeDelete(List<SObject> oldList, Map<Id, SObject> oldMap);
    void onAfterDelete(List<SObject> oldList, Map<Id, SObject> oldMap);
    
    void onAfterUndelete(List<SObject> oldList, Map<Id, SObject> oldMap);
    
}