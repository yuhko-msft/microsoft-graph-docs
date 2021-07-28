---
title: "List conditionalAccessPolicies"
description: "Get the conditionalAccessPolicy resources from the conditionalAccessPolicies navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List conditionalAccessPolicies
Namespace: microsoft.graph



Get the conditionalAccessPolicy resources from the conditionalAccessPolicies navigation property.

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
GET /policyRoot/conditionalAccessPolicies
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

If successful, this method returns a `200 OK` response code and a collection of [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_conditionalaccesspolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/policyRoot/conditionalAccessPolicies
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(Microsoft.IdentityProtectionServices.conditionalAccessPolicy)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#Microsoft.IdentityProtectionServices.conditionalAccessPolicy",
      "id": "3947b73c-b73c-3947-3cb7-47393cb74739",
      "createdDateTime": "String (timestamp)",
      "modifiedDateTime": "String (timestamp)",
      "displayName": "String",
      "description": "String",
      "state": "String",
      "conditions": {
        "@odata.type": "microsoft.graph.conditionalAccessConditionSet"
      },
      "grantControls": {
        "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
      },
      "sessionControls": {
        "@odata.type": "microsoft.graph.conditionalAccessSessionControls"
      }
    }
  ]
}
```

