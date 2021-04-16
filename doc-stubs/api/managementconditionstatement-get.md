---
title: "Get managementConditionStatement"
description: "Read the properties and relationships of a managementConditionStatement object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get managementConditionStatement
Namespace: microsoft.graph



Read the properties and relationships of a [managementConditionStatement](../resources/managementconditionstatement.md) object.

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
GET /deviceManagement/managementConditionStatements/{managementConditionStatementId}
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

If successful, this method returns a `200 OK` response code and a [managementConditionStatement](../resources/managementconditionstatement.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_managementconditionstatement"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/managementConditionStatements/{managementConditionStatementId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managementConditionStatement"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.managementConditionStatement",
    "id": "b7e92e17-2e17-b7e9-172e-e9b7172ee9b7",
    "applicablePlatforms": [
      "String"
    ],
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "eTag": "String",
    "expression": {
      "@odata.type": "microsoft.graph.managementConditionExpression"
    },
    "modifiedDateTime": "String (timestamp)"
  }
}
```

