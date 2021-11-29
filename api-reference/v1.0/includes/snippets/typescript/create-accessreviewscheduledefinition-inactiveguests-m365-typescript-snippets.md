---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewScheduleDefinition()
requestBody.displayName = "Review inactive guests on teams";
requestBody.descriptionForAdmins = "Control guest user access to our teams.";
requestBody.descriptionForReviewers = "Information security is everyone's responsibility. Review our access policy for more.";
requestBody.instanceEnumerationScope = new AccessReviewScope();
requestBody.instanceEnumerationScope.additionalData = new Map([
			["@odata.type", "#microsoft.graph.accessReviewQueryScope"];
			["query", "/groups?$filter=(groupTypes/any(c:c+eq+'Unified') and resourceProvisioningOptions/Any(x:x eq 'Team')')"];
			["queryType", "MicrosoftGraph"];
		]);
requestBody.scope = new AccessReviewScope();
requestBody.scope.additionalData = new Map([
			["@odata.type", "#microsoft.graph.accessReviewInactiveUsersQueryScope"];
			["query", "./members/microsoft.graph.user/?$filter=(userType eq 'Guest')"];
			["queryType", "MicrosoftGraph"];
			["inactiveDuration", "P30D"];
		]);
requestBody.reviewers = [
			new AccessReviewReviewerScope();
requestBody.reviewers.additionalData = new Map([
					["query", "./owners"];
					["queryType", "MicrosoftGraph"];
				]);
		]
	],
requestBody.fallbackReviewers = [
			new AccessReviewReviewerScope();
requestBody.fallbackReviewers.additionalData = new Map([
					["query", "/users/fc9a2c2b-1ddc-486d-a211-5fe8ca77fa1f"];
					["queryType", "MicrosoftGraph"];
				]);
		]
	],
requestBody.settings = new AccessReviewScheduleSettings();
requestBody.settings.mailNotificationsEnabled = true;
requestBody.settings.reminderNotificationsEnabled = true;
requestBody.settings.justificationRequiredOnApproval = true;
requestBody.settings.recommendationsEnabled = true;
requestBody.settings.instanceDurationInDays = 3;
requestBody.settings.recurrence = new PatternedRecurrence();
requestBody.settings.recurrence.pattern = new RecurrencePattern();
requestBody.settings.recurrence.pattern.type = "absoluteMonthly";
requestBody.settings.recurrence.pattern.dayOfMonth = 5;
requestBody.settings.recurrence.pattern.interval = 3;
requestBody.settings.recurrence.range = new RecurrenceRange();
requestBody.settings.recurrence.range.type = "noEnd";
requestBody.settings.recurrence.range.startDate = "2020-05-04T00:00:00.000Z";
requestBody.settings.defaultDecisionEnabled = true;
requestBody.settings.defaultDecision = "Deny";
requestBody.settings.autoApplyDecisionsEnabled = true;
const result = async () => {
	await graphServiceClient.identityGovernance.accessReviews.definitions.post(requestBody);
}


```