---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

AccessPackageAssignmentRequestCollectionPage assignmentRequests = graphClient.identityGovernance().entitlementManagement().assignmentRequests()
    .buildRequest()
    .get();
```
