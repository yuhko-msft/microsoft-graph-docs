---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

// Code snippets are only available for the latest version. Current version is 5.x

var graphClient = new GraphServiceClient(requestAdapter);

var requestBody = new PronounsSettings
{
	IsEnabledInOrganization = true,
};
var result = await graphClient.Organization["{organization-id}"].Settings.Pronouns.PatchAsync(requestBody);


```