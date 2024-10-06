trigger leadTrigger on Lead (before insert,before update) {
	leadTriggerDispatcher.dispatch(Trigger.operationType);
}