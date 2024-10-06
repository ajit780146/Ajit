trigger contactTrigger on Contact (before insert,before update) {
	contactTriggerDispatcher.dispatch(Trigger.operationType);
}