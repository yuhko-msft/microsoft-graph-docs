---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new SocialIdentityProvider();
$requestBody->set@odatatype('#microsoft.graph.socialIdentityProvider');

$additionalData = [
		'responseType' => 'id_token', 
];
$requestBody->setAdditionalData($additionalData);




$result = $graphServiceClient->identity()->identityProviders()->byIdentityProviderId('identityProviderBase-id')->patch($requestBody);


```