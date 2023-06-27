---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestConfiguration = new ThumbnailsRequestBuilderGetRequestConfiguration();
$queryParameters = ThumbnailsRequestBuilderGetRequestConfiguration::createQueryParameters();
$queryParameters->select = ["c300x400_crop"];
$requestConfiguration->queryParameters = $queryParameters;


$result = $graphServiceClient->drives()->byDriveId('drive-id')->items()->byItemId('driveItem-id')->thumbnails()->get($requestConfiguration);


```