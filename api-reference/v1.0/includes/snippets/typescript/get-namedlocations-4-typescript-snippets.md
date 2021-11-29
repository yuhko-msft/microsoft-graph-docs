---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	filter : "microsoft.graph.countryNamedLocation/countriesAndRegions/any",
};
const result = async () => {
	await graphServiceClient.identity.conditionalAccess.namedLocations.get(requestParameters);
}


```