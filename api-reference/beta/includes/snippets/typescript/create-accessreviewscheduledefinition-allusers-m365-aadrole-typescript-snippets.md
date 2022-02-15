---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewScheduleDefinition()
requestBody.displayName = "Review employee access to LinkedIn";
requestBody.descriptionForAdmins = "Review employee access to LinkedIn";
requestBody.scope = new AccessReviewScope();
requestBody.scope.additionalData = new Map([
			["@odata.type", "#microsoft.graph.principalResourceMembershipsScope"];
			["principalScopes", [
						 ["@odata.type" , "#microsoft.graph.accessReviewQueryScope"],
						 ["query" , "/users"],
						 ["queryType" , "MicrosoftGraph"],
				]
			],
			["resourceScopes", [
						 ["@odata.type" , "#microsoft.graph.accessReviewQueryScope"],
						 ["query" , "/servicePrincipals/bae11f90-7d5d-46ba-9f55-8112b59d92ae"],
						 ["queryType" , "MicrosoftGraph"],
				]
			],
		]);
requestBody.reviewers = [
			new AccessReviewReviewerScope();
requestBody.reviewers.additionalData = new Map([
					["query", "./manager"];
					["queryType", "MicrosoftGraph"];
					["queryRoot", "decisions"];
				]);
		]
	],
requestBody.backupReviewers = [
			new AccessReviewReviewerScope();
requestBody.backupReviewers.additionalData = new Map([
					["query", "/groups/072ac5f4-3f13-4088-ab30-0a276f3e6322/transitiveMembers"];
					["queryType", "MicrosoftGraph"];
				]);
		]
	],
requestBody.fallbackReviewers = [
			new AccessReviewReviewerScope();
requestBody.fallbackReviewers.additionalData = new Map([
					["query", "/groups/072ac5f4-3f13-4088-ab30-0a276f3e6322/transitiveMembers"];
					["queryType", "MicrosoftGraph"];
				]);
		]
	],
requestBody.settings = new AccessReviewScheduleSettings();
requestBody.settings.mailNotificationsEnabled = true;
requestBody.settings.reminderNotificationsEnabled = true;
requestBody.settings.justificationRequiredOnApproval = true;
requestBody.settings.defaultDecisionEnabled = true;
requestBody.settings.defaultDecision = "Recommendation";
requestBody.settings.instanceDurationInDays = 180;
requestBody.settings.autoApplyDecisionsEnabled = true;
requestBody.settings.recommendationsEnabled = true;
requestBody.settings.recurrence = new PatternedRecurrence();
requestBody.settings.recurrence.pattern = new RecurrencePattern();
requestBody.settings.recurrence.pattern.type = "absoluteMonthly";
requestBody.settings.recurrence.pattern.interval = 6;
requestBody.settings.recurrence.pattern.dayOfMonth = 0;
requestBody.settings.recurrence.range = new RecurrenceRange();
requestBody.settings.recurrence.range.type = "numbered";
requestBody.settings.recurrence.range.startDate = "2021-05-05";
requestBody.settings.recurrence.range.endDate = "2022-05-05";
const result = async () => {
	await graphServiceClient.identityGovernance.accessReviews.definitions.post(requestBody);
}


```