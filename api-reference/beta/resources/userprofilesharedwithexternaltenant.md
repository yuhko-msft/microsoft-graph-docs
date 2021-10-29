---
title: "userProfileSharedWithExternalTenant resource type"
description: "For an AAD user, represents the profile data that is shared with an external AAD tenant (other than the user's home tenant). This does not include profile sharing info for non-AAD users (for example, MSA users)."
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# userProfileSharedWithExternalTenant resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

For an AAD user, represents the profile data that is shared with an external AAD tenant (other than the user's home tenant). This does not include profile sharing info for non-AAD users (for example, MSA users).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userProfileSharedWithExternalTenant](../api/userprofilesharedwithexternaltenant-list.md)|[userProfileSharedWithExternalTenant](../resources/userprofilesharedwithexternaltenant.md) collection|List the users whose profile data is shared with external tenants.|
|[Get userProfileSharedWithExternalTenant](../api/userprofilesharedwithexternaltenant-get.md)|[userProfileSharedWithExternalTenant](../resources/userprofilesharedwithexternaltenant.md)|Read the properties and relationships of a [userProfileSharedWithExternalTenant](../resources/userprofilesharedwithexternaltenant.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
| id | String | ID of the profile entity. Should be treated as an opaque identifier. |
| userId | String | Object ID of the user whose profile data is being shared. |
| externalTenantId | String | ID of the external tenant with user profile access. |

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|multiTenantCollaboration|[multiTenantCollaboration](../resources/multitenantcollaboration.md)|**TODO: Add Description**|
|multiTenantCollaborationAdmissions|[multiTenantCollaborationAdmission](../resources/multitenantcollaborationadmission.md) collection|**TODO: Add Description**|

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
  "@odata.type": "#microsoft.graph.tenantRelationshipRoot"
}
```

