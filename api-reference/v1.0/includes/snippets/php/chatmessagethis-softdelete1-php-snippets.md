---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);


$graphServiceClient->users()->byUserId('user-id')->chats()->byChatId('chat-id')->messages()->byMessageId('chatMessage-id')->softDelete()->post();


```