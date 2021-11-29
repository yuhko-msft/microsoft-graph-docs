---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewHistoryDefinition()
requestBody.displayName = "Last quarter's group reviews April 2021";
requestBody.decisions = [
			"approve";
			"deny";
			"dontKnow";
			"notReviewed";
			"notNotified";
		]
	],
requestBody.reviewHistoryPeriodStartDateTime =  new Date("2021-01-01T00:00:00Z");
requestBody.reviewHistoryPeriodEndDateTime =  new Date("2021-04-05T00:00:00Z");
requestBody.scopes = [
			new AccessReviewScope();
requestBody.scopes.additionalData = new Map([
					["@odata.type", "#microsoft.graph.accessReviewQueryScope"];
					["queryType", "MicrosoftGraph"];
					["query", "/identityGovernance/accessReviews/definitions?$filter=contains(scope/query, 'accessPackageAssignments')"];
					["queryRoot", null],
				]);
			new AccessReviewScope();
requestBody.scopes.additionalData = new Map([
					["@odata.type", "#microsoft.graph.accessReviewQueryScope"];
					["queryType", "MicrosoftGraph"];
					["query", "/identityGovernance/accessReviews/definitions?$filter=contains(scope/query, '/groups')"];
					["queryRoot", null],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.identityGovernance.accessReviews.historyDefinitions.post(requestBody);
}


```