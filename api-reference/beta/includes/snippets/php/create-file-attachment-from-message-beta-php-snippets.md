---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new FileAttachment();
$requestBody->set@odatatype('#microsoft.graph.fileAttachment');

$requestBody->setName('smile');

$requestBody->setContentBytes(base64_decode('a0b1c76de9f7='));



$result = $graphServiceClient->me()->messages()->byMessageId('message-id')->attachments()->post($requestBody);


```