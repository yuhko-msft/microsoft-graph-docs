---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new GroupSetting()
const settingvalue = new SettingValue();
settingvalue.additionalData = new Map<string, unknown>([
					["name", "AllowToAddGuests"],
					["value", "false"]
				]);
requestBody.values = [
			settingvalue
		]
async () => {
	await graphServiceClient.groupSettingsById("groupSetting-id").patch(requestBody);
}


```