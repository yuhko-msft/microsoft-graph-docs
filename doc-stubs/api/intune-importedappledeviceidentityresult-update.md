---
title: "Update importedAppleDeviceIdentityResult"
description: "Update the properties of an importedAppleDeviceIdentityResult object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update importedAppleDeviceIdentityResult
Namespace: microsoft.graph

Update the properties of an [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) object.

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
PATCH /importedAppleDeviceIdentityResult
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) object.

The following table shows the properties that are required when you create the [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|serialNumber|String|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|requestedEnrollmentProfileId|String|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|requestedEnrollmentProfileAssignmentDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|isSupervised|Boolean|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|discoverySource|discoverySource|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md). Possible values are: `unknown`, `adminImport`, `deviceEnrollmentProgram`.|
|isDeleted|Boolean|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|lastContactedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|description|String|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|enrollmentState|enrollmentState|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md). Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|platform|platform|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md). Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|status|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_importedappledeviceidentityresult"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/importedAppleDeviceIdentityResult
Content-Type: application/json
Content-length: 470

{
  "@odata.type": "#microsoft.graph.importedAppleDeviceIdentityResult",
  "serialNumber": "String",
  "requestedEnrollmentProfileId": "String",
  "requestedEnrollmentProfileAssignmentDateTime": "String (timestamp)",
  "isSupervised": "Boolean",
  "discoverySource": "String",
  "isDeleted": "Boolean",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.importedAppleDeviceIdentityResult",
  "id": "c35efe92-fe92-c35e-92fe-5ec392fe5ec3",
  "serialNumber": "String",
  "requestedEnrollmentProfileId": "String",
  "requestedEnrollmentProfileAssignmentDateTime": "String (timestamp)",
  "isSupervised": "Boolean",
  "discoverySource": "String",
  "isDeleted": "Boolean",
  "createdDateTime": "String (timestamp)",
  "lastContactedDateTime": "String (timestamp)",
  "description": "String",
  "enrollmentState": "String",
  "platform": "String",
  "status": "Boolean"
}
```

