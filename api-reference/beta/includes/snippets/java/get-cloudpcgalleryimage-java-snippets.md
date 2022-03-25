---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

CloudPcGalleryImage cloudPcGalleryImage = graphClient.deviceManagement().virtualEndpoint().galleryImages("{id}")
    .buildRequest()
    .get();
```
