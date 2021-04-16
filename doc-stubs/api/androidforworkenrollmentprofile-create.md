---
title: "Create androidForWorkEnrollmentProfile"
description: "Create a new androidForWorkEnrollmentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidForWorkEnrollmentProfile
Namespace: microsoft.graph



Create a new [androidForWorkEnrollmentProfile](../resources/androidforworkenrollmentprofile.md) object.

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
POST /deviceManagement/androidForWorkEnrollmentProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidForWorkEnrollmentProfile](../resources/androidforworkenrollmentprofile.md) object.

The following table shows the properties that are required when you create the [androidForWorkEnrollmentProfile](../resources/androidforworkenrollmentprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accountId|String|Tenant GUID the enrollment profile belongs to.|
|createdDateTime|DateTimeOffset|Date time the enrollment profile was created.|
|description|String|Description for the enrollment profile.|
|displayName|String|Display name for the enrollment profile.|
|enrolledDeviceCount|Int32|Total number of Android devices that have enrolled using this enrollment profile.|
|lastModifiedDateTime|DateTimeOffset|Date time the enrollment profile was last modified.|
|qrCodeContent|String|String used to generate a QR code for the token.|
|qrCodeImage|[mimeContent](../resources/mimecontent.md)|String used to generate a QR code for the token.|
|tokenExpirationDateTime|DateTimeOffset|Date time the most recently created token will expire.|
|tokenValue|String|Value of the most recently created token for this enrollment profile.|



## Response

If successful, this method returns a `201 Created` response code and an [androidForWorkEnrollmentProfile](../resources/androidforworkenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidforworkenrollmentprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/androidForWorkEnrollmentProfiles
Content-Type: application/json
Content-length: 377

{
  "@odata.type": "#microsoft.graph.androidForWorkEnrollmentProfile",
  "accountId": "String",
  "description": "String",
  "displayName": "String",
  "enrolledDeviceCount": "Integer",
  "qrCodeContent": "String",
  "qrCodeImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "tokenExpirationDateTime": "String (timestamp)",
  "tokenValue": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidForWorkEnrollmentProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidForWorkEnrollmentProfile",
  "id": "2ef7c9d9-c9d9-2ef7-d9c9-f72ed9c9f72e",
  "accountId": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "enrolledDeviceCount": "Integer",
  "lastModifiedDateTime": "String (timestamp)",
  "qrCodeContent": "String",
  "qrCodeImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "tokenExpirationDateTime": "String (timestamp)",
  "tokenValue": "String"
}
```

