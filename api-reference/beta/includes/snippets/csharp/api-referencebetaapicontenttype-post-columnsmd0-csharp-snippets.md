---
description: "Automatically generated file. DO NOT MODIFY"
---

```csharp

// Code snippets are only available for the latest version. Current version is 5.x

var graphClient = new GraphServiceClient(requestAdapter);

var requestBody = new ColumnDefinition
{
	AdditionalData = new Dictionary<string, object>
	{
		{
			"sourceColumn@odata.bind" , "https://graph.microsoft.com/beta/sites/root/columns/99ddcf45-e2f7-4f17-82b0-6fba34445103"
		},
	},
};
var result = await graphClient.Sites["{site-id}"].ContentTypes["{contentType-id}"].Columns.PostAsync(requestBody);


```