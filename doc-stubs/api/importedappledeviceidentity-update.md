---
title: "Update importedAppleDeviceIdentity"
description: "Update the properties of an importedAppleDeviceIdentity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update importedAppleDeviceIdentity
Namespace: microsoft.graph



Update the properties of an [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md) object.

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
PATCH /deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/importedAppleDeviceIdentities/{importedAppleDeviceIdentityId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md) object.

The following table shows the properties that are required when you update the [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created Date Time of the device|
|description|String|The description of the device|
|discoverySource|discoverySource|Apple device discovery source. Possible values are: `unknown`, `adminImport`, `deviceEnrollmentProgram`.|
|enrollmentState|enrollmentState|The state of the device in Intune. Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|isDeleted|Boolean|Indicates if the device is deleted from Apple Business Manager|
|isSupervised|Boolean|Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837|
|lastContactedDateTime|DateTimeOffset|Last Contacted Date Time of the device|
|platform|platform|The platform of the Device. Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|requestedEnrollmentProfileAssignmentDateTime|DateTimeOffset|The time enrollment profile was assigned to the device|
|requestedEnrollmentProfileId|String|Enrollment profile Id admin intends to apply to the device during next enrollment|
|serialNumber|String|Device serial number|



## Response

If successful, this method returns a `200 OK` response code and an updated [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_importedappledeviceidentity"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/importedAppleDeviceIdentities/{importedAppleDeviceIdentityId}
Content-Type: application/json
Content-length: 440

{
  "@odata.type": "#microsoft.graph.importedAppleDeviceIdentity",
  "description": "String",
  "discoverySource": "String",
  "enrollmentState": "String",
  "isDeleted": "Boolean",
  "isSupervised": "Boolean",
  "lastContactedDateTime": "String (timestamp)",
  "platform": "String",
  "requestedEnrollmentProfileAssignmentDateTime": "String (timestamp)",
  "requestedEnrollmentProfileId": "String",
  "serialNumber": "String"
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
  "@odata.type": "#microsoft.graph.importedAppleDeviceIdentity",
  "id": "d736fa09-fa09-d736-09fa-36d709fa36d7",
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
  "serialNumber": "String"
}
```

