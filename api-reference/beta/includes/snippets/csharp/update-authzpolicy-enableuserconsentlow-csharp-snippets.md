---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

// Code snippets are only available for the latest version. Current version is 5.x

var graphClient = new GraphServiceClient(requestAdapter);

var requestBody = new AuthorizationPolicy
{
	PermissionGrantPolicyIdsAssignedToDefaultUserRole = new List<string>
	{
		"managePermissionGrantsForSelf.microsoft-user-default-low",
	},
};
var result = await graphClient.Policies.AuthorizationPolicy["{authorizationPolicy-id}"].PatchAsync(requestBody);


```