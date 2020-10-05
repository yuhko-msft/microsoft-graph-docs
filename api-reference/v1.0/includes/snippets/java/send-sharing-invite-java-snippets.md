---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

LinkedList<DriveRecipient> recipientsList = new LinkedList<DriveRecipient>();
DriveRecipient recipients = new DriveRecipient();
recipients.email = "ryan@contoso.com";

recipientsList.add(recipients);

String message = "Here's the file that we're collaborating on.";

boolean requireSignIn = true;

boolean sendInvitation = true;

LinkedList<String> rolesList = new LinkedList<String>();
rolesList.add("write");

String password = "password123";

int expirationDateTime = 15/07/2018 14:00:00;

graphClient.me().drive().items("{item-id}")
	.invite(requireSignIn,rolesList,sendInvitation,message,recipientsList,expirationDateTime,password)
	.buildRequest()
	.post();

```