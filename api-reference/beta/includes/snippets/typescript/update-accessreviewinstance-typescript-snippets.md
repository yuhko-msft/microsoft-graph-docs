---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewInstance()
requestBody.scope = new AccessReviewScope();
requestBody.scope.additionalData = new Map([
			["@odata.type", "#microsoft.graph.principalResourceMembershipsScope"];
			["principalScopes", [
						 ["@odata.type" , "#microsoft.graph.accessReviewQueryScope"],
						 ["query" , "/v1.0/users"],
						 ["queryType" , "MicrosoftGraph"],
						 ["@odata.type" , "#microsoft.graph.accessReviewQueryScope"],
						 ["query" , "/v1.0/groups"],
						 ["queryType" , "MicrosoftGraph"],
				]
			],
			["resourceScopes", [
						 ["@odata.type" , "#microsoft.graph.accessReviewQueryScope"],
						 ["query" , "/beta/roleManagement/directory/roleDefinitions/9b895d92-2cd3-44c7-9d02-a6ac2d5ea5c3"],
						 ["queryType" , "MicrosoftGraph"],
				]
			],
		]);
requestBody.reviewers = [
			new AccessReviewReviewerScope();
requestBody.reviewers.additionalData = new Map([
					["query", "/users/1ed8ac56-4827-4733-8f80-86adc2e67db5"];
					["queryType", "MicrosoftGraph"];
				]);
		]
	],
requestBody.fallbackReviewers = [
			new AccessReviewReviewerScope();
requestBody.fallbackReviewers.additionalData = new Map([
					["query", "/users/4562bcc8-c436-4f95-b7c0-4f8ce89dca5e"];
					["queryType", "MicrosoftGraph"];
				]);
			new AccessReviewReviewerScope();
requestBody.fallbackReviewers.additionalData = new Map([
					["query", "/users/1ed8ac56-4827-4733-8f80-86adc2e67db5"];
					["queryType", "MicrosoftGraph"];
				]);
		]
	],
async () => {
	await graphServiceClient.identityGovernance.accessReviews.definitionsById("accessReviewScheduleDefinition-id").instancesById("accessReviewInstance-id").patch(requestBody);
}


```