---
title: "Get importedDeviceIdentityResult"
description: "Read the properties and relationships of an importedDeviceIdentityResult object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get importedDeviceIdentityResult
Namespace: microsoft.graph



Read the properties and relationships of an [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object.

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
GET /importedDeviceIdentityResult
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

If successful, this method returns a `200 OK` response code and an [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_importeddeviceidentityresult"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/importedDeviceIdentityResult
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.importedDeviceIdentityResult"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.importedDeviceIdentityResult",
    "id": "67201f3e-1f3e-6720-3e1f-20673e1f2067",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "enrollmentState": "String",
    "importedDeviceIdentifier": "String",
    "importedDeviceIdentityType": "String",
    "lastContactedDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "platform": "String",
    "status": "Boolean"
  }
}
```

