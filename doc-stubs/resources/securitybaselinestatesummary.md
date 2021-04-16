---
title: "securityBaselineStateSummary resource type"
description: "The security baseline compliance state summary for the security baseline of the account."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineStateSummary resource type

Namespace: microsoft.graph



The security baseline compliance state summary for the security baseline of the account.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securityBaselineStateSummaries](../api/securitybaselinestatesummary-list.md)|[securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) collection|Get a list of the [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) objects and their properties.|
|[Create securityBaselineStateSummary](../api/securitybaselinestatesummary-create.md)|[securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|Create a new [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.|
|[Get securityBaselineStateSummary](../api/securitybaselinestatesummary-get.md)|[securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|Read the properties and relationships of a [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.|
|[Update securityBaselineStateSummary](../api/securitybaselinestatesummary-update.md)|[securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|Update the properties of a [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.|
|[Delete securityBaselineStateSummary](../api/securitybaselinestatesummary-delete.md)|None|Deletes a [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conflictCount|Int32|Number of conflict devices|
|errorCount|Int32|Number of error devices|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|notApplicableCount|Int32|Number of not applicable devices|
|notSecureCount|Int32|Number of not secure devices|
|secureCount|Int32|Number of secure devices|
|unknownCount|Int32|Number of unknown devices|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineStateSummary",
  "id": "String (identifier)",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "notApplicableCount": "Integer",
  "notSecureCount": "Integer",
  "secureCount": "Integer",
  "unknownCount": "Integer"
}
```

