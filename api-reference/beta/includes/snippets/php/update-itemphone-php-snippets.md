---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new ItemPhone();
$requestBody->setType(new PhoneType('other'));



$result = $graphServiceClient->users()->byUserId('user-id')->profile()->phones()->byPhoneId('itemPhone-id')->patch($requestBody);


```