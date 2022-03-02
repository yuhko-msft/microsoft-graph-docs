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
					["value", "true"]
				]);
requestBody.values = [
			settingvalue
		]
async () => {
	await graphServiceClient.groupsById("group-id").settingsById("groupSetting-id").patch(requestBody);
}


```