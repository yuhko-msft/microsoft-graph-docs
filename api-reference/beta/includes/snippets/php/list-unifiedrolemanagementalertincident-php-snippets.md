---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestConfiguration = new AlertIncidentsRequestBuilderGetRequestConfiguration();
$queryParameters = AlertIncidentsRequestBuilderGetRequestConfiguration::createQueryParameters();
$queryParameters->top = 5;
$requestConfiguration->queryParameters = $queryParameters;


$result = $graphServiceClient->identityGovernance()->roleManagementAlerts()->alerts()->byAlertId('unifiedRoleManagementAlert-id')->alertIncidents()->get($requestConfiguration);


```