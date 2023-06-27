---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new ApplyPostRequestBody();
$criteria = new WorkbookFilterCriteria();
$criteria->setCriterion1('criterion1-value');

$criteria->setCriterion2('criterion2-value');

$criteria->setColor('color-value');

$criteriaOperator = new Operator();

$criteria->setOperator($criteriaOperator);
$criteriaIcon = new WorkbookIcon();
$criteriaIcon->setSet('set-value');

$criteriaIcon->setIndex(99);


$criteria->setIcon($criteriaIcon);
$criteria->setDynamicCriteria('dynamicCriteria-value');

$criteriaValues = new Json();

$criteria->setValues($criteriaValues);
$criteria->setFilterOn('filterOn-value');


$requestBody->setCriteria($criteria);


$graphServiceClient->drives()->byDriveId('drive-id')->items()->byItemId('driveItem-id')->workbook()->tables()->byTableId('workbookTable-id')->columns()->byColumnId('workbookTableColumn-id')->filter()->apply()->post($requestBody);


```