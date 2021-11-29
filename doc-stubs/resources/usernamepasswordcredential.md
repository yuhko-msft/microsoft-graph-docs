---
title: "usernamePasswordCredential resource type"
description: "Credential that uses username and password to authenticate to a resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# usernamePasswordCredential resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Credential that uses username and password to authenticate to a resource.
This is an abstract type.


Inherits from [credential](../resources/credential.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the credential. Inherited from [credential](../resources/credential.md).|
|password|String|Password used to authenticate.|
|username|String|Username used to authenticate.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.usernamePasswordCredential"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.usernamePasswordCredential",
  "displayName": "String",
  "username": "String",
  "password": "String"
}
```

