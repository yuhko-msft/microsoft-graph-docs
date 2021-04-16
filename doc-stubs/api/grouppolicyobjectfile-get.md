---
title: "Get groupPolicyObjectFile"
description: "Read the properties and relationships of a groupPolicyObjectFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get groupPolicyObjectFile
Namespace: microsoft.graph



Read the properties and relationships of a [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object.

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
GET /deviceManagement/groupPolicyObjectFiles/{groupPolicyObjectFileId}
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

If successful, this method returns a `200 OK` response code and a [groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_grouppolicyobjectfile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyObjectFiles/{groupPolicyObjectFileId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyObjectFile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.groupPolicyObjectFile",
    "id": "f05c45dc-45dc-f05c-dc45-5cf0dc455cf0",
    "content": "String",
    "createdDateTime": "String (timestamp)",
    "groupPolicyObjectId": "Guid",
    "lastModifiedDateTime": "String (timestamp)",
    "ouDistinguishedName": "String"
  }
}
```

