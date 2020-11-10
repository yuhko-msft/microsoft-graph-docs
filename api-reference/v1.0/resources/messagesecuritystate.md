---
title: "messageSecurityState resource type"
description: "Represents the message security state for the alerts."
localization_priority: Normal
author: "fengzhums"
ms.prod: "security"
doc_type: resourcePageType
---

# messageSecurityState resource type

Namespace: microsoft.graph

Represents the message security state for the alerts.

How to use these values -  one can use these to query the email property of Microsoft Graph to get further details of the message  - https://docs.microsoft.com/graph/api/resources/message?view=graph-rest-1.0


## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|connectingIP|String| The IP address that submitted the email. The IP address is displayed in either an IPv4 or IPv6 address format.|
|directionality|String|The origination status of the email message.|
|deliveryAction|String| Identifies the action taken on an email due to existing policies or detections.|
|deliveryLocation|String| Shows the results of policies and detections that run post-delivery.|
|internetMessageId|String| The message ID in the format specified by RFC2822. See document at https://docs.microsoft.com/graph/api/resources/message?view=graph-rest-1.0 |
|messageRecievedDateTime|DateTimeOffset| The date and time the message was received. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.|
|messageSubject|String| The subject line of the message.|
|messageFingerprint|String| Identifies a commonly used message components across different messages to uniquely identify specific message patterns.|
|networkMessageId|String| A string of GUID that represents the Network message ID. See document at https://docs.microsoft.com/microsoft-365/security/office-365-security/admin-submission?view=o365-worldwide|


## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.messageSecurityState",
  "baseType": null
}-->

```json
{
  "connectingIP": "String",
  "directionality": "String",
  "deliveryAction": "String",
  "deliveryLocation": "String",
  "internetMessageId": "String",
  "messageRecievedDateTime": "DateTimeOffset",
  "messageSubject": "String",
  "messageFingerprint": "String",
  "networkMessageId": "String"
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "messageSecurityState resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->

