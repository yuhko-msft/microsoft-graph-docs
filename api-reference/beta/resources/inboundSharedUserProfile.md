---
title: "inboundSharedUserProfile resource type"
description: "The external AAD users whose profile data is shared with the current tenant."
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# inboundSharedUserProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The external AAD users whose profile data is shared with the current tenant.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List inboundSharedUserProfile](../api/inboundSharedUserProfile-list.md)|[inboundSharedUserProfile](../resources/inboundSharedUserProfile.md) collection|List the external users whose profile data is shared with the current tenant.|
|[Get inboundSharedUserProfile](../api/inboundSharedUserProfile-get.md)|[inboundSharedUserProfile](../resources/inboundSharedUserProfile.md)|Read the properties and relationships of a [inboundSharedUserProfile](../resources/inboundSharedUserProfile.md) object.|
|[Remove personalData](../api/inboundSharedUserProfile-remove.md)|None|Creates a request to remove all personal data associated with an inbound shared user. If approved, the personal data will be removed from the resource tenant (the tenant from which this API was invoked).|
|[Export personalData](../api/inboundSharedUserProfile-export.md)|None|Creates a request to export all personal data associated with an inbound shared user. If approved, the personal data will be exported from the resource tenant.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
| id | String | ID of the entity. Should be treated as an opaque identifier. |
| userId | String | Object ID of the external user whose profile data is shared with the current tenant. |
| userPrincipalName | String | The user principal name (UPN) of the external user. |
| displayName | String | The name displayed in the address book for the external user at the time when the sharing record was created. |
| homeTenantId | String | The external user's home tenant ID. |

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
  "userId":"c228b2ae-c4fb-4eda-9620-7e73dddd1cac",
  "userPrincipalName":"Bob@contoso.onmicrosoft.com",
  "displayName":"Bob",
  "externalTenantId":"62bfb458-9474-4c44-896b-b30942d055f0"
}
```