---
title: "securityBaselineCategoryStateSummary resource type"
description: "The security baseline per category compliance state summary for the security baseline of the account."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineCategoryStateSummary resource type

Namespace: microsoft.graph



The security baseline per category compliance state summary for the security baseline of the account.


Inherits from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securityBaselineCategoryStateSummaries](../api/securitybaselinecategorystatesummary-list.md)|[securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) collection|Get a list of the [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) objects and their properties.|
|[Create securityBaselineCategoryStateSummary](../api/securitybaselinecategorystatesummary-create.md)|[securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md)|Create a new [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) object.|
|[Get securityBaselineCategoryStateSummary](../api/securitybaselinecategorystatesummary-get.md)|[securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md)|Read the properties and relationships of a [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) object.|
|[Update securityBaselineCategoryStateSummary](../api/securitybaselinecategorystatesummary-update.md)|[securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md)|Update the properties of a [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) object.|
|[Delete securityBaselineCategoryStateSummary](../api/securitybaselinecategorystatesummary-delete.md)|None|Deletes a [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conflictCount|Int32|Number of conflict devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|displayName|String|The category name|
|errorCount|Int32|Number of error devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|notApplicableCount|Int32|Number of not applicable devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|notSecureCount|Int32|Number of not secure devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|secureCount|Int32|Number of secure devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|unknownCount|Int32|Number of unknown devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|

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
  "id": "String (identifier)",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "notApplicableCount": "Integer",
  "notSecureCount": "Integer",
  "secureCount": "Integer",
  "unknownCount": "Integer",
  "displayName": "String"
}
```

