---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new RegionalAndLanguageSettings()
const localeinfo = new LocaleInfo();
localeinfo.additionalData = new Map<string, unknown>([
					["locale", "en-US"]
				]);
const localeinfo1 = new LocaleInfo();
localeinfo1.additionalData = new Map<string, unknown>([
					["locale", "es-MX"]
				]);
requestBody.authoringLanguages = [
			localeinfo,
			localeinfo1
		]
requestBody.defaultRegionalFormat = new LocaleInfo();
requestBody.defaultRegionalFormat.locale = "en-US";
async () => {
	await graphServiceClient.me.settings.regionalAndLanguageSettings.patch(requestBody);
}


```