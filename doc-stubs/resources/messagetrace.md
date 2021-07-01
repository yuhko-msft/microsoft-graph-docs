---
title: "messageTrace resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# messageTrace resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List messageTraces](../api/messagetrace-list.md)|[messageTrace](../resources/messagetrace.md) collection|Get a list of the [messageTrace](../resources/messagetrace.md) objects and their properties.|
|[Create messageTrace](../api/messagetrace-post-messagetraces.md)|[messageTrace](../resources/messagetrace.md)|Create a new [messageTrace](../resources/messagetrace.md) object.|
|[Get messageTrace](../api/messagetrace-get.md)|[messageTrace](../resources/messagetrace.md)|Read the properties and relationships of a [messageTrace](../resources/messagetrace.md) object.|
|[Update messageTrace](../api/messagetrace-update.md)|[messageTrace](../resources/messagetrace.md)|Update the properties of a [messageTrace](../resources/messagetrace.md) object.|
|[Delete messageTrace](../api/messagetrace-delete.md)|None|Deletes a [messageTrace](../resources/messagetrace.md) object.|
|[List recipients](../api/messagetrace-list-recipients.md)|[messageRecipient](../resources/messagerecipient.md) collection|Get the messageRecipient resources from the recipients navigation property.|
|[Create messageRecipient](../api/messagetrace-post-recipients.md)|[messageRecipient](../resources/messagerecipient.md)|Create a new messageRecipient object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|destinationIPAddress|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|messageId|String|**TODO: Add Description**|
|receivedDateTime|DateTimeOffset|**TODO: Add Description**|
|senderEmail|String|**TODO: Add Description**|
|size|Int32|**TODO: Add Description**|
|sourceIPAddress|String|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|recipients|[messageRecipient](../resources/messagerecipient.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.messageTrace",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.messageTrace",
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

