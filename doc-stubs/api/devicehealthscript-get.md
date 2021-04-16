---
title: "Get deviceHealthScript"
description: "Read the properties and relationships of a deviceHealthScript object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceHealthScript
Namespace: microsoft.graph



Read the properties and relationships of a [deviceHealthScript](../resources/devicehealthscript.md) object.

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
GET /deviceManagement/deviceHealthScripts/{deviceHealthScriptId}
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

If successful, this method returns a `200 OK` response code and a [deviceHealthScript](../resources/devicehealthscript.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicehealthscript"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceHealthScripts/{deviceHealthScriptId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceHealthScript"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceHealthScript",
    "id": "7e8b82a4-82a4-7e8b-a482-8b7ea4828b7e",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "detectionScriptContent": "Binary",
    "detectionScriptParameters": [
      {
        "@odata.type": "microsoft.graph.deviceHealthScriptBooleanParameter"
      }
    ],
    "displayName": "String",
    "enforceSignatureCheck": "Boolean",
    "highestAvailableVersion": "String",
    "isGlobalScript": "Boolean",
    "lastModifiedDateTime": "String (timestamp)",
    "publisher": "String",
    "remediationScriptContent": "Binary",
    "remediationScriptParameters": [
      {
        "@odata.type": "microsoft.graph.deviceHealthScriptBooleanParameter"
      }
    ],
    "roleScopeTagIds": [
      "String"
    ],
    "runAs32Bit": "Boolean",
    "runAsAccount": "String",
    "version": "String"
  }
}
```

