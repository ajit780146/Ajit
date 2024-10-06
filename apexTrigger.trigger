/**
 * @description       : 
 * @author            : Ranjeet@hicglobalsolutions.com
 * @group             : 
 * @last modified on  : 10-02-2024
 * @last modified by  : Ranjeet@hicglobalsolutions.com
**/
trigger apexTrigger on Account (before insert,
                                after insert,
                                before update,
                                after update,
                                before delete,
                                after delete,
                                after undelete) {
   TriggerContextData contextData = new TriggerContextData(Trigger.isExecuting, 
                                                            Trigger.isInsert,
                                                            Trigger.isUpdate,
                                                            Trigger.isDelete,
                                                            Trigger.isUndelete,
                                                            Trigger.isBefore,
                                                            Trigger.isAfter,
                                                            Trigger.new,
                                                            Trigger.old,
                                                            Trigger.newMap,
                                                            Trigger.oldMap);
    ITriggerHandler handler = apexTriggerHandler.getInstance();
    TriggerDispatcher dispatcher = new TriggerDispatcher(handler, contextData);
    dispatcher.dispatch();
}