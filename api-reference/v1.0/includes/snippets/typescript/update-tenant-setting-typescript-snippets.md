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
					["value", "false"];
				]);
		]
	],
async () => {
	await graphServiceClient.groupSettingsById("groupSetting-id").patch(requestBody);
}


```