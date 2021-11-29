---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new GroupSetting()
requestBody.values = [
			new SettingValue();
requestBody.values.additionalData = new Map([
					["name", "AllowToAddGuests"];
					["value", "true"];
				]);
		]
	],
async () => {
	await graphServiceClient.groupsById("group-id").settingsById("groupSetting-id").patch(requestBody);
}


```