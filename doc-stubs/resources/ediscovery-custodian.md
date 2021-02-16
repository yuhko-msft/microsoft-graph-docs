---
title: "custodian resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# custodian resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List custodians](../api/custodian-list.md)|[custodian](../resources/ediscovery-custodian.md) collection|Get a list of the [custodian](../resources/custodian.md) objects and their properties.|
|[Create custodian](../api/ediscovery-custodian-create.md)|[custodian](../resources/ediscovery-custodian.md)|Create a new [custodian](../resources/ediscovery-custodian.md) object.|
|[Get custodian](../api/ediscovery-custodian-get.md)|[custodian](../resources/ediscovery-custodian.md)|Read the properties and relationships of a [custodian](../resources/ediscovery-custodian.md) object.|
|[Update custodian](../api/ediscovery-custodian-update.md)|[custodian](../resources/ediscovery-custodian.md)|Update the properties of a [custodian](../resources/ediscovery-custodian.md) object.|
|[Delete custodian](../api/ediscovery-custodian-delete.md)|None|Deletes a [custodian](../resources/ediscovery-custodian.md) object.|
|[List caseIndexOperation](../api/ediscovery-custodian-list-lastindexoperation.md)|[caseIndexOperation](../resources/ediscovery-caseindexoperation.md) collection|Get the caseIndexOperation resources from the lastIndexOperation navigation property.|
|[Add caseIndexOperation](../api/ediscovery-custodian-post-lastindexoperation.md)|[caseIndexOperation](../resources/ediscovery-caseindexoperation.md)|Add lastIndexOperation by posting to the lastIndexOperation collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|acknowledgedDateTime|DateTimeOffset|**TODO: Add Description**|
|applyHoldToSources|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|releasedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|custodianStatus|**TODO: Add Description**. Possible values are: `active`, `released`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|lastIndexOperation|[caseIndexOperation](../resources/ediscovery-caseindexoperation.md)|**TODO: Add Description**|
|siteSources|[siteSource](../resources/ediscovery-sitesource.md) collection|**TODO: Add Description**|
|unifiedGroupSources|[unifiedGroupSource](../resources/ediscovery-unifiedgroupsource.md) collection|**TODO: Add Description**|
|userSources|[userSource](../resources/ediscovery-usersource.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.custodian",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.custodian",
  "id": "String (identifier)",
  "email": "String",
  "applyHoldToSources": "Boolean",
  "status": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "releasedDateTime": "String (timestamp)",
  "acknowledgedDateTime": "String (timestamp)",
  "displayName": "String"
}
```

