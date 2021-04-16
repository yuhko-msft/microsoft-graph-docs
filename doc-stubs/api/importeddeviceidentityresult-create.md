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



Create a new [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object.

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
POST ** Collection URI for microsoft.graph.importedDeviceIdentityResult not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object.

The following table shows the properties that are required when you create the [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created Date Time of the device Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|description|String|The description of the device Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|enrollmentState|enrollmentState|The state of the device in Intune Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md). Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|importedDeviceIdentifier|String|Imported Device Identifier Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|importedDeviceIdentityType|importedDeviceIdentityType|Type of Imported Device Identity Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md). Possible values are: `unknown`, `imei`, `serialNumber`.|
|lastContactedDateTime|DateTimeOffset|Last Contacted Date Time of the device Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|lastModifiedDateTime|DateTimeOffset|Last Modified DateTime of the description Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|platform|platform|The platform of the Device. Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md). Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|status|Boolean|Status of imported device identity|



## Response

If successful, this method returns a `201 Created` response code and an [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_importeddeviceidentityresult_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.importedDeviceIdentityResult not found
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.importedDeviceIdentityResult",
  "description": "String",
  "enrollmentState": "String",
  "importedDeviceIdentifier": "String",
  "importedDeviceIdentityType": "String",
  "lastContactedDateTime": "String (timestamp)",
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
```

