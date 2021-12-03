---
title: "outboundSharedUserProfile resource type"
description: "From the users homed in the current tenant, the AAD users whose profile data is shared with external tenants."
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# outboundSharedUserProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

From the users homed in the current tenant, the AAD users whose profile data is shared with external tenants.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outboundSharedUserProfile](../api/outboundSharedUserProfile-list.md)|[outboundSharedUserProfile](../resources/outboundSharedUserProfile.md) collection|List the AAD users whose profile data is shared with external tenants.|
|[Get outboundSharedUserProfile](../api/outboundSharedUserProfile-get.md)|[outboundSharedUserProfile](../resources/outboundSharedUserProfile.md)|Read the properties and relationships of a [outboundSharedUserProfile](../resources/outboundSharedUserProfile.md) object.|
|[removePersonalData](../api/outboundSharedUserProfile-remove.md)|None|Creates a request to remove all personal data associated with an outbound shared user. If approved, the user's personal data will be removed from external tenants.|


## Properties
|Property|Type|Description|
|:---|:---|:---|
| userId | String | Object ID of the external user whose profile data is shared with the current tenant. |
| userPrincipalName | String | The user principal name (UPN) of the external user. |
| externalTenantId | String | ID of the external tenant with user profile access. |

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.tenantRelationshipRoot",
  "openType": false
}
-->
``` json
{
  "id":"ZAMkAAIAAAoZDOFAAA=",
  "userId":"c228b2ae-c4fb-4eda-9620-7e73dddd1cac",
  "externalTenantId":"62bfb458-9474-4c44-896b-b30942d055f0"
}
```

