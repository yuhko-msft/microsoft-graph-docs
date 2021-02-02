---
title: "iosEapTls resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosEapTls resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosEapSettings](../resources/ioseapsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|[resourceAccessAuthenticationMethod](../resources/intune-resourceaccessauthenticationmethod.md)|**TODO: Add Description**|
|rootCertificatesForServerValidationIds|Guid collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosEapTls"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosEapTls",
  "authenticationMethod": {
    "@odata.type": "microsoft.graph.resourceAccessAuthenticationMethod"
  },
  "rootCertificatesForServerValidationIds": [
    "Guid"
  ]
}
```

