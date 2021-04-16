---
title: "notification resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# notification resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List notifications](../api/notification-list.md)|[notification](../resources/notification.md) collection|Get a list of the [notification](../resources/notification.md) objects and their properties.|
|[Create notification](../api/notification-create.md)|[notification](../resources/notification.md)|Create a new [notification](../resources/notification.md) object.|
|[Get notification](../api/notification-get.md)|[notification](../resources/notification.md)|Read the properties and relationships of a [notification](../resources/notification.md) object.|
|[Update notification](../api/notification-update.md)|[notification](../resources/notification.md)|Update the properties of a [notification](../resources/notification.md) object.|
|[Delete notification](../api/notification-delete.md)|None|Deletes a [notification](../resources/notification.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayTimeToLive|Int32|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|groupName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|payload|[payloadTypes](../resources/payloadtypes.md)|**TODO: Add Description**|
|priority|priority|**TODO: Add Description**. Possible values are: `None`, `High`, `Low`.|
|targetHostName|String|**TODO: Add Description**|
|targetPolicy|[targetPolicyEndpoints](../resources/targetpolicyendpoints.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.notification",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.notification",
  "id": "String (identifier)",
  "displayTimeToLive": "Integer",
  "expirationDateTime": "String (timestamp)",
  "groupName": "String",
  "payload": {
    "@odata.type": "microsoft.graph.payloadTypes"
  },
  "priority": "String",
  "targetHostName": "String",
  "targetPolicy": {
    "@odata.type": "microsoft.graph.targetPolicyEndpoints"
  }
}
```

