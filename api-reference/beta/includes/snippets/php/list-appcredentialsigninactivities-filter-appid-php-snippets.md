---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestConfiguration = new AppCredentialSignInActivitiesRequestBuilderGetRequestConfiguration();
$queryParameters = AppCredentialSignInActivitiesRequestBuilderGetRequestConfiguration::createQueryParameters();
$queryParameters->filter = "appId eq 'f4d9654f-0305-4072-878c-8bf266dfe146'";
$requestConfiguration->queryParameters = $queryParameters;


$result = $graphServiceClient->reports()->appCredentialSignInActivities()->get($requestConfiguration);


```