---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new EducationAssignment();
$requestBody->setDueDateTime(new DateTime('2022-09-16T00:00:00Z'));

$requestBody->setDisplayName('Reading test 09.14 Beta');

$instructions = new EducationItemBody();
$instructions->setContentType(new BodyType('text'));

$instructions->setContent('Read chapter 4');


$requestBody->setInstructions($instructions);
$grading = new EducationAssignmentPointsGradeType();
$grading->set@odatatype('#microsoft.graph.educationAssignmentPointsGradeType');

$grading->setMaxPoints(50);


$requestBody->setGrading($grading);
$assignTo = new EducationAssignmentClassRecipient();
$assignTo->set@odatatype('#microsoft.graph.educationAssignmentClassRecipient');


$requestBody->setAssignTo($assignTo);
$requestBody->setStatus(new EducationAssignmentStatus('draft'));

$requestBody->setAllowStudentsToAddResourcesToSubmission(true);



$result = $graphServiceClient->education()->classes()->byClasseId('educationClass-id')->assignments()->post($requestBody);


```