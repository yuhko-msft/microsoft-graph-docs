---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new DirectorySetting()
const settingvalue = new SettingValue();
settingvalue.additionalData = new Map<string, unknown>([
					["name", "CustomBlockedWordsList"],
					["value", "Contoso"]
				]);
requestBody.values = [
			settingvalue
		]
async () => {
	await graphServiceClient.settingsById("directorySetting-id").patch(requestBody);
}


```