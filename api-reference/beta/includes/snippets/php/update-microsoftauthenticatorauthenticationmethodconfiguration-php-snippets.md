---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new MicrosoftAuthenticatorAuthenticationMethodConfiguration();
$requestBody->set@odatatype('#microsoft.graph.microsoftAuthenticatorAuthenticationMethodConfiguration');

$requestBody->setState(new AuthenticationMethodState('enabled'));



$result = $graphServiceClient->policies()->authenticationMethodsPolicy()->authenticationMethodConfigurations()->byAuthenticationMethodConfigurationId('authenticationMethodConfiguration-id')->patch($requestBody);


```