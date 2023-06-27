---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new EducationAssignmentResource();
$requestBody->setDistributeForStudentWork(false);

$resource = new EducationMediaResource();
$resource->set@odatatype('microsoft.graph.educationMediaResource');

$resource->setDisplayName('homework example.PNG');

$resource->setFileUrl('https://graph.microsoft.com/v1.0/drives/b!OPmUsPgnBUiMIXMxWcj3neC1xck6I5NIsnFxfrLdmXoOOmEQNO79QpIMPdOmY3nf/items/01QTY63RMUWOKAGSJZ6BHINJVKNMOOJABF');


$requestBody->setResource($resource);


$result = $graphServiceClient->education()->classes()->byClasseId('educationClass-id')->assignments()->byAssignmentId('educationAssignment-id')->resources()->post($requestBody);


```