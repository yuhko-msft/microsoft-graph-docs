---
title: "skypeForBusinessDeviceUsageUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessDeviceUsageUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessDeviceUsageUserDetails](../api/skypeforbusinessdeviceusageuserdetail-list.md)|[skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) collection|Get a list of the [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) objects and their properties.|
|[Create skypeForBusinessDeviceUsageUserDetail](../api/skypeforbusinessdeviceusageuserdetail-create.md)|[skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md)|Create a new [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) object.|
|[Get skypeForBusinessDeviceUsageUserDetail](../api/skypeforbusinessdeviceusageuserdetail-get.md)|[skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md)|Read the properties and relationships of a [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) object.|
|[Update skypeForBusinessDeviceUsageUserDetail](../api/skypeforbusinessdeviceusageuserdetail-update.md)|[skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md)|Update the properties of a [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) object.|
|[Delete skypeForBusinessDeviceUsageUserDetail](../api/skypeforbusinessdeviceusageuserdetail-delete.md)|None|Deletes a [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastActivityDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|usedAndroidPhone|Boolean|**TODO: Add Description**|
|usediPad|Boolean|**TODO: Add Description**|
|usediPhone|Boolean|**TODO: Add Description**|
|usedWindows|Boolean|**TODO: Add Description**|
|usedWindowsPhone|Boolean|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.skypeForBusinessDeviceUsageUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageUserDetail",
  "id": "String (identifier)",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "usedAndroidPhone": "Boolean",
  "usediPad": "Boolean",
  "usediPhone": "Boolean",
  "usedWindows": "Boolean",
  "usedWindowsPhone": "Boolean",
  "userPrincipalName": "String"
}
```

