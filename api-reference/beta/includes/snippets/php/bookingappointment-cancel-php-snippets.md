---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new CancelPostRequestBody();
$requestBody->setCancellationMessage('Your appointment has been successfully cancelled. Please call us again.');



$graphServiceClient->bookingBusinesses()->byBookingBusinesseId('bookingBusiness-id')->appointments()->byAppointmentId('bookingAppointment-id')->cancel()->post($requestBody);


```