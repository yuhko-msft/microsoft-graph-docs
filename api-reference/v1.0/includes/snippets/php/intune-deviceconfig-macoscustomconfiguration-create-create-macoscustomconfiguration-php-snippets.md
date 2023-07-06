---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new MacOSCustomConfiguration();
$requestBody->set@odatatype('#microsoft.graph.macOSCustomConfiguration');

$requestBody->setDescription('Description value');

$requestBody->setDisplayName('Display Name value');

$requestBody->setVersion(7);

$requestBody->setPayloadName('Payload Name value');

$requestBody->setPayloadFileName('Payload File Name value');

$requestBody->setPayload(base64_decode('cGF5bG9hZA=='));



$result = $graphServiceClient->deviceManagement()->deviceConfigurations()->post($requestBody);


```