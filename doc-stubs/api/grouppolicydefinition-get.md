---
title: "Get groupPolicyDefinition"
description: "Read the properties and relationships of a groupPolicyDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get groupPolicyDefinition
Namespace: microsoft.graph



Read the properties and relationships of a [groupPolicyDefinition](../resources/grouppolicydefinition.md) object.

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
GET /deviceManagement/groupPolicyDefinitions/{groupPolicyDefinitionId}
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

If successful, this method returns a `200 OK` response code and a [groupPolicyDefinition](../resources/grouppolicydefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_grouppolicydefinition"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyDefinitions/{groupPolicyDefinitionId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyDefinition"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.groupPolicyDefinition",
    "id": "42faa05a-a05a-42fa-5aa0-fa425aa0fa42",
    "categoryPath": "String",
    "classType": "String",
    "displayName": "String",
    "explainText": "String",
    "groupPolicyCategoryId": "Guid",
    "lastModifiedDateTime": "String (timestamp)",
    "policyType": "String",
    "supportedOn": "String"
  }
}
```

