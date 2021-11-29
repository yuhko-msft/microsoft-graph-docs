---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new NamedLocation()
requestBody.displayName = "Untrusted named location with only IPv4 address";
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.ipNamedLocation"];
		["isTrusted", false];
		["ipRanges", [
					 ["@odata.type" , "#microsoft.graph.iPv4CidrRange"],
					 ["cidrAddress" , "6.5.4.3/18"],
			]
		],
	]);
async () => {
	await graphServiceClient.identity.conditionalAccess.namedLocationsById("namedLocation-id").patch(requestBody);
}


```