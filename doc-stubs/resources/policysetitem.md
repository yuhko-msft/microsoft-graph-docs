---
title: "policySetItem resource type"
description: "A class containing the properties used for PolicySet Item."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# policySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for PolicySet Item.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List policySetItems](../api/policysetitem-list.md)|[policySetItem](../resources/policysetitem.md) collection|Get a list of the [policySetItem](../resources/policysetitem.md) objects and their properties.|
|[Create policySetItem](../api/policysetitem-create.md)|[policySetItem](../resources/policysetitem.md)|Create a new [policySetItem](../resources/policysetitem.md) object.|
|[Get policySetItem](../api/policysetitem-get.md)|[policySetItem](../resources/policysetitem.md)|Read the properties and relationships of a [policySetItem](../resources/policysetitem.md) object.|
|[Update policySetItem](../api/policysetitem-update.md)|[policySetItem](../resources/policysetitem.md)|Update the properties of a [policySetItem](../resources/policysetitem.md) object.|
|[Delete policySetItem](../api/policysetitem-delete.md)|None|Deletes a [policySetItem](../resources/policysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem.|
|displayName|String|DisplayName of the PolicySetItem.|
|errorCode|errorCode|Error code if any occured. Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|itemType|String|policySetType of the PolicySetItem.|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem.|
|payloadId|String|PayloadId of the PolicySetItem.|
|status|policySetStatus|Status of the PolicySetItem. Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policySetItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.policySetItem",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "status": "String"
}
```

