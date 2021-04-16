---
title: "Create importedAppleDeviceIdentityResult"
description: "Create a new importedAppleDeviceIdentityResult object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create importedAppleDeviceIdentityResult
Namespace: microsoft.graph



Create a new [importedAppleDeviceIdentityResult](../resources/importedappledeviceidentityresult.md) object.

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
POST ** Collection URI for microsoft.graph.importedAppleDeviceIdentityResult not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedAppleDeviceIdentityResult](../resources/importedappledeviceidentityresult.md) object.

The following table shows the properties that are required when you create the [importedAppleDeviceIdentityResult](../resources/importedappledeviceidentityresult.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created Date Time of the device Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|description|String|The description of the device Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|discoverySource|discoverySource|Apple device discovery source. Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md). Possible values are: `unknown`, `adminImport`, `deviceEnrollmentProgram`.|
|enrollmentState|enrollmentState|The state of the device in Intune Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md). Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|isDeleted|Boolean|Indicates if the device is deleted from Apple Business Manager Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|isSupervised|Boolean|Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837 Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|lastContactedDateTime|DateTimeOffset|Last Contacted Date Time of the device Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|platform|platform|The platform of the Device. Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md). Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|requestedEnrollmentProfileAssignmentDateTime|DateTimeOffset|The time enrollment profile was assigned to the device Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|requestedEnrollmentProfileId|String|Enrollment profile Id admin intends to apply to the device during next enrollment Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|serialNumber|String|Device serial number Inherited from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md)|
|status|Boolean|Status of imported device identity|



## Response

If successful, this method returns a `201 Created` response code and an [importedAppleDeviceIdentityResult](../resources/importedappledeviceidentityresult.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_importedappledeviceidentityresult_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.importedAppleDeviceIdentityResult not found
Content-Type: application/json
Content-length: 470

{
  "@odata.type": "#microsoft.graph.importedAppleDeviceIdentityResult",
  "description": "String",
  "discoverySource": "String",
  "enrollmentState": "String",
  "isDeleted": "Boolean",
  "isSupervised": "Boolean",
  "lastContactedDateTime": "String (timestamp)",
  "platform": "String",
  "requestedEnrollmentProfileAssignmentDateTime": "String (timestamp)",
  "requestedEnrollmentProfileId": "String",
  "serialNumber": "String",
  "status": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.importedAppleDeviceIdentityResult"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.importedAppleDeviceIdentityResult",
  "id": "046bbab3-bab3-046b-b3ba-6b04b3ba6b04",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "discoverySource": "String",
  "enrollmentState": "String",
  "isDeleted": "Boolean",
  "isSupervised": "Boolean",
  "lastContactedDateTime": "String (timestamp)",
  "platform": "String",
  "requestedEnrollmentProfileAssignmentDateTime": "String (timestamp)",
  "requestedEnrollmentProfileId": "String",
  "serialNumber": "String",
  "status": "Boolean"
}
```

