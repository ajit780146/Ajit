public class contactTriggerDispatcher {
    public static void dispatch(System.TriggerOperation operationType){
        switch on operationType{
            WHEN BEFORE_INSERT{
                contactTriggerHandler.handleBeforeInsert(Trigger.New);
            }
            WHEN BEFORE_UPDATE{
                contactTriggerHandler.handleBeforeUpdate(Trigger.New,Trigger.Old);
            }
        }
    }
}