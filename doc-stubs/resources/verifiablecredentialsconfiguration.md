---
title: "verifiableCredentialsConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# verifiableCredentialsConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List verifiableCredentialsConfigurations](../api/verifiablecredentialsconfiguration-list.md)|[verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md) collection|Get a list of the [verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md) objects and their properties.|
|[Create verifiableCredentialsConfiguration](../api/verifiablecredentialsconfiguration-create.md)|[verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md)|Create a new [verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md) object.|
|[Get verifiableCredentialsConfiguration](../api/verifiablecredentialsconfiguration-get.md)|[verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md)|Read the properties and relationships of a [verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md) object.|
|[Update verifiableCredentialsConfiguration](../api/verifiablecredentialsconfiguration-update.md)|[verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md)|Update the properties of a [verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md) object.|
|[Delete verifiableCredentialsConfiguration](../api/verifiablecredentialsconfiguration-delete.md)|None|Deletes a [verifiableCredentialsConfiguration](../resources/verifiablecredentialsconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|servicePrincipalId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.verifiableCredentialsConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.verifiableCredentialsConfiguration",
  "servicePrincipalId": "String"
}
```

