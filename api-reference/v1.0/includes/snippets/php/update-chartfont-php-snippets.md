---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new WorkbookChartFont();
$requestBody->setBold(true);

$requestBody->setColor('color-value');

$requestBody->setItalic(true);

$requestBody->setName('name-value');

$requestBody->setSize(99);

$requestBody->setUnderline('underline-value');



$result = $graphServiceClient->drives()->byDriveId('drive-id')->items()->byItemId('driveItem-id')->workbook()->worksheets()->byWorksheetId('workbookWorksheet-id')->charts()->byChartId('workbookChart-id')->axes()->valueAxis()->format()->font()->patch($requestBody);


```