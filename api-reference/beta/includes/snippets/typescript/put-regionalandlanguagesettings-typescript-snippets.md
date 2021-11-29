---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new ()
requestBody.additionalData = new Map([
			 ["locale" , "en-US"],
		["authoringLanguages", [
					 ["locale" , "fr-FR"],
					 ["locale" , "de-DE"],
			]
		],
			 ["locale" , "en-US"],
			 ["locale" , "en-US"],
			 ["locale" , "en-GB"],
			 ["calendar" , "Gregorian Calendar"],
			 ["firstDayOfWeek" , "Sunday"],
			 ["shortDateFormat" , "yyyy-MM-dd"],
			 ["longDateFormat" , "dddd, MMMM d, yyyy"],
			 ["shortTimeFormat" , "HH:mm"],
			 ["longTimeFormat" , "h:mm:ss tt"],
			 ["timeZone" , "Pacific Standard Time"],
			 ["translationBehavior" , "Yes"],
			 ["languageOverrides" , [
						 ["languageTag" , "fr"],
						 ["translationBehavior" , "Yes"],
				]
			],
	]);
async () => {
	await graphServiceClient.me.settings.regionalAndLanguageSettings.put(requestBody);
}


```