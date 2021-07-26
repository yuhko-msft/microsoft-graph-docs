---
description: "Automatically generated file. DO NOT MODIFY"
---

```javascript

const options = {
	authProvider,
};

const client = Client.init(options);

let peopleInsightsSettings = await client.api('/organization/{organizationId}/settings/peopleInsights')
	.version('beta')
	.get();

```
