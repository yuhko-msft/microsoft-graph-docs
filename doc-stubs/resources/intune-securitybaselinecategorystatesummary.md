---
title: "securityBaselineCategoryStateSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineCategoryStateSummary resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List categoryDeviceStateSummaries](../api/intune-securitybaselinetemplate-list-categorydevicestatesummaries.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) collection|Get the securityBaselineCategoryStateSummary resources from the categoryDeviceStateSummaries navigation property.|
|[Create categoryDeviceStateSummaries](../api/intune-securitybaselinetemplate-post-categorydevicestatesummaries.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md)|Create a new securityBaselineCategoryStateSummary object.|
|[Update categoryDeviceStateSummaries](../api/intune-securitybaselinetemplate-update-categorydevicestatesummaries.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md)|Update the properties of a categoryDeviceStateSummaries object.|
|[Get categoryDeviceStateSummaries](../api/intune-securitybaselinetemplate-get-securitybaselinecategorystatesummary.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md)|Read the properties and relationships of a [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.|
|[Delete categoryDeviceStateSummaries](../api/intune-securitybaselinetemplate-delete-categorydevicestatesummaries.md)|None|Delete a [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.|
|[List securityBaselineCategoryStateSummaries](../api/intune-securitybaselinecategorystatesummary-list.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) collection|Get a list of the [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) objects and their properties.|
|[Create securityBaselineCategoryStateSummary](../api/intune-securitybaselinecategorystatesummary-create.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md)|Create a new [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.|
|[Get securityBaselineCategoryStateSummary](../api/intune-securitybaselinecategorystatesummary-get.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md)|Read the properties and relationships of a [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.|
|[Update securityBaselineCategoryStateSummary](../api/intune-securitybaselinecategorystatesummary-update.md)|[securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md)|Update the properties of a [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.|
|[Delete securityBaselineCategoryStateSummary](../api/intune-securitybaselinecategorystatesummary-delete.md)|None|Deletes a [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conflictCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|displayName|String|**TODO: Add Description**|
|errorCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|notApplicableCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|notSecureCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|secureCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|unknownCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineCategoryStateSummary",
  "baseType": "microsoft.graph.securityBaselineStateSummary",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineCategoryStateSummary",
  "secureCount": "Integer",
  "notSecureCount": "Integer",
  "unknownCount": "Integer",
  "errorCount": "Integer",
  "conflictCount": "Integer",
  "notApplicableCount": "Integer",
  "displayName": "String"
}
```

