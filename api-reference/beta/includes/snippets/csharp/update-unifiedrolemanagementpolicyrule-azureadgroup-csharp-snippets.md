---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

// Code snippets are only available for the latest version. Current version is 5.x

var graphClient = new GraphServiceClient(requestAdapter);

var requestBody = new UnifiedRoleManagementPolicyExpirationRule
{
	OdataType = "#microsoft.graph.unifiedRoleManagementPolicyExpirationRule",
	Id = "Expiration_EndUser_Assignment",
	IsExpirationRequired = true,
	MaximumDuration = TimeSpan.Parse("PT1H45M"),
	Target = new UnifiedRoleManagementPolicyRuleTarget
	{
		Caller = "EndUser",
		Operations = new List<string>
		{
			"All",
		},
		Level = "Assignment",
		InheritableSettings = new List<String>
		{
		},
		EnforcedSettings = new List<String>
		{
		},
	},
};
var result = await graphClient.Policies.RoleManagementPolicies["{unifiedRoleManagementPolicy-id}"].Rules["{unifiedRoleManagementPolicyRule-id}"].PatchAsync(requestBody);


```