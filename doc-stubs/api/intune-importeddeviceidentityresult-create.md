---
title: "Create importedDeviceIdentityResult"
description: "Create a new importedDeviceIdentityResult object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create importedDeviceIdentityResult
Namespace: microsoft.graph

Create a new [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Collection URI for microsoft.graph.importedDeviceIdentityResult not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) object.

The following table shows the properties that are required when you create the [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importedDeviceIdentifier|String|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|importedDeviceIdentityType|importedDeviceIdentityType|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md). Possible values are: `unknown`, `imei`, `serialNumber`.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|lastContactedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|description|String|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|enrollmentState|enrollmentState|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md). Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|platform|platform|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md). Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|status|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_importeddeviceidentityresult_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.importedDeviceIdentityResult not found
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.importedDeviceIdentityResult",
  "importedDeviceIdentifier": "String",
  "importedDeviceIdentityType": "String",
  "lastContactedDateTime": "String (timestamp)",
  "description": "String",
  "enrollmentState": "String",
  "platform": "String",
  "status": "Boolean"
}
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
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.importedDeviceIdentityResult",
  "id": "5f66f1e8-f1e8-5f66-e8f1-665fe8f1665f",
  "importedDeviceIdentifier": "String",
  "importedDeviceIdentityType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "lastContactedDateTime": "String (timestamp)",
  "description": "String",
  "enrollmentState": "String",
  "platform": "String",
  "status": "Boolean"
}
```

