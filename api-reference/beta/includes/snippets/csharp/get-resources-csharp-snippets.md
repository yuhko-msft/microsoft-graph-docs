---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

GraphServiceClient graphClient = new GraphServiceClient( authProvider );

var resources = await graphClient.Education.Classes["{id}"].Assignments["{id}"].Submissions["{id}"].Resources
	.Request()
	.GetAsync();

```