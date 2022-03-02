---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewHistoryDefinition()
requestBody.displayName = "Last quarter's group reviews April 2021";
requestBody.decisions = [
			"approve",
			"deny",
			"dontKnow",
			"notReviewed",
			"notNotified"
		]
requestBody.scheduleSettings = new AccessReviewHistoryScheduleSettings();
requestBody.scheduleSettings.reportRange = "P1M";
requestBody.scheduleSettings.recurrence = new PatternedRecurrence();
requestBody.scheduleSettings.recurrence.pattern = new RecurrencePattern();
requestBody.scheduleSettings.recurrence.pattern.type = "monthly";
requestBody.scheduleSettings.recurrence.pattern.interval = 1;
requestBody.scheduleSettings.recurrence.range = new RecurrenceRange();
requestBody.scheduleSettings.recurrence.range.type = "noEnd";
requestBody.scheduleSettings.recurrence.range.startDate = "2018-08-03T21:02:30.667Z";
requestBody.scheduleSettings.recurrence.range.additionalData = new Map<string, unknown>([
					["count", 0]
				]);
const accessreviewscope = new AccessReviewScope();
accessreviewscope.additionalData = new Map<string, unknown>([
					["@odata.type", "#microsoft.graph.accessReviewQueryScope"],
					["queryType", "MicrosoftGraph"],
					["query", "/identityGovernance/accessReviews/definitions?$filter=contains(scope/query, 'accessPackageAssignments')"],
					["queryRoot", null],
				]);
const accessreviewscope1 = new AccessReviewScope();
accessreviewscope1.additionalData = new Map<string, unknown>([
					["@odata.type", "#microsoft.graph.accessReviewQueryScope"],
					["queryType", "MicrosoftGraph"],
					["query", "/identityGovernance/accessReviews/definitions?$filter=contains(scope/query, '/groups')"],
					["queryRoot", null],
				]);
requestBody.scopes = [
			accessreviewscope,
			accessreviewscope1
		]
const result = async () => {
	await graphServiceClient.identityGovernance.accessReviews.historyDefinitions.post(requestBody);
}


```