---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new DirectorySetting()
requestBody.values = [
			new SettingValue();
requestBody.values.additionalData = new Map([
					["name", "name-value"];
					["value", "value-value"];
				]);
		]
	],
async () => {
	await graphServiceClient.settingsById("directorySetting-id").patch(requestBody);
}


```