---
description: "Automatically generated file. DO NOT MODIFY"
---

```python

// THE PYTHON SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
client =  GraphServiceClient(request_adapter)


request_configuration = ContentRequestBuilder.ContentRequestBuilderGetRequestConfiguration(
headers = {
		'Accept' : "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
}

)


await client.users.by_user_id('user-id').online_meetings.by_online_meeting_id('onlineMeeting-id').transcripts.by_transcript_id('callTranscript-id').content.get(request_configuration = request_configuration)


```