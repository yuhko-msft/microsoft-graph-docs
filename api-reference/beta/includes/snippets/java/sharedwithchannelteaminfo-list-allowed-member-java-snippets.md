---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

ConversationMemberCollectionPage members = graphClient.teams("2ab9c796-2902-45f8-b712-7c5a63cf41c4").channels("19:20bc1df46b1148e9b22539b83bc66809@thread.skype").sharedWithTeams("2ab9c796-5b79-45f8-b712-7c5a63cf41c4").allowedMembers()
	.buildRequest()
	.get();

```