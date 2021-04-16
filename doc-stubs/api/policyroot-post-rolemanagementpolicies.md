---
title: "Create unifiedRoleManagementPolicy"
description: "Create a new unifiedRoleManagementPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRoleManagementPolicy
Namespace: microsoft.graph



Create a new unifiedRoleManagementPolicy object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /policies/roleManagementPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleManagementPolicy](../resources/unifiedrolemanagementpolicy.md) object.

The following table shows the properties that are required when you create the [unifiedRoleManagementPolicy](../resources/unifiedrolemanagementpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isOrganizationDefault|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identity](../resources/identity.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|scopeId|String|**TODO: Add Description**|
|scopeType|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [unifiedRoleManagementPolicy](../resources/unifiedrolemanagementpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unifiedrolemanagementpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/policies/roleManagementPolicies
Content-Type: application/json
Content-length: 214

{
  "@odata.type": "#microsoft.graph.unifiedRoleManagementPolicy",
  "description": "String",
  "displayName": "String",
  "isOrganizationDefault": "Boolean",
  "scopeId": "String",
  "scopeType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRoleManagementPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRoleManagementPolicy",
  "id": "3b3137b3-37b3-3b31-b337-313bb337313b",
  "description": "String",
  "displayName": "String",
  "isOrganizationDefault": "Boolean",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identity"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "scopeId": "String",
  "scopeType": "String"
}
```

