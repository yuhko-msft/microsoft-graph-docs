---
title: "notificationSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# notificationSettings resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List notificationSettings](../api/notificationsettings-list.md)|[notificationSettings](../resources/notificationsettings.md) collection|Get a list of the [notificationSettings](../resources/notificationsettings.md) objects and their properties.|
|[Create notificationSettings](../api/notificationsettings-create.md)|[notificationSettings](../resources/notificationsettings.md)|Create a new [notificationSettings](../resources/notificationsettings.md) object.|
|[Get notificationSettings](../api/notificationsettings-get.md)|[notificationSettings](../resources/notificationsettings.md)|Read the properties and relationships of a [notificationSettings](../resources/notificationsettings.md) object.|
|[Update notificationSettings](../api/notificationsettings-update.md)|[notificationSettings](../resources/notificationsettings.md)|Update the properties of a [notificationSettings](../resources/notificationsettings.md) object.|
|[Delete notificationSettings](../api/notificationsettings-delete.md)|None|Deletes a [notificationSettings](../resources/notificationsettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalRecipients|[additionalRecipient](../resources/additionalrecipient.md) collection|**TODO: Add Description**|
|isWeeklyDigestEnabled|Boolean|**TODO: Add Description**|
|minRiskLevel|riskLevel|**TODO: Add Description**. Possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`.|
|notificationRecipients|[notificationRecipient](../resources/notificationrecipient.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.notificationSettings",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.notificationSettings",
  "isWeeklyDigestEnabled": "Boolean",
  "minRiskLevel": "String",
  "notificationRecipients": [
    {
      "@odata.type": "microsoft.graph.notificationRecipient"
    }
  ],
  "additionalRecipients": [
    {
      "@odata.type": "microsoft.graph.additionalRecipient"
    }
  ]
}
```

