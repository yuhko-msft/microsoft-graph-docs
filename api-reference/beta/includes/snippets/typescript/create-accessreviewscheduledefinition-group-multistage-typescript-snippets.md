---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewScheduleDefinition()
requestBody.displayName = "Group Multi-stage Access Review";
requestBody.descriptionForAdmins = "New scheduled access review";
requestBody.descriptionForReviewers = "If you have any questions, contact jerry@contoso.com";
requestBody.scope = new AccessReviewScope();
requestBody.scope.additionalData = new Map([
			["@odata.type", "#microsoft.graph.accessReviewQueryScope"];
			["query", "/groups/02f3bafb-448c-487c-88c2-5fd65ce49a41/transitiveMembers"];
			["queryType", "MicrosoftGraph"];
		]);
requestBody.stageSettings = [
			new AccessReviewStageSettings();
requestBody.stageSettings.additionalData = new Map([
					["stageId", "1"];
					["durationInDays", 2];
					["recommendationsEnabled", false];
					["decisionsThatWillMoveToNextStage", [
							"NotReviewed";
							"Approve";
						]
					],
					["reviewers", [
								 ["query" , "/users/398164b1-5196-49dd-ada2-364b49f99b27"],
								 ["queryType" , "MicrosoftGraph"],
						]
					],
				]);
			new AccessReviewStageSettings();
requestBody.stageSettings.additionalData = new Map([
					["stageId", "2"];
					["dependsOn", [
							"1";
						]
					],
					["durationInDays", 2];
					["recommendationsEnabled", true];
					["reviewers", [
								 ["query" , "./manager"],
								 ["queryType" , "MicrosoftGraph"],
								 ["queryRoot" , "decisions"],
						]
					],
					["fallbackReviewers", [
								 ["query" , "/groups/072ac5f4-3f13-4088-ab30-0a276f3e6322/transitiveMembers"],
								 ["queryType" , "MicrosoftGraph"],
						]
					],
				]);
		]
	],
requestBody.settings = new AccessReviewScheduleSettings();
requestBody.settings.mailNotificationsEnabled = true;
requestBody.settings.reminderNotificationsEnabled = true;
requestBody.settings.justificationRequiredOnApproval = true;
requestBody.settings.defaultDecisionEnabled = false;
requestBody.settings.defaultDecision = "None";
requestBody.settings.instanceDurationInDays = 4;
requestBody.settings.recurrence = new PatternedRecurrence();
requestBody.settings.recurrence.pattern = new RecurrencePattern();
requestBody.settings.recurrence.pattern.type = "weekly";
requestBody.settings.recurrence.pattern.interval = 1;
requestBody.settings.recurrence.range = new RecurrenceRange();
requestBody.settings.recurrence.range.type = "noEnd";
requestBody.settings.recurrence.range.startDate = "2020-09-08T12:02:30.667Z";
requestBody.settings.decisionHistoriesForReviewersEnabled = true;
const result = async () => {
	await graphServiceClient.identityGovernance.accessReviews.definitions.post(requestBody);
}


```