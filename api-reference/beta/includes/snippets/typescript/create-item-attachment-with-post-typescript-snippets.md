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
requestBody.post.body.content = "I attached an event.";
requestBody.post.attachments = [
				new Attachment();
requestBody.post.attachments.additionalData = new Map([
						["@odata.type", "#microsoft.graph.itemAttachment"];
						["name", "Holiday event"];
							 ["@odata.type" , "microsoft.graph.event"],
							 ["subject" , "Discuss gifts for children"],
								 ["contentType" , "HTML"],
								 ["content" , "Let's look for funding!"],
								 ["dateTime" , "2019-12-02T18:00:00"],
								 ["timeZone" , "Pacific Standard Time"],
								 ["dateTime" , "2019-12-02T19:00:00"],
								 ["timeZone" , "Pacific Standard Time"],
					]);
			]
		],
async () => {
	await graphServiceClient.groupsById("group-id").threadsById("conversationThread-id").reply.post(requestBody);
}


```