---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new ResourceOperation();
$requestBody->set@odatatype('#microsoft.graph.resourceOperation');

$requestBody->setResourceName('Resource Name value');

$requestBody->setActionName('Action Name value');

$requestBody->setDescription('Description value');



$result = $graphServiceClient->deviceManagement()->resourceOperations()->post($requestBody);


```