---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

// Code snippets are only available for the latest version. Current version is 5.x

var graphClient = new GraphServiceClient(requestAdapter);

await graphClient.Chats["{chat-id}"].InstalledApps["{teamsAppInstallation-id}"].Upgrade.PostAsync();


```