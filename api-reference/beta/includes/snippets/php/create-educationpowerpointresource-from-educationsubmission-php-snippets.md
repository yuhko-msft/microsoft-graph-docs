---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new EducationSubmissionResource();
$resource = new EducationPowerPointResource();
$resource->set@odatatype('#microsoft.graph.educationPowerPointResource');

$resource->setDisplayName('state diagram.pptx');

$resource->setFileUrl('https://graph.microsoft.com/beta/drives/b!OPmUsPgnBUiMIXMxWcj3neC1xck6I5NIsnFxfrLdmXodJYOAkI7rTLhw7ME_e42J/items/01QTY63RN3MHWWM7BNXJD2UD5OMRFEDKN2');


$requestBody->setResource($resource);


$result = $graphServiceClient->education()->classes()->byClasseId('educationClass-id')->assignments()->byAssignmentId('educationAssignment-id')->submissions()->bySubmissionId('educationSubmission-id')->resources()->post($requestBody);


```