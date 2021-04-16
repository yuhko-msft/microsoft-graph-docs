---
title: "deviceConfigurationTargetedUserAndDevice resource type"
description: "Conflict summary for a set of device configuration policies."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfigurationTargetedUserAndDevice resource type

Namespace: microsoft.graph



Conflict summary for a set of device configuration policies.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|The id of the device in the checkin.|
|deviceName|String|The name of the device in the checkin.|
|lastCheckinDateTime|DateTimeOffset|Last checkin time for this user/device pair.|
|userDisplayName|String|The display name of the user in the checkin|
|userId|String|The id of the user in the checkin.|
|userPrincipalName|String|The UPN of the user in the checkin.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceConfigurationTargetedUserAndDevice"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfigurationTargetedUserAndDevice",
  "deviceId": "String",
  "deviceName": "String",
  "lastCheckinDateTime": "String (timestamp)",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```

