---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new ContentApproval();
$requestBody->set@odatatype('#microsoft.graph.windowsUpdates.contentApproval');

$requestBody->setIsRevoked(true);



$result = $graphServiceClient->admin()->windows()->updates()->updatePolicies()->byUpdatePolicieId('updatePolicy-id')->complianceChanges()->byComplianceChangeId('complianceChange-id')->patch($requestBody);


```