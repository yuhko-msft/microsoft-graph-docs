---
title: "sharedUserProfile resource type"
description: "Represents an AAD user from an external AAD tenant whose profile data is shared with the current tenant"
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# sharedUserProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents an AAD user from an external AAD tenant whose profile data is shared with the current tenant.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharedUserProfile](../api/sharedUserProfile-list.md)|[sharedUserProfile](../resources/sharedUserProfile.md) collection|List the external users whose profile data is shared with the current tenant.|
|[Get sharedUserProfile](../api/sharedUserProfile-get.md)|[sharedUserProfile](../resources/sharedUserProfile.md)|Read the properties and relationships of a [sharedUserProfile](../resources/sharedUserProfile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
| id | String | ID of the data sharing entity. |
| userId | String | Object ID of the external user whose profile data is shared with the current tenant. |
| userPrincipalName | String | The user principal name (UPN) of the external user. |
| displayName | String | The name displayed in the address book for the external user at the time when sharing record was created. |
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
  "id":"ZAMkAAIAAAoZDOFAAA=",
  "userId":"c228b2ae-c4fb-4eda-9620-7e73dddd1cac",
  "userPrincipalName":"Bob@contoso.onmicrosoft.com",
  "displayName":"Bob",
  "externalTenantId":"62bfb458-9474-4c44-896b-b30942d055f0"
}
```

