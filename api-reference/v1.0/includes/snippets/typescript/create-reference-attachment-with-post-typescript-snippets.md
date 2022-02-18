---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.post = new Post();
requestBody.post.body = new ItemBody();
requestBody.post.body.contentType = "text";
requestBody.post.body.content = "I attached a reference to a file on OneDrive.";
requestBody.post.attachments = [
				new Attachment();
requestBody.post.attachments.additionalData = new Map([
						["@odata.type", "#microsoft.graph.referenceAttachment"];
						["name", "Personal pictures"];
						["sourceUrl", "https://contoso.com/personal/mario_contoso_net/Documents/Pics"];
						["providerType", "oneDriveConsumer"];
						["permission", "Edit"];
						["isFolder", "True"];
					]);
			]
		],
async () => {
	await graphServiceClient.groupsById("group-id").threadsById("conversationThread-id").reply.post(requestBody);
}


```