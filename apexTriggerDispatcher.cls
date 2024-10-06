/**
 * @description       : 
 * @author            : Ranjeet@hicglobalsolutions.com
 * @group             : 
 * @last modified on  : 10-02-2024
 * @last modified by  : Ranjeet@hicglobalsolutions.com
**/
public
    class TriggerDispatcher {
      private
      final ITriggerHandler triggerHandler;
      private
      final TriggerContextData triggerContext;
      private
      static final String className = TriggerDispatcher.class.getName();
    
      /**
       * @description constructor to initialize a new dispatcher that handles
       * trigger event and variables routing
       * @param triggerHandler is used for event handling
       * @param TriggerContextData is used for flow control
       */
      public
      TriggerDispatcher(ITriggerHandler triggerHandler, TriggerContextData triggerContext) {
        if (triggerHandler == null) {
          throw new IllegalArgumentException('triggetHandler cannot be null');
        }
        if (triggerContext == null) {
          throw new IllegalArgumentException('triggetContext cannot be null');
        }
        this.triggerHandler = triggerHandler;
        this.triggerContext = triggerContext;
      }
    
      /**
       * @description handle all the variable and handler function routing.
       * DO NOT CALL this method directly outside of trigger definition
       */
      public
      void dispatch() {
        if (!triggerContext.isExecuting) {
          throw new InvalidOperationException('dispatch should not be used outside of trigger execution');
        }
    
        if (triggerContext.isBefore) {
          if (triggerContext.isInsert) {
            beforeInsert();
          } else if (triggerContext.isUpdate) {
            beforeUpdate();
          } else if (triggerContext.isDelete) {
            beforeDelete();
          }
        } else if (triggerContext.isAfter) {
          if (triggerContext.isInsert) {
            afterInsert();
          } else if (triggerContext.isUpdate) {
            afterUpdate();
          } else if (triggerContext.isDelete) {
            afterDelete();
          } else if (triggerContext.isUndelete) {
            afterUndelete();
          }
        }
      }
    
      private
      void beforeInsert() {
        triggerHandler.onBeforeInsert(triggerContext.newObjects);
      }
    
      private
      void afterInsert() {
        triggerHandler.onAfterInsert(triggerContext.newObjects, triggerContext.newMap);
      }
    
      private
      void beforeUpdate() {
        triggerHandler.onBeforeUpdate(triggerContext.newObjects,
            triggerContext.oldObjects,
            triggerContext.newMap,
            triggerContext.oldMap);
      }
    
      private
      void afterUpdate() {
        triggerHandler.onAfterUpdate(triggerContext.newObjects,
            triggerContext.oldObjects,
            triggerContext.newMap,
            triggerContext.oldMap);
      }
    
      private
      void beforeDelete() {
        triggerHandler.onBeforeDelete(triggerContext.oldObjects, triggerContext.oldMap);
      }
    
      private
      void afterDelete() {
        triggerHandler.onAfterDelete(triggerContext.oldObjects, triggerContext.oldMap);
      }
    
      private
      void afterUndelete() {
        triggerHandler.onAfterUndelete(triggerContext.newObjects, triggerContext.newMap);
      }
    }