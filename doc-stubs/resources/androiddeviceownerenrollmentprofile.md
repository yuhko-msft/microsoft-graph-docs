---
title: "androidDeviceOwnerEnrollmentProfile resource type"
description: "Enrollment Profile used to enroll Android Enterprise devices using Google's Cloud Management."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerEnrollmentProfile resource type

Namespace: microsoft.graph



Enrollment Profile used to enroll Android Enterprise devices using Google's Cloud Management.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceOwnerEnrollmentProfiles](../api/androiddeviceownerenrollmentprofile-list.md)|[androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) collection|Get a list of the [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) objects and their properties.|
|[Create androidDeviceOwnerEnrollmentProfile](../api/androiddeviceownerenrollmentprofile-create.md)|[androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md)|Create a new [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) object.|
|[Get androidDeviceOwnerEnrollmentProfile](../api/androiddeviceownerenrollmentprofile-get.md)|[androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md)|Read the properties and relationships of an [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) object.|
|[Update androidDeviceOwnerEnrollmentProfile](../api/androiddeviceownerenrollmentprofile-update.md)|[androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md)|Update the properties of an [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) object.|
|[Delete androidDeviceOwnerEnrollmentProfile](../api/androiddeviceownerenrollmentprofile-delete.md)|None|Deletes an [androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) object.|
|[createToken](../api/androiddeviceownerenrollmentprofile-createtoken.md)|None|**TODO: Add Description**|
|[revokeToken](../api/androiddeviceownerenrollmentprofile-revoketoken.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountId|String|Tenant GUID the enrollment profile belongs to.|
|createdDateTime|DateTimeOffset|Date time the enrollment profile was created.|
|description|String|Description for the enrollment profile.|
|displayName|String|Display name for the enrollment profile.|
|enrolledDeviceCount|Int32|Total number of Android devices that have enrolled using this enrollment profile.|
|enrollmentMode|androidDeviceOwnerEnrollmentMode|The enrollment mode of devices that use this enrollment profile. Possible values are: `corporateOwnedDedicatedDevice`, `corporateOwnedFullyManaged`, `corporateOwnedWorkProfile`.|
|enrollmentTokenType|androidDeviceOwnerEnrollmentTokenType|The enrollment token type for an enrollment profile. Possible values are: `default`, `corporateOwnedDedicatedDeviceWithAzureADSharedMode`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Date time the enrollment profile was last modified.|
|qrCodeContent|String|String used to generate a QR code for the token.|
|qrCodeImage|[mimeContent](../resources/mimecontent.md)|String used to generate a QR code for the token.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|tokenCreationDateTime|DateTimeOffset|Date time the most recently created token was created.|
|tokenExpirationDateTime|DateTimeOffset|Date time the most recently created token will expire.|
|tokenValue|String|Value of the most recently created token for this enrollment profile.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidDeviceOwnerEnrollmentProfile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerEnrollmentProfile",
  "id": "String (identifier)",
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

