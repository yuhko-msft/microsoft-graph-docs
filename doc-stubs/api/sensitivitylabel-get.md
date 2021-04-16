---
title: "Get sensitivityLabel"
description: "Read the properties and relationships of a sensitivityLabel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get sensitivityLabel
Namespace: microsoft.graph



Read the properties and relationships of a [sensitivityLabel](../resources/sensitivitylabel.md) object.

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
GET /dataClassification/sensitivityLabels/{sensitivityLabelId}
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

If successful, this method returns a `200 OK` response code and a [sensitivityLabel](../resources/sensitivitylabel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_sensitivitylabel"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/dataClassification/sensitivityLabels/{sensitivityLabelId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sensitivityLabel"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

