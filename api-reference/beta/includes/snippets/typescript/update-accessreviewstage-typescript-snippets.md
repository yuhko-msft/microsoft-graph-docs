---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessReviewStage()
const accessreviewreviewerscope = new AccessReviewReviewerScope();
accessreviewreviewerscope.additionalData = new Map<string, unknown>([
					["query", "/users/1ed8ac56-4827-4733-8f80-86adc2e67db5"],
					["queryType", "MicrosoftGraph"]
				]);
requestBody.reviewers = [
			accessreviewreviewerscope
		]
const accessreviewreviewerscope = new AccessReviewReviewerScope();
accessreviewreviewerscope.additionalData = new Map<string, unknown>([
					["query", "/users/4562bcc8-c436-4f95-b7c0-4f8ce89dca5e"],
					["queryType", "MicrosoftGraph"]
				]);
const accessreviewreviewerscope1 = new AccessReviewReviewerScope();
accessreviewreviewerscope1.additionalData = new Map<string, unknown>([
					["query", "/users/1ed8ac56-4827-4733-8f80-86adc2e67db5"],
					["queryType", "MicrosoftGraph"]
				]);
requestBody.fallbackReviewers = [
			accessreviewreviewerscope,
			accessreviewreviewerscope1
		]
requestBody.additionalData = new Map<string, unknown>([
		["@odata.type", "#microsoft.graph.accessReviewStage"]
	]);
async () => {
	await graphServiceClient.identityGovernance.accessReviews.definitionsById("accessReviewScheduleDefinition-id").instancesById("accessReviewInstance-id").stagesById("accessReviewStage-id").patch(requestBody);
}


```