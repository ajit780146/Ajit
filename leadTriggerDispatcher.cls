public class leadTriggerDispatcher {
	public static void dispatch(System.TriggerOperation operationType){
        switch on operationType{
            WHEN BEFORE_INSERT{
                leadTriggerHandler.handleBeforeInsert(Trigger.New);
            }
            WHEN BEFORE_UPDATE{
                leadTriggerHandler.handleBeforeUpdate(Trigger.New,Trigger.Old);
            }
        }
    }
}