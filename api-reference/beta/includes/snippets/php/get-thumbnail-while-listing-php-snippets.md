---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestConfiguration = new ChildrenRequestBuilderGetRequestConfiguration();
$queryParameters = ChildrenRequestBuilderGetRequestConfiguration::createQueryParameters();
$queryParameters->expand = ["thumbnails"];
$requestConfiguration->queryParameters = $queryParameters;


$result = $graphServiceClient->drives()->byDriveId('drive-id')->items()->byItemId('driveItem-id')->children()->get($requestConfiguration);


```