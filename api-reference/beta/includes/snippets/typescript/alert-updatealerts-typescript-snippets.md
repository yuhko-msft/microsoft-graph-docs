---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.value = [
			new Alert();
requestBody.value.additionalData = new Map([
					["assignedTo", "String"];
					["closedDateTime", "String (timestamp)"];
					["comments", [
							"String";
						]
					],
						 ["@odata.type" , "microsoft.graph.alertFeedback"],
					["id", "String (identifier)"];
						 ["@odata.type" , "microsoft.graph.alertStatus"],
					["tags", [
							"String";
						]
					],
						 ["provider" , "String"],
						 ["vendor" , "String"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.security.alerts.updateAlerts.post(requestBody);
}


```