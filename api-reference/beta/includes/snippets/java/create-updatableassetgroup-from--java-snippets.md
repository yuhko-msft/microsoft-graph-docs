---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

UpdatableAssetGroup updatableAsset = new UpdatableAssetGroup();

graphClient.admin().windows().updates().updatableAssets()
    .buildRequest()
    .post(updatableAsset);
```
