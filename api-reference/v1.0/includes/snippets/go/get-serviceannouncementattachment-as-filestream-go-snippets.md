---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-sdk-go"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)



graphClient.Admin().ServiceAnnouncement().Messages().ByMessageId("serviceUpdateMessage-id").Attachments().ByAttachmentId("serviceAnnouncementAttachment-id").Content().Get(context.Background(), nil)


```