---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new AbortPostRequestBody();
$requestBody->setReason('String');



$graphServiceClient->print()->printers()->byPrinterId('printer-id')->jobs()->byJobId('printJob-id')->abort()->post($requestBody);


```