---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new Set();
$requestBody->setDescription('mySet');



$result = $graphServiceClient->termStore()->sets()->bySetId('set-id')->patch($requestBody);


```