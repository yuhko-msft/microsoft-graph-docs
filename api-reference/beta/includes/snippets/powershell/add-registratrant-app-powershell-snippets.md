---
description: "Automatically generated file. DO NOT MODIFY"
---

```powershell

Import-Module Microsoft.Graph.CloudCommunications

$params = @{
	"@odata.type" = "#microsoft.graph.meetingRegistrant"
	FirstName = "Lisa"
	LastName = "Adkins"
	Email = "lisa.adkins@contoso.com"
	CustomQuestionAnswers = @(
		@{
			QuestionId = "MSM5YjlmM2Q4ZS03ZmVkLTRmN3gwMDIw94MDAyMF9hX3gwMDIwX2RldmU="
			Value = "No"
		}
		@{
			QuestionId = "MSM5M2E2OWQ1Ni1jZTc4LTQDAwMjBfZGlkX3gwMDIwX3lvdV94MDAyMF8="
			Value = "Internet"
		}
	)
}

New-MgUserOnlineMeetingRegistrationRegistrant -UserId $userId -OnlineMeetingId $onlineMeetingId -BodyParameter $params

```