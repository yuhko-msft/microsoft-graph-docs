---
title: "yammerDeviceUsageUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yammerDeviceUsageUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yammerDeviceUsageUserDetails](../api/yammerdeviceusageuserdetail-list.md)|[yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) collection|Get a list of the [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) objects and their properties.|
|[Create yammerDeviceUsageUserDetail](../api/yammerdeviceusageuserdetail-create.md)|[yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md)|Create a new [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.|
|[Get yammerDeviceUsageUserDetail](../api/yammerdeviceusageuserdetail-get.md)|[yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md)|Read the properties and relationships of a [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.|
|[Update yammerDeviceUsageUserDetail](../api/yammerdeviceusageuserdetail-update.md)|[yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md)|Update the properties of a [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.|
|[Delete yammerDeviceUsageUserDetail](../api/yammerdeviceusageuserdetail-delete.md)|None|Deletes a [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastActivityDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|stateChangeDate|Date|**TODO: Add Description**|
|usedAndroidPhone|Boolean|**TODO: Add Description**|
|usediPad|Boolean|**TODO: Add Description**|
|usediPhone|Boolean|**TODO: Add Description**|
|usedOthers|Boolean|**TODO: Add Description**|
|usedWeb|Boolean|**TODO: Add Description**|
|usedWindowsPhone|Boolean|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|userState|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.yammerDeviceUsageUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yammerDeviceUsageUserDetail",
  "id": "String (identifier)",
  "displayName": "String",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "stateChangeDate": "Date",
  "usedAndroidPhone": "Boolean",
  "usediPad": "Boolean",
  "usediPhone": "Boolean",
  "usedOthers": "Boolean",
  "usedWeb": "Boolean",
  "usedWindowsPhone": "Boolean",
  "userPrincipalName": "String",
  "userState": "String"
}
```

