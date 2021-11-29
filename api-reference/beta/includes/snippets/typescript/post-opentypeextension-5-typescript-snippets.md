---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Conversation()
requestBody.topic = "Does anyone have a second?";
requestBody.threads = [
			new ConversationThread();
requestBody.threads.additionalData = new Map([
					["Posts", [
									 ["contentType" , "HTML"],
									 ["content" , "This is urgent!"],
								 ["extensions" , [
											 ["@odata.type" , "microsoft.graph.openTypeExtension"],
											 ["extensionName" , "Com.Contoso.Benefits"],
											 ["companyName" , "Contoso"],
											 ["expirationDate" , "2016-08-03T11:00:00.000Z"],
											 ["topPicks" , [
													"Employees only";
													"Add spouse or guest";
													"Add family";
												]
											],
									]
								],
						]
					],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.groupsById("group-id").conversations.post(requestBody);
}


```