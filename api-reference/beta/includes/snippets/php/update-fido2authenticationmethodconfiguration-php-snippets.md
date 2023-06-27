---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new Fido2AuthenticationMethodConfiguration();
$requestBody->set@odatatype('#microsoft.graph.fido2AuthenticationMethodConfiguration');

$requestBody->setState(new AuthenticationMethodState('enabled'));

$requestBody->setIsAttestationEnforced(true);



$result = $graphServiceClient->policies()->authenticationMethodsPolicy()->authenticationMethodConfigurations()->byAuthenticationMethodConfigurationId('authenticationMethodConfiguration-id')->patch($requestBody);


```