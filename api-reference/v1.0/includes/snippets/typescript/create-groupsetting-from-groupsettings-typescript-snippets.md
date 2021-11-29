---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new GroupSetting()
requestBody.displayName = "Group.Unified";
requestBody.templateId = "62375ab9-6b52-47ed-826b-58e47e0e304b";
requestBody.values = [
			new SettingValue();
requestBody.values.additionalData = new Map([
					["name", "GuestUsageGuidelinesUrl"];
					["value", "https://privacy.contoso.com/privacystatement"];
				]);
			new SettingValue();
requestBody.values.additionalData = new Map([
					["name", "EnableMSStandardBlockedWords"];
					["value", "true"];
				]);
			new SettingValue();
requestBody.values.additionalData = new Map([
					["name", "EnableMIPLabels"];
					["value", "true"];
				]);
			new SettingValue();
requestBody.values.additionalData = new Map([
					["name", "PrefixSuffixNamingRequirement"];
					["value", "[Contoso-][GroupName]"];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.groupSettings.post(requestBody);
}


```