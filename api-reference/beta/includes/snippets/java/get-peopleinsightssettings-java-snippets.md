---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

InsightsSettings peopleInsightsSettings = graphClient.organization("{organizationId}").settings().peopleInsights()
	.buildRequest()
	.get();

```
