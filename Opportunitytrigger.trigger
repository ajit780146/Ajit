trigger Opportunitytrigger on Opportunity (before insert,before update) {
	OpportunitytriggerDispatcher.dispatch(Trigger.operationType);
}