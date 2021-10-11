---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

GraphServiceClient graphClient = new GraphServiceClient( authProvider );

var sharedWithChannelTeam = await graphClient.Teams["{team-id}"].Channels["{channel-id}"].SharedWithTeams["{shared-with-team-id}"]
	.Request()
	.GetAsync();

```