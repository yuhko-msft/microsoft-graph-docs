---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new DeviceAppManagement();
$requestBody->set@odatatype('#microsoft.graph.deviceAppManagement');



$result = $graphServiceClient->deviceAppManagement()->patch($requestBody);


```