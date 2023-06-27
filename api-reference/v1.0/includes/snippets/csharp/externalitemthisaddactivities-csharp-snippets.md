---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

// Code snippets are only available for the latest version. Current version is 5.x

var graphClient = new GraphServiceClient(requestAdapter);

var requestBody = new Microsoft.Graph.Connections.Item.Items.Item.MicrosoftGraphExternalConnectorsAddActivities.AddActivitiesPostRequestBody
{
	Activities = new List<Microsoft.Graph.Models.ExternalConnectors.ExternalActivity>
	{
		new Microsoft.Graph.Models.ExternalConnectors.ExternalActivity
		{
			OdataType = "#microsoft.graph.externalConnectors.externalActivity",
			Type = Microsoft.Graph.Models.ExternalConnectors.ExternalActivityType.Created,
			StartDateTime = DateTimeOffset.Parse("2021-04-06T18:04:31.033Z"),
			PerformedBy = new Microsoft.Graph.Models.ExternalConnectors.Identity
			{
				Type = Microsoft.Graph.Models.ExternalConnectors.IdentityType.User,
				Id = "1f0c997e-99f7-43f1-8cca-086f8d42be8d",
			},
		},
	},
};
var result = await graphClient.Connections["{externalConnection-id}"].Items["{externalItem-id}"].MicrosoftGraphExternalConnectorsAddActivities.PostAsync(requestBody);


```