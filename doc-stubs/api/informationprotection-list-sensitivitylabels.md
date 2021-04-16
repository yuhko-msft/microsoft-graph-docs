---
title: "List sensitivityLabels"
description: "Get the sensitivityLabel resources from the sensitivityLabels navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List sensitivityLabels
Namespace: microsoft.graph



Get the sensitivityLabel resources from the sensitivityLabels navigation property.

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
GET /users/{usersId}/informationProtection/sensitivityLabels
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

If successful, this method returns a `200 OK` response code and a collection of [sensitivityLabel](../resources/sensitivitylabel.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_sensitivitylabel"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/users/{usersId}/informationProtection/sensitivityLabels
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.sensitivityLabel)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.sensitivityLabel",
      "id": "c9fdd4d9-d4d9-c9fd-d9d4-fdc9d9d4fdc9",
      "applicableTo": "String",
      "applicationMode": "String",
      "assignedPolicies": [
        {
          "@odata.type": "microsoft.graph.labelPolicy"
        }
      ],
      "autoLabeling": {
        "@odata.type": "microsoft.graph.autoLabeling"
      },
      "description": "String",
      "displayName": "String",
      "isDefault": "Boolean",
      "isEndpointProtectionEnabled": "Boolean",
      "labelActions": [
        {
          "@odata.type": "microsoft.graph.addFooter"
        }
      ],
      "name": "String",
      "priority": "Integer",
      "toolTip": "String"
    }
  ]
}
```

