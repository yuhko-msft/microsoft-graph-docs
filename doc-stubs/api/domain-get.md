---
title: "Get domain"
description: "Read the properties and relationships of a domain object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get domain
Namespace: microsoft.graph



Read the properties and relationships of a [domain](../resources/domain.md) object.

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
GET /domains/{domainsId}
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

If successful, this method returns a `200 OK` response code and a [domain](../resources/domain.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_domain"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/domains/{domainsId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.domain"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.domain",
    "id": "c7c53b9a-3b9a-c7c5-9a3b-c5c79a3bc5c7",
    "authenticationType": "String",
    "availabilityStatus": "String",
    "isAdminManaged": "Boolean",
    "isDefault": "Boolean",
    "isInitial": "Boolean",
    "isRoot": "Boolean",
    "isVerified": "Boolean",
    "passwordNotificationWindowInDays": "Integer",
    "passwordValidityPeriodInDays": "Integer",
    "state": {
      "@odata.type": "microsoft.graph.domainState"
    },
    "supportedServices": [
      "String"
    ]
  }
}
```

