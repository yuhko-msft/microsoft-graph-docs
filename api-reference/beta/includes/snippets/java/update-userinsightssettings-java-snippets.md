---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

UserInsightsSettings userInsightsSettings = new UserInsightsSettings();
userInsightsSettings.isEnabled = false;

graphClient.users("{userId}").settings().itemInsights()
    .buildRequest()
    .patch(userInsightsSettings);
```
