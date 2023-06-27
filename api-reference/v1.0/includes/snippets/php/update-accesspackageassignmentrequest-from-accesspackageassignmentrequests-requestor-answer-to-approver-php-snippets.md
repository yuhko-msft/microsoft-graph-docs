---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new AccessPackageAssignmentRequest();
$requestBody->set@odatatype('#microsoft.graph.accessPackageAssignmentRequest');

$requestBody->setId('7a6ab703-0780-4b37-8445-81f679b2d75c');

$requestBody->setRequestType(new AccessPackageRequestType('adminupdate'));

$answersAccessPackageAnswer1 = new AccessPackageAnswerString();
$answersAccessPackageAnswer1->set@odatatype('#microsoft.graph.accessPackageAnswerString');

$answersAccessPackageAnswer1->setValue('UpdatedAnswerValue');

$answersAccessPackageAnswer1AnsweredQuestion = new AccessPackageMultipleChoiceQuestion();
$answersAccessPackageAnswer1AnsweredQuestion->set@odatatype('#microsoft.graph.accessPackageMultipleChoiceQuestion');

$answersAccessPackageAnswer1AnsweredQuestion->setId('8fe745e7-80b2-490d-bd22-4e708c77288c');


$answersAccessPackageAnswer1->setAnsweredQuestion($answersAccessPackageAnswer1AnsweredQuestion);

$answersArray []= $answersAccessPackageAnswer1;
$answersAccessPackageAnswer2 = new AccessPackageAnswerString();
$answersAccessPackageAnswer2->set@odatatype('#microsoft.graph.accessPackageAnswerString');

$answersAccessPackageAnswer2->setValue('My updated answer.');

$answersAccessPackageAnswer2->setDisplayValue('This is my updated answer to the question.');

$answersAccessPackageAnswer2AnsweredQuestion = new AccessPackageTextInputQuestion();
$answersAccessPackageAnswer2AnsweredQuestion->set@odatatype('#microsoft.graph.accessPackageTextInputQuestion');

$answersAccessPackageAnswer2AnsweredQuestion->setId('7aaa18c9-8e4f-440f-bd5a-3a7ce312cbe6');


$answersAccessPackageAnswer2->setAnsweredQuestion($answersAccessPackageAnswer2AnsweredQuestion);

$answersArray []= $answersAccessPackageAnswer2;
$requestBody->setAnswers($answersArray);


$assignment = new AccessPackageAssignment();
$assignment->setId('44c741c1-2cf4-40db-83b6-e0112f8e5a83');


$requestBody->setAssignment($assignment);


$result = $graphServiceClient->identityGovernance()->entitlementManagement()->assignmentRequests()->post($requestBody);


```