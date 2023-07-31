---
title: "preApprovalDetail resource type"
description: "A preApprovalDetail describes a list of conditions under which the app has been pre-approved for consent"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---
 
# preApprovalDetail resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A preApprovalDetail describes a list of conditions under which the app has been pre-approved for consent. The conditions include permissions, resource scope type, and sensitivity labels that have been tagged for the resource scope.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissions|[preApprovedPermissions](../resources/preapprovedpermissions.md)|The conditions relating to permissions being granted for the pre-approved application. The list of **id** values for the specific permissions to match with, or a list with the single value `all` to match with any permission. The **id** of delegated permissions can be found in the **oauth2PermissionScopes** property of the API's [**servicePrincipal**](serviceprincipal.md) object. The **id** of resource-specific application permissions can be found in the **resourceSpecificApplicationPermissions** property of the API's [**servicePrincipal**](serviceprincipal.md) object. Default is the single value `all`. Required.|
|scopeType|String| The resource scope type the pre-approval applies to. Possible values: `group` for [groups](../resources/group.md) and [teams](../resources/team.md), or `chat` for [chats](../resources/chat.md) Required.|
|sensitivityLabels|[scopeSensitivityLabels](../resources/scopesensitivitylabels.md)|Conditions on the [sensitivity labels](/microsoftteams/sensitivity-labels) of the target resource scope the pre-approval applies to. Required.



## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.preApprovalDetail"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.preApprovalDetail",
  "scopeType": "String",
  "sensitivityLabels": {
    "@odata.type": "microsoft.graph.scopeSensitivityLabels"
  },
  "permissions": {
    "@odata.type": "microsoft.graph.preApprovedPermissions"
  }
}
```

