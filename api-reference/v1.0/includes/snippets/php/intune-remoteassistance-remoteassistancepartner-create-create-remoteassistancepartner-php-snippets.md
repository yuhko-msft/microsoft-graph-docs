---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new RemoteAssistancePartner();
$requestBody->set@odatatype('#microsoft.graph.remoteAssistancePartner');

$requestBody->setDisplayName('Display Name value');

$requestBody->setOnboardingUrl('https://example.com/onboardingUrl/');

$requestBody->setOnboardingStatus(new RemoteAssistanceOnboardingStatus('onboarding'));

$requestBody->setLastConnectionDateTime(new DateTime('2016-12-31T23:58:36.6670033-08:00'));



$result = $graphServiceClient->deviceManagement()->remoteAssistancePartners()->post($requestBody);


```