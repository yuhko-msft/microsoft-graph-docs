---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.topic = new TeamworkActivityTopic();
requestBody.topic.source = "text";
requestBody.topic.value = "Deployment Approvals Channel";
requestBody.topic.webUrl = "https://teams.microsoft.com/l/message/19:448cfd2ac2a7490a9084a9ed14cttr78c@thread.skype/1605223780000?tenantId=c8b1bf45-3834-4ecf-971a-b4c755ee677d&groupId=d4c2a937-f097-435a-bc91-5c1683ca7245&parentMessageId=1605223771864&teamName=Approvals&channelName=Azure%20DevOps&createdTime=1605223780000";
requestBody.activityType = "deploymentApprovalRequired";
requestBody.previewText = new ItemBody();
requestBody.previewText.content = "New deployment requires your approval";
const keyvaluepair = new KeyValuePair();
keyvaluepair.additionalData = new Map<string, unknown>([
					["name", "deploymentId"],
					["value", "6788662"]
				]);
requestBody.templateParameters = [
			keyvaluepair
		]
async () => {
	await graphServiceClient.usersById("user-id").teamwork.sendActivityNotification.post(requestBody);
}


```