---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new ReviewSetQuery();
$requestBody->setDisplayName('My Query 1 - Renamed');



$result = $graphServiceClient->compliance()->ediscovery()->cases()->byCaseId('case-id')->reviewSets()->byReviewSetId('reviewSet-id')->queries()->byQuerieId('reviewSetQuery-id')->patch($requestBody);


```