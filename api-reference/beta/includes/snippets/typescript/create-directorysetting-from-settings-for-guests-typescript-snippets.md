---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new GroupSetting()
requestBody.displayName = "Group.Unified.Guest";
requestBody.templateId = "08d542b9-071f-4e16-94b0-74abb372e3d9";
requestBody.values = [
			new SettingValue();
requestBody.values.additionalData = new Map([
					["name", "AllowToAddGuests"];
					["value", "false"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.groupsById("group-id").settings.post(requestBody);
}


```