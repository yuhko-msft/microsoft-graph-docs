---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new AnswerPostRequestBody();
$requestBody->setCallbackUri('https://bot.contoso.com/api/calls');

$requestBody->setAcceptedModalities([$requestBody->setModality(new Modality('audio'));
]);

$mediaConfig = new AppHostedMediaConfig();
$mediaConfig->set@odatatype('#microsoft.graph.appHostedMediaConfig');

$mediaConfig->setBlob('<Media Session Configuration Blob>');


$requestBody->setMediaConfig($mediaConfig);


$graphServiceClient->communications()->calls()->byCallId('call-id')->answer()->post($requestBody);


```