---
title: "Update deviceHealthScript"
description: "Update the properties of a deviceHealthScript object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceHealthScript
Namespace: microsoft.graph

Update the properties of a [deviceHealthScript](../resources/intune-devicehealthscript.md) object.

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
PATCH /deviceManagement/deviceHealthScripts/{deviceHealthScriptId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceHealthScript](../resources/intune-devicehealthscript.md) object.

The following table shows the properties that are required when you update the [deviceHealthScript](../resources/intune-devicehealthscript.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|publisher|String|**TODO: Add Description**|
|version|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|detectionScriptContent|Binary|**TODO: Add Description**|
|remediationScriptContent|Binary|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|runAsAccount|runAsAccountType|**TODO: Add Description**. Possible values are: `system`, `user`.|
|enforceSignatureCheck|Boolean|**TODO: Add Description**|
|runAs32Bit|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|isGlobalScript|Boolean|**TODO: Add Description**|
|highestAvailableVersion|String|**TODO: Add Description**|
|detectionScriptParameters|[deviceHealthScriptParameter](../resources/intune-devicehealthscriptparameter.md) collection|**TODO: Add Description**|
|remediationScriptParameters|[deviceHealthScriptParameter](../resources/intune-devicehealthscriptparameter.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceHealthScript](../resources/intune-devicehealthscript.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicehealthscript"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/deviceHealthScripts/{deviceHealthScriptId}
Content-Type: application/json
Content-length: 716

{
  "@odata.type": "#microsoft.graph.deviceHealthScript",
  "publisher": "String",
  "version": "String",
  "displayName": "String",
  "description": "String",
  "detectionScriptContent": "Binary",
  "remediationScriptContent": "Binary",
  "runAsAccount": "String",
  "enforceSignatureCheck": "Boolean",
  "runAs32Bit": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "isGlobalScript": "Boolean",
  "highestAvailableVersion": "String",
  "detectionScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptStringParameter"
    }
  ],
  "remediationScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptStringParameter"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceHealthScript",
  "id": "de7d6812-6812-de7d-1268-7dde12687dde",
  "publisher": "String",
  "version": "String",
  "displayName": "String",
  "description": "String",
  "detectionScriptContent": "Binary",
  "remediationScriptContent": "Binary",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "runAsAccount": "String",
  "enforceSignatureCheck": "Boolean",
  "runAs32Bit": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "isGlobalScript": "Boolean",
  "highestAvailableVersion": "String",
  "detectionScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptStringParameter"
    }
  ],
  "remediationScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptStringParameter"
    }
  ]
}
```

