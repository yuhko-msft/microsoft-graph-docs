---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new SkillProficiency()
requestBody.categories = [
			"Professional";
		]
	],
requestBody.allowedAudiences = "organization";
requestBody.displayName = "API Design";
requestBody.proficiency = "generalProfessional";
requestBody.collaborationTags = [
			"ableToMentor";
		]
	],
const result = async () => {
	await graphServiceClient.me.profile.skills.post(requestBody);
}


```