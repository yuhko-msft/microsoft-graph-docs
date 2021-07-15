---
title: "Get permissionGrantConditionSet"
description: "Read the properties and relationships of a permissionGrantConditionSet object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get permissionGrantConditionSet
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [permissionGrantConditionSet](../resources/permissiongrantconditionset.md) object.

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
GET /policies/permissionGrantPolicies/{permissionGrantPolicyId}/excludes/{permissionGrantConditionSetId}
GET /policies/permissionGrantPolicies/{permissionGrantPolicyId}/includes/{permissionGrantConditionSetId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [permissionGrantConditionSet](../resources/permissiongrantconditionset.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_permissiongrantconditionset"
}
-->
``` http
GET https://graph.microsoft.com/beta/policies/permissionGrantPolicies/{permissionGrantPolicyId}/excludes/{permissionGrantConditionSetId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.permissionGrantConditionSet"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.permissionGrantConditionSet",
    "id": "0521e7b4-e7b4-0521-b4e7-2105b4e72105",
    "clientApplicationIds": [
      "String"
    ],
    "clientApplicationPublisherIds": [
      "String"
    ],
    "clientApplicationsFromVerifiedPublisherOnly": "Boolean",
    "clientApplicationTenantIds": [
      "String"
    ],
    "permissionClassification": "String",
    "permissions": [
      "String"
    ],
    "permissionType": "String",
    "resourceApplication": "String"
  }
}
```

