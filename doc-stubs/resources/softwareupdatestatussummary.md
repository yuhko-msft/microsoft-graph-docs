---
title: "softwareUpdateStatusSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# softwareUpdateStatusSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List softwareUpdateStatusSummaries](../api/softwareupdatestatussummary-list.md)|[softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) collection|Get a list of the [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) objects and their properties.|
|[Create softwareUpdateStatusSummary](../api/softwareupdatestatussummary-create.md)|[softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md)|Create a new [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object.|
|[Get softwareUpdateStatusSummary](../api/softwareupdatestatussummary-get.md)|[softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md)|Read the properties and relationships of a [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object.|
|[Update softwareUpdateStatusSummary](../api/softwareupdatestatussummary-update.md)|[softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md)|Update the properties of a [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object.|
|[Delete softwareUpdateStatusSummary](../api/softwareupdatestatussummary-delete.md)|None|Deletes a [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|compliantDeviceCount|Int32|Number of compliant devices.|
|compliantUserCount|Int32|Number of compliant users.|
|conflictDeviceCount|Int32|Number of conflict devices.|
|conflictUserCount|Int32|Number of conflict users.|
|displayName|String|The name of the policy.|
|errorDeviceCount|Int32|Number of devices had error.|
|errorUserCount|Int32|Number of users had error.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|nonCompliantDeviceCount|Int32|Number of non compliant devices.|
|nonCompliantUserCount|Int32|Number of non compliant users.|
|notApplicableDeviceCount|Int32|Number of not applicable devices.|
|notApplicableUserCount|Int32|Number of not applicable users.|
|remediatedDeviceCount|Int32|Number of remediated devices.|
|remediatedUserCount|Int32|Number of remediated users.|
|unknownDeviceCount|Int32|Number of unknown devices.|
|unknownUserCount|Int32|Number of unknown users.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.softwareUpdateStatusSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.softwareUpdateStatusSummary",
  "id": "String (identifier)",
  "compliantDeviceCount": "Integer",
  "compliantUserCount": "Integer",
  "conflictDeviceCount": "Integer",
  "conflictUserCount": "Integer",
  "displayName": "String",
  "errorDeviceCount": "Integer",
  "errorUserCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "nonCompliantUserCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "notApplicableUserCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "remediatedUserCount": "Integer",
  "unknownDeviceCount": "Integer",
  "unknownUserCount": "Integer"
}
```

