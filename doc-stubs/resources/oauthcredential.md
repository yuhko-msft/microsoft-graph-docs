---
title: "oAuthCredential resource type"
description: "Base type for credentials using one of the OAuth versions and flows to authenticate to a resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# oAuthCredential resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base type for credentials using one of the OAuth versions and flows to authenticate to a resource.
This is an abstract type.


Inherits from [credential](../resources/credential.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientId|String|Client id of the application authenticating.|
|clientSecret|String|Client secret used to authenticate (write-only).|
|displayName|String|The name of the credential. Inherited from [credential](../resources/credential.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.oAuthCredential"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.oAuthCredential",
  "displayName": "String",
  "clientId": "String",
  "clientSecret": "String"
}
```

