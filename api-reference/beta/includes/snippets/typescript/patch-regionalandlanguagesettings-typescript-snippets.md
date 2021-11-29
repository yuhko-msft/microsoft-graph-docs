---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new RegionalAndLanguageSettings()
requestBody.authoringLanguages = [
			new LocaleInfo();
requestBody.authoringLanguages.additionalData = new Map([
					["locale", "en-US"];
				]);
			new LocaleInfo();
requestBody.authoringLanguages.additionalData = new Map([
					["locale", "es-MX"];
				]);
		]
	],
requestBody.defaultRegionalFormat = new LocaleInfo();
requestBody.defaultRegionalFormat.locale = "en-US";
async () => {
	await graphServiceClient.me.settings.regionalAndLanguageSettings.patch(requestBody);
}


```