---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.post = new Post();
requestBody.post.body = new ItemBody();
requestBody.post.body.contentType = "";
requestBody.post.body.content = "content-value";
requestBody.post.receivedDateTime =  new Date("2016-10-19T10:37:00Z");
requestBody.post.hasAttachments = true;
requestBody.post.from = new Recipient();
requestBody.post.from.emailAddress = new EmailAddress();
requestBody.post.from.emailAddress.name = "name-value";
requestBody.post.from.emailAddress.address = "address-value";
requestBody.post.sender = new Recipient();
requestBody.post.sender.emailAddress = new EmailAddress();
requestBody.post.sender.emailAddress.name = "name-value";
requestBody.post.sender.emailAddress.address = "address-value";
requestBody.post.conversationThreadId = "conversationThreadId-value";
requestBody.post.newParticipants = [
				new Recipient();
requestBody.post.newParticipants.additionalData = new Map([
							 ["name" , "name-value"],
							 ["address" , "address-value"],
					]);
			]
		],
requestBody.post.conversationId = "conversationId-value";
requestBody.post.createdDateTime =  new Date("2016-10-19T10:37:00Z");
requestBody.post.lastModifiedDateTime =  new Date("2016-10-19T10:37:00Z");
requestBody.post.changeKey = "changeKey-value";
requestBody.post.categories = [
				"categories-value";
			]
		],
requestBody.post.id = "id-value";
requestBody.post.inReplyTo = new Post();
requestBody.post.attachments = [
				new Attachment();
requestBody.post.attachments.additionalData = new Map([
						["@odata.type", "#microsoft.graph.fileAttachment"];
						["lastModifiedDateTime", "2016-10-19T10:37:00Z"];
						["name", "name-value"];
						["contentType", "contentType-value"];
						["size", 99];
						["isInline", true];
						["id", "id-value"];
					]);
			]
		],
async () => {
	await graphServiceClient.groupsById("group-id").threadsById("conversationThread-id").postsById("post-id").reply.post(requestBody);
}


```