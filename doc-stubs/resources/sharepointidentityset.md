---
title: "sharePointIdentitySet resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointIdentitySet resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [identitySet](../resources/intune-identityset.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|application|[identity](../resources/intune-identity.md)|**TODO: Add Description** Inherited from [identitySet](../resources/intune-identityset.md).|
|device|[identity](../resources/intune-identity.md)|**TODO: Add Description** Inherited from [identitySet](../resources/intune-identityset.md).|
|group|[identity](../resources/intune-identity.md)|**TODO: Add Description**|
|siteGroup|[sharePointIdentity](../resources/sharepointidentity.md)|**TODO: Add Description**|
|siteUser|[sharePointIdentity](../resources/sharepointidentity.md)|**TODO: Add Description**|
|user|[identity](../resources/intune-identity.md)|**TODO: Add Description** Inherited from [identitySet](../resources/intune-identityset.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.sharePointIdentitySet"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointIdentitySet",
  "user": {
    "@odata.type": "microsoft.graph.identity"
  },
  "application": {
    "@odata.type": "microsoft.graph.identity"
  },
  "device": {
    "@odata.type": "microsoft.graph.identity"
  },
  "siteUser": {
    "@odata.type": "microsoft.graph.sharePointIdentity"
  },
  "siteGroup": {
    "@odata.type": "microsoft.graph.sharePointIdentity"
  },
  "group": {
    "@odata.type": "microsoft.graph.identity"
  }
}
```

