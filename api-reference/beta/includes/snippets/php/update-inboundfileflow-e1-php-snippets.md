---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new InboundFileFlow();
$requestBody->set@odatatype('#microsoft.graph.industryData.inboundFileFlow');

$requestBody->setDisplayName('Updated flow name');



$result = $graphServiceClient->external()->industryData()->inboundFlows()->byInboundFlowId('inboundFlow-id')->patch($requestBody);


```