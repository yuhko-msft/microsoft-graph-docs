---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new IosLobApp();
$requestBody->set@odatatype('#microsoft.graph.iosLobApp');

$requestBody->setDisplayName('Display Name value');

$requestBody->setDescription('Description value');

$requestBody->setPublisher('Publisher value');

$largeIcon = new MimeContent();
$largeIcon->set@odatatype('microsoft.graph.mimeContent');

$largeIcon->setType('Type value');

$LargeIcon->setValue(base64_decode('dmFsdWU='));


$requestBody->setLargeIcon($largeIcon);
$requestBody->setIsFeatured(true);

$requestBody->setPrivacyInformationUrl('https://example.com/privacyInformationUrl/');

$requestBody->setInformationUrl('https://example.com/informationUrl/');

$requestBody->setOwner('Owner value');

$requestBody->setDeveloper('Developer value');

$requestBody->setNotes('Notes value');

$requestBody->setPublishingState(new MobileAppPublishingState('processing'));

$requestBody->setCommittedContentVersion('Committed Content Version value');

$requestBody->setFileName('File Name value');

$requestBody->setSize(4);

$requestBody->setBundleId('Bundle Id value');

$applicableDeviceType = new IosDeviceType();
$applicableDeviceType->set@odatatype('microsoft.graph.iosDeviceType');

$applicableDeviceType->setIPad(true);

$applicableDeviceType->setIPhoneAndIPod(true);


$requestBody->setApplicableDeviceType($applicableDeviceType);
$minimumSupportedOperatingSystem = new IosMinimumOperatingSystem();
$minimumSupportedOperatingSystem->set@odatatype('microsoft.graph.iosMinimumOperatingSystem');

$minimumSupportedOperatingSystem->setV8_0(true);

$minimumSupportedOperatingSystem->setV9_0(true);

$minimumSupportedOperatingSystem->setV10_0(true);

$minimumSupportedOperatingSystem->setV11_0(true);

$minimumSupportedOperatingSystem->setV12_0(true);

$minimumSupportedOperatingSystem->setV13_0(true);

$minimumSupportedOperatingSystem->setV14_0(true);

$minimumSupportedOperatingSystem->setV15_0(true);


$requestBody->setMinimumSupportedOperatingSystem($minimumSupportedOperatingSystem);
$requestBody->setExpirationDateTime(new DateTime('2016-12-31T23:57:57.2481234-08:00'));

$requestBody->setVersionNumber('Version Number value');

$requestBody->setBuildNumber('Build Number value');



$result = $graphServiceClient->deviceAppManagement()->mobileApps()->byMobileAppId('mobileApp-id')->patch($requestBody);


```