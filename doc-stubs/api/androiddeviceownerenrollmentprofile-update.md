---
title: "Update androidDeviceOwnerEnrollmentProfile"
description: "Update the properties of an androidDeviceOwnerEnrollmentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidDeviceOwnerEnrollmentProfile
Namespace: microsoft.graph



Update the properties of an [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) object.

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
PATCH /deviceManagement/androidDeviceOwnerEnrollmentProfiles/{androidDeviceOwnerEnrollmentProfileId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) object.

The following table shows the properties that are required when you update the [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accountId|String|Tenant GUID the enrollment profile belongs to.|
|createdDateTime|DateTimeOffset|Date time the enrollment profile was created.|
|description|String|Description for the enrollment profile.|
|displayName|String|Display name for the enrollment profile.|
|enrolledDeviceCount|Int32|Total number of Android devices that have enrolled using this enrollment profile.|
|enrollmentMode|androidDeviceOwnerEnrollmentMode|The enrollment mode of devices that use this enrollment profile. Possible values are: `corporateOwnedDedicatedDevice`, `corporateOwnedFullyManaged`, `corporateOwnedWorkProfile`.|
|enrollmentTokenType|androidDeviceOwnerEnrollmentTokenType|The enrollment token type for an enrollment profile. Possible values are: `default`, `corporateOwnedDedicatedDeviceWithAzureADSharedMode`.|
|lastModifiedDateTime|DateTimeOffset|Date time the enrollment profile was last modified.|
|qrCodeContent|String|String used to generate a QR code for the token.|
|qrCodeImage|[mimeContent](../resources/mimecontent.md)|String used to generate a QR code for the token.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|tokenCreationDateTime|DateTimeOffset|Date time the most recently created token was created.|
|tokenExpirationDateTime|DateTimeOffset|Date time the most recently created token will expire.|
|tokenValue|String|Value of the most recently created token for this enrollment profile.|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androiddeviceownerenrollmentprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/androidDeviceOwnerEnrollmentProfiles/{androidDeviceOwnerEnrollmentProfileId}
Content-Type: application/json
Content-length: 542

{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerEnrollmentProfile",
  "accountId": "String",
  "description": "String",
  "displayName": "String",
  "enrolledDeviceCount": "Integer",
  "enrollmentMode": "String",
  "enrollmentTokenType": "String",
  "qrCodeContent": "String",
  "qrCodeImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "roleScopeTagIds": [
    "String"
  ],
  "tokenCreationDateTime": "String (timestamp)",
  "tokenExpirationDateTime": "String (timestamp)",
  "tokenValue": "String"
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
  "@odata.type": "#microsoft.graph.androidDeviceOwnerEnrollmentProfile",
  "id": "e6d54e73-4e73-e6d5-734e-d5e6734ed5e6",
  "accountId": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "enrolledDeviceCount": "Integer",
  "enrollmentMode": "String",
  "enrollmentTokenType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "qrCodeContent": "String",
  "qrCodeImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "roleScopeTagIds": [
    "String"
  ],
  "tokenCreationDateTime": "String (timestamp)",
  "tokenExpirationDateTime": "String (timestamp)",
  "tokenValue": "String"
}
```

