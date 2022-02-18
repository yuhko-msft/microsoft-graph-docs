---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new MessageRule()
requestBody.displayName = "From partner";
requestBody.sequence = 2;
requestBody.isEnabled = true;
requestBody.conditions = new MessageRulePredicates();
requestBody.conditions.senderContains = [
				"adele";
			]
		],
requestBody.actions = new MessageRuleActions();
requestBody.actions.forwardTo = [
				new Recipient();
requestBody.actions.forwardTo.additionalData = new Map([
							 ["name" , "Alex Wilbur"],
							 ["address" , "AlexW@contoso.onmicrosoft.com"],
					]);
			]
		],
requestBody.actions.stopProcessingRules = true;
const result = async () => {
	await graphServiceClient.me.mailFoldersById("mailFolder-id").messageRules.post(requestBody);
}


```