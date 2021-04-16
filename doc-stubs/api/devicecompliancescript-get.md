---
title: "Get deviceComplianceScript"
description: "Read the properties and relationships of a deviceComplianceScript object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceComplianceScript
Namespace: microsoft.graph



Read the properties and relationships of a [deviceComplianceScript](../resources/devicecompliancescript.md) object.

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
GET /deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}
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

If successful, this method returns a `200 OK` response code and a [deviceComplianceScript](../resources/devicecompliancescript.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicecompliancescript"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceComplianceScript"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceComplianceScript",
    "id": "229b662a-662a-229b-2a66-9b222a669b22",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "detectionScriptContent": "Binary",
    "displayName": "String",
    "enforceSignatureCheck": "Boolean",
    "lastModifiedDateTime": "String (timestamp)",
    "publisher": "String",
    "roleScopeTagIds": [
      "String"
    ],
    "runAs32Bit": "Boolean",
    "runAsAccount": "String",
    "version": "String"
  }
}
```

