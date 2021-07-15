---
title: "localizedNotificationMessage resource type"
description: "The text content of a Notification Message Template for the specified locale."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# localizedNotificationMessage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The text content of a Notification Message Template for the specified locale.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List localizedNotificationMessages](../api/localizednotificationmessage-list.md)|[localizedNotificationMessage](../resources/localizednotificationmessage.md) collection|Get a list of the [localizedNotificationMessage](../resources/localizednotificationmessage.md) objects and their properties.|
|[Create localizedNotificationMessage](../api/localizednotificationmessage-create.md)|[localizedNotificationMessage](../resources/localizednotificationmessage.md)|Create a new [localizedNotificationMessage](../resources/localizednotificationmessage.md) object.|
|[Get localizedNotificationMessage](../api/localizednotificationmessage-get.md)|[localizedNotificationMessage](../resources/localizednotificationmessage.md)|Read the properties and relationships of a [localizedNotificationMessage](../resources/localizednotificationmessage.md) object.|
|[Update localizedNotificationMessage](../api/localizednotificationmessage-update.md)|[localizedNotificationMessage](../resources/localizednotificationmessage.md)|Update the properties of a [localizedNotificationMessage](../resources/localizednotificationmessage.md) object.|
|[Delete localizedNotificationMessage](../api/localizednotificationmessage-delete.md)|None|Deletes a [localizedNotificationMessage](../resources/localizednotificationmessage.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isDefault|Boolean|Flag to indicate whether or not this is the default locale for language fallback. This flag can only be set. To unset, set this property to true on another Localized Notification Message.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|locale|String|The Locale for which this message is destined.|
|messageTemplate|String|The Message Template content.|
|subject|String|The Message Template Subject.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.localizedNotificationMessage",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.localizedNotificationMessage",
  "id": "String (identifier)",
  "isDefault": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "locale": "String",
  "messageTemplate": "String",
  "subject": "String"
}
```

