---
title: "Create importedDeviceIdentity"
description: "Create a new importedDeviceIdentity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create importedDeviceIdentity
Namespace: microsoft.graph



Create a new importedDeviceIdentity object.

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
POST /deviceManagement/importedDeviceIdentities
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedDeviceIdentity](../resources/importeddeviceidentity.md) object.

The following table shows the properties that are required when you create the [importedDeviceIdentity](../resources/importeddeviceidentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created Date Time of the device|
|description|String|The description of the device|
|enrollmentState|enrollmentState|The state of the device in Intune. Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|importedDeviceIdentifier|String|Imported Device Identifier|
|importedDeviceIdentityType|importedDeviceIdentityType|Type of Imported Device Identity. Possible values are: `unknown`, `imei`, `serialNumber`.|
|lastContactedDateTime|DateTimeOffset|Last Contacted Date Time of the device|
|lastModifiedDateTime|DateTimeOffset|Last Modified DateTime of the description|
|platform|platform|The platform of the Device. Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|



## Response

If successful, this method returns a `201 Created` response code and an [importedDeviceIdentity](../resources/importeddeviceidentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_importeddeviceidentity_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/importedDeviceIdentities
Content-Type: application/json
Content-length: 283

{
  "@odata.type": "#microsoft.graph.importedDeviceIdentity",
  "description": "String",
  "enrollmentState": "String",
  "importedDeviceIdentifier": "String",
  "importedDeviceIdentityType": "String",
  "lastContactedDateTime": "String (timestamp)",
  "platform": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.importedDeviceIdentity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.importedDeviceIdentity",
  "id": "dc9bccb5-ccb5-dc9b-b5cc-9bdcb5cc9bdc",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "enrollmentState": "String",
  "importedDeviceIdentifier": "String",
  "importedDeviceIdentityType": "String",
  "lastContactedDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "platform": "String"
}
```

