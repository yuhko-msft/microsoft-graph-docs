---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new DeviceManagement();
$requestBody->set@odatatype('#microsoft.graph.deviceManagement');

$intuneBrand = new IntuneBrand();
$intuneBrand->set@odatatype('microsoft.graph.intuneBrand');

$intuneBrand->setDisplayName('Display Name value');

$intuneBrandThemeColor = new RgbColor();
$intuneBrandThemeColor->set@odatatype('microsoft.graph.rgbColor');

$intuneBrandThemeColor->setR(1);

$intuneBrandThemeColor->setG(1);

$intuneBrandThemeColor->setB(1);


$intuneBrand->setThemeColor($intuneBrandThemeColor);
$intuneBrand->setShowLogo(true);

$intuneBrandLightBackgroundLogo = new MimeContent();
$intuneBrandLightBackgroundLogo->set@odatatype('microsoft.graph.mimeContent');

$intuneBrandLightBackgroundLogo->setType('Type value');

$IntuneBrandLightBackgroundLogo->setValue(base64_decode('dmFsdWU='));


$intuneBrand->setLightBackgroundLogo($intuneBrandLightBackgroundLogo);
$intuneBrandDarkBackgroundLogo = new MimeContent();
$intuneBrandDarkBackgroundLogo->set@odatatype('microsoft.graph.mimeContent');

$intuneBrandDarkBackgroundLogo->setType('Type value');

$IntuneBrandDarkBackgroundLogo->setValue(base64_decode('dmFsdWU='));


$intuneBrand->setDarkBackgroundLogo($intuneBrandDarkBackgroundLogo);
$intuneBrand->setShowNameNextToLogo(true);

$intuneBrand->setShowDisplayNameNextToLogo(true);

$intuneBrand->setContactITName('Contact ITName value');

$intuneBrand->setContactITPhoneNumber('Contact ITPhone Number value');

$intuneBrand->setContactITEmailAddress('Contact ITEmail Address value');

$intuneBrand->setContactITNotes('Contact ITNotes value');

$intuneBrand->setOnlineSupportSiteUrl('https://example.com/onlineSupportSiteUrl/');

$intuneBrand->setOnlineSupportSiteName('Online Support Site Name value');

$intuneBrand->setPrivacyUrl('https://example.com/privacyUrl/');


$requestBody->setIntuneBrand($intuneBrand);


$result = $graphServiceClient->deviceManagement()->patch($requestBody);


```