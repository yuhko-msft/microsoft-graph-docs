---
title: "messageTrace resource type"
description: "Represents basic information about a message."
author: "rsuven"
ms.localizationpriority: medium
ms.prod: "security"
ms.date: "09/14/2021"
doc_type: resourcePageType
---

# messageTrace resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents basic information about an email message in Exchange Online.

As a service in [Microsoft Defender for Office 365](/microsoft-365/security/office-365-security/defender-for-office-365?view=o365-worldwide&preserve-view=true), message trace allows administrators to monitor email messages as they flow through their Exchange Online organization. It provides the administrator information to determine if a message was received, rejected, deferred, or delivered by the service. It also shows what actions were taken on the message before it reached its final status.

The information from message trace can be used to efficiently answer user questions about what happened to messages, troubleshoot mail flow issues, and validate policy changes.

Administrators can use various search criteria to search for messages in the past 10 days. The search result contains one or more [messageTrace](../resources/messagetrace.md) objects, each of which include basic information about a message such as:
- Message ID
- Sender
- Recipients
- Subject
- Message received datetime

With a message ID and a recipient, you can use the API to obtain details of all the events associated with the delivery of the message.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get messageTraces](../api/messagetrace-get.md)|[messageTrace](../resources/messagetrace.md) collection|Get a list of the [messageTrace](../resources/messagetrace.md) objects and their properties.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|destinationIPAddress|String|The destination IP address.|
|id|String|Unique ID for the message. The internal message ID.|
|messageId|String|The Message-ID header field of the message.|
|receivedDateTime|DateTimeOffset|Message receive datetime in UTC.|
|senderEmail|String|Sender email address.|
|size|Int32|Message length.|
|sourceIPAddress|String|The source IP address.|
|subject|String|Message subject.|


## Relationships
|Property|Type|Description|
|:---|:---|:---|
|recipients|[messageRecipient](../resources/messagerecipient.md) collection|Message recipients.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.messageTrace"
}
-->
``` json
{
  "id": "String (identifier)",
  "senderEmail": "String",
  "receivedDateTime": "String (timestamp)",
  "messageId": "String",
  "subject": "String",
  "size": "Integer",
  "sourceIPAddress": "String",
  "destinationIPAddress": "String"
}
```
