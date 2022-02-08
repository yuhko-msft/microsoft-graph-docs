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
requestBody.post.body.content = "Which quarter does that file cover? See my attachment.";
requestBody.post.attachments = [
				new Attachment();
requestBody.post.attachments.additionalData = new Map([
						["@odata.type", "#microsoft.graph.fileAttachment"];
						["name", "Another file as attachment"];
						["contentBytes", "VGhpcyBpcyBhIGZpbGUgdG8gYmUgYXR0YWNoZWQu"];
					]);
			]
		],
async () => {
	await graphServiceClient.groupsById("group-id").threadsById("conversationThread-id").reply.post(requestBody);
}


```