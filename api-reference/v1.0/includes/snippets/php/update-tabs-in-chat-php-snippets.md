---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);

$requestBody = new TeamsTab();
$requestBody->setDisplayName('My Contoso Tab - updated again');



$result = $graphServiceClient->chats()->byChatId('chat-id')->tabs()->byTabId('teamsTab-id')->patch($requestBody);


```