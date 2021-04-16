---
title: "Get informationProtectionLabel"
description: "Read the properties and relationships of an informationProtectionLabel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get informationProtectionLabel
Namespace: microsoft.graph



Read the properties and relationships of an [informationProtectionLabel](../resources/informationprotectionlabel.md) object.

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
GET /me/informationProtection/policy/labels/{informationProtectionLabelId}
GET /users/{usersId}/informationProtection/policy/labels/{informationProtectionLabelId}
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

If successful, this method returns a `200 OK` response code and an [informationProtectionLabel](../resources/informationprotectionlabel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_informationprotectionlabel"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/informationProtection/policy/labels/{informationProtectionLabelId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.informationProtectionLabel"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.informationProtectionLabel",
    "id": "0e1668ce-68ce-0e16-ce68-160ece68160e",
    "color": "String",
    "description": "String",
    "isActive": "Boolean",
    "name": "String",
    "parent": {
      "@odata.type": "microsoft.graph.parentLabelDetails"
    },
    "sensitivity": "Integer",
    "tooltip": "String"
  }
}
```

