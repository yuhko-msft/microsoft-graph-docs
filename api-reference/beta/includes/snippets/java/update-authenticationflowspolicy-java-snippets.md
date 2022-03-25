---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

AuthenticationFlowsPolicy authenticationFlowsPolicy = new AuthenticationFlowsPolicy();
SelfServiceSignUpAuthenticationFlowConfiguration selfServiceSignUp = new SelfServiceSignUpAuthenticationFlowConfiguration();
selfServiceSignUp.isEnabled = true;
authenticationFlowsPolicy.selfServiceSignUp = selfServiceSignUp;

graphClient.policies().authenticationFlowsPolicy()
    .buildRequest()
    .patch(authenticationFlowsPolicy);
```
