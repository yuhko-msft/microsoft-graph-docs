---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new CreateLinkPostRequestBody();
$requestBody->setType('view');

$requestBody->setPassword('ThisIsMyPrivatePassword');

$requestBody->setScope('anonymous');

$requestBody->setRetainInheritedPermissions(false);



$result = $graphServiceClient->drives()->byDriveId('drive-id')->items()->byItemId('driveItem-id')->createLink()->post($requestBody);


```