---
title: "preApprovalDetail resource type"
description: "**TODO: Add Description**"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# preApprovalDetail resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissions|[preApprovedPermissions](../resources/preapprovedpermissions.md)|The collection for  settings related to taeget resource. Required.|
|scopeType|resourceScopeType|It indicates what resource scope this permission is requested. Possible values: `group` represents an Azure Active Directory (Azure AD) group, which can be a Microsoft 365 group, or a security group, `chat` **TODO: Add Description Fron Teams**, `tenant` for all resources in the tenant. Required.|
|sensitivityLabels|[scopeSensitivityLabels](../resources/scopesensitivitylabels.md)|The sensitivity labels that are applicable to the scope type and has been pre-approved. Sensitivity label is a pre-existing things, defined at tenant level. It is exposed to customer through informationProtection/policy/label API.|

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

