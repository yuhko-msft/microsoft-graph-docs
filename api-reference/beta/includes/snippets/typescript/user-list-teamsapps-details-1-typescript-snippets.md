---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

let requestParameters = {
	expand : "teamsAppDefinition",
};
const result = async () => {
	await graphServiceClient.usersById("user-id").teamwork.installedAppsById("userScopeTeamsAppInstallation-id").get(requestParameters);
}


```