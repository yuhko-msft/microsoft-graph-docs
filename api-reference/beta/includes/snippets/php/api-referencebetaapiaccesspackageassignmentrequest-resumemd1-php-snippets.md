---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new ResumePostRequestBody();
$requestBody->setSource('Contoso.SodCheckProcess');

$requestBody->setType('microsoft.graph.accessPackageCustomExtensionStage.assignmentRequestCreated');

$data = new AccessPackageAssignmentRequestCallbackData();
$data->set@odatatype('microsoft.graph.accessPackageAssignmentRequestCallbackData');

$data->setStage(new AccessPackageCustomExtensionStage('assignmentrequestcreated'));

$data->setCustomExtensionStageInstanceId('857d0c50-466b-4840-bb5b-c92cea7141ff');

$data->setState('denied');

$data->setCustomExtensionStageInstanceDetail('Potential risk user based on the SOD check');


$requestBody->setData($data);


$graphServiceClient->identityGovernance()->entitlementManagement()->accessPackageAssignmentRequests()->byAccessPackageAssignmentRequestId('accessPackageAssignmentRequest-id')->resume()->post($requestBody);


```