---
title: "notificationRecipient resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# notificationRecipient resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|isRiskyUsersAlertsRecipient|Boolean|**TODO: Add Description**|
|isWeeklyDigestRecipient|Boolean|**TODO: Add Description**|
|roles|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.notificationRecipient"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.notificationRecipient",
  "id": "String (identifier)",
  "displayName": "String",
  "roles": [
    "String"
  ],
  "email": "String",
  "isWeeklyDigestRecipient": "Boolean",
  "isRiskyUsersAlertsRecipient": "Boolean"
}
```

