---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

GraphServiceClient graphClient = new GraphServiceClient( authProvider );

var sharedWithChannelTeams = await graphClient.Teams["{team-id}"].Channels["{channel-id}"].SharedWithTeams
	.Request()
	.GetAsync();

```