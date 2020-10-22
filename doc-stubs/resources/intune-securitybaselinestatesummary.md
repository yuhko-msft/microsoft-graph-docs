---
title: "securityBaselineStateSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineStateSummary resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceStateSummary](../api/intune-securitybaselinetemplate-list-devicestatesummary.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) collection|Get the securityBaselineStateSummary resources from the deviceStateSummary navigation property.|
|[Create deviceStateSummary](../api/intune-securitybaselinetemplate-post-devicestatesummary.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|Create a new securityBaselineStateSummary object.|
|[Update deviceStateSummary](../api/intune-securitybaselinetemplate-update-devicestatesummary.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|Update the properties of a deviceStateSummary object.|
|[Get deviceStateSummary](../api/intune-securitybaselinetemplate-get-securitybaselinestatesummary.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|Read the properties and relationships of a [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.|
|[Delete deviceStateSummary](../api/intune-securitybaselinetemplate-delete-devicestatesummary.md)|None|Delete a [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.|
|[List securityBaselineStateSummaries](../api/intune-securitybaselinestatesummary-list.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) collection|Get a list of the [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) objects and their properties.|
|[Create securityBaselineStateSummary](../api/intune-securitybaselinestatesummary-create.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|Create a new [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.|
|[Get securityBaselineStateSummary](../api/intune-securitybaselinestatesummary-get.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|Read the properties and relationships of a [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.|
|[Update securityBaselineStateSummary](../api/intune-securitybaselinestatesummary-update.md)|[securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|Update the properties of a [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.|
|[Delete securityBaselineStateSummary](../api/intune-securitybaselinestatesummary-delete.md)|None|Deletes a [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conflictCount|Int32|**TODO: Add Description**|
|errorCount|Int32|**TODO: Add Description**|
|notApplicableCount|Int32|**TODO: Add Description**|
|notSecureCount|Int32|**TODO: Add Description**|
|secureCount|Int32|**TODO: Add Description**|
|unknownCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineStateSummary",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineStateSummary",
  "secureCount": "Integer",
  "notSecureCount": "Integer",
  "unknownCount": "Integer",
  "errorCount": "Integer",
  "conflictCount": "Integer",
  "notApplicableCount": "Integer"
}
```

