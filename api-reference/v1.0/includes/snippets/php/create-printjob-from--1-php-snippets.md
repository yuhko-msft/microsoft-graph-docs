---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new PrintJob();
$configuration = new PrintJobConfiguration();
$configuration->set@odatatype('microsoft.graph.printJobConfiguration');

$configuration->setFeedOrientation(new PrinterFeedOrientation('longedgefirst'));

$pageRangesIntegerRange1 = new IntegerRange();
$pageRangesIntegerRange1->set@odatatype('microsoft.graph.integerRange');

$pageRangesIntegerRange1->setStart(1);

$pageRangesIntegerRange1->setEnd(1);


$pageRangesArray []= $pageRangesIntegerRange1;
$configuration->setPageRanges($pageRangesArray);


$configuration->setQuality(new PrintQuality('medium'));

$configuration->setDpi(600);

$configuration->setOrientation(new PrintOrientation('landscape'));

$configuration->setCopies(1);

$configuration->setDuplexMode(new PrintDuplexMode('onesided'));

$configuration->setColorMode(new PrintColorMode('blackandwhite'));

$configuration->setInputBin('by-pass-tray');

$configuration->setOutputBin('output-tray');

$configuration->setMediaSize('A4');

$configurationMargin = new PrintMargin();
$configurationMargin->setTop(0);

$configurationMargin->setBottom(0);

$configurationMargin->setLeft(0);

$configurationMargin->setRight(0);


$configuration->setMargin($configurationMargin);
$configuration->setMediaType('stationery');

$Configuration->setFinishings(null);

$configuration->setPagesPerSheet(1);

$configuration->setMultipageLayout(new PrintMultipageLayout('clockwisefrombottomleft'));

$configuration->setCollate(false);

$configuration->setScaling(new PrintScaling('shrinktofit'));

$configuration->setFitPdfToPage(false);


$requestBody->setConfiguration($configuration);


$result = $graphServiceClient->print()->printers()->byPrinterId('printer-id')->jobs()->post($requestBody);


```