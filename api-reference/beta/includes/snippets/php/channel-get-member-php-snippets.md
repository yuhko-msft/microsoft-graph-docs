---
description: "Automatically generated file. DO NOT MODIFY"
---

```php

<?php

// THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
$graphServiceClient = new GraphServiceClient($requestAdapter);


$result = $graphServiceClient->teams()->byTeamId('team-id')->channels()->byChannelId('channel-id')->members()->byMemberId('conversationMember-id')->get();


```