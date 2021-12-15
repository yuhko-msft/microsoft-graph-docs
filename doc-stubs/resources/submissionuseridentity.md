---
title: "submissionUserIdentity resource type"
description: "Threat submission user identity. This type will inherit from the graph.identity complex type when authoring schema."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submissionUserIdentity resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Threat submission user identity. This type will inherit from the graph.identity complex type when authoring schema.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The field will be inherit from graph.identity.|
|email|String|The email of submission user for delegated token case.|
|identity|String|The field will be id and inherit from graph.identity. Currently id can't be used within complex type in GraML.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.submissionUserIdentity"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submissionUserIdentity",
  "identity": "String",
  "displayName": "String",
  "email": "String"
}
```

