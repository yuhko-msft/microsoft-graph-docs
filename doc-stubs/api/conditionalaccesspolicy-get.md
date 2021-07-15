---
title: "Get conditionalAccessPolicy"
description: "Read the properties and relationships of a conditionalAccessPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get conditionalAccessPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.

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
GET /policies/conditionalAccessPolicies/{conditionalAccessPolicyId}
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

If successful, this method returns a `200 OK` response code and a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_conditionalaccesspolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/policies/conditionalAccessPolicies/{conditionalAccessPolicyId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.conditionalAccessPolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.conditionalAccessPolicy",
    "id": "c498b391-b391-c498-91b3-98c491b398c4",
    "conditions": {
      "@odata.type": "microsoft.graph.conditionalAccessConditionSet"
    },
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "grantControls": {
      "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
    },
    "modifiedDateTime": "String (timestamp)",
    "sessionControls": {
      "@odata.type": "microsoft.graph.conditionalAccessSessionControls"
    },
    "state": "String"
  }
}
```

