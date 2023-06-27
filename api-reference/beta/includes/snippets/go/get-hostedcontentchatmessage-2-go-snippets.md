---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



graphClient.Chats().ByChatId("chat-id").Messages().ByMessageId("chatMessage-id").HostedContents().ByHostedContentId("chatMessageHostedContent-id").Value().Get(context.Background(), nil)


```