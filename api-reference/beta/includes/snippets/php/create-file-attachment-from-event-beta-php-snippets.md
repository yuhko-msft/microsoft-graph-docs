---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new FileAttachment();
$requestBody->set@odatatype('#microsoft.graph.fileAttachment');

$requestBody->setName('menu.txt');

$requestBody->setContentBytes(base64_decode('bWFjIGFuZCBjaGVlc2UgdG9kYXk='));



$result = $graphServiceClient->me()->events()->byEventId('event-id')->attachments()->post($requestBody);


```