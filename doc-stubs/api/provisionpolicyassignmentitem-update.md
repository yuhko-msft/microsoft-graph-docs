---
title: "Update ProvisionPolicyAssignmentItem"
description: "Update the properties of a ProvisionPolicyAssignmentItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update ProvisionPolicyAssignmentItem
Namespace: microsoft.graph

Update the properties of a [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /provisioningPolicies/{provisioningPoliciesId}/assignments/{ProvisionPolicyAssignmentItemId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object.

The following table shows the properties that are required when you create the [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|groupId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_provisionpolicyassignmentitem"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/provisioningPolicies/{provisioningPoliciesId}/assignments/{ProvisionPolicyAssignmentItemId}
Content-Type: application/json
Content-length: 95

{
  "@odata.type": "#microsoft.graph.ProvisionPolicyAssignmentItem",
  "groupId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.ProvisionPolicyAssignmentItem",
  "id": "1648c92d-c92d-1648-2dc9-48162dc94816",
  "groupId": "String"
}
```

