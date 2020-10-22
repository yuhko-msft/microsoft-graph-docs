---
title: "depEnrollmentProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# depEnrollmentProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [enrollmentProfile](../resources/enrollmentprofile.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List depEnrollmentProfiles](../api/depenrollmentprofile-list.md)|[depEnrollmentProfile](../resources/depenrollmentprofile.md) collection|Get a list of the [depEnrollmentProfile](../resources/depenrollmentprofile.md) objects and their properties.|
|[Create depEnrollmentProfile](../api/depenrollmentprofile-create.md)|[depEnrollmentProfile](../resources/depenrollmentprofile.md)|Create a new [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.|
|[Get depEnrollmentProfile](../api/depenrollmentprofile-get.md)|[depEnrollmentProfile](../resources/depenrollmentprofile.md)|Read the properties and relationships of a [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.|
|[Update depEnrollmentProfile](../api/depenrollmentprofile-update.md)|[depEnrollmentProfile](../resources/depenrollmentprofile.md)|Update the properties of a [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.|
|[Delete depEnrollmentProfile](../api/depenrollmentprofile-delete.md)|None|Deletes a [depEnrollmentProfile](../resources/depenrollmentprofile.md) object.|
|[setDefaultProfile](../api/depenrollmentprofile-setdefaultprofile.md)|None|**TODO: Add Description**|
|[exportMobileConfig](../api/depenrollmentprofile-exportmobileconfig.md)|String|**TODO: Add Description**|
|[updateDeviceProfileAssignment](../api/depenrollmentprofile-updatedeviceprofileassignment.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appleIdDisabled|Boolean|**TODO: Add Description**|
|applePayDisabled|Boolean|**TODO: Add Description**|
|awaitDeviceConfiguredConfirmation|Boolean|**TODO: Add Description**|
|configurationEndpointUrl|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|description|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|diagnosticsDisabled|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|enableAuthenticationViaCompanyPortal|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|enableSharedIPad|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefault|Boolean|**TODO: Add Description**|
|isMandatory|Boolean|**TODO: Add Description**|
|iTunesPairingMode|iTunesPairingMode|**TODO: Add Description**. Possible values are: `disallow`, `allow`, `requiresCertificate`.|
|locationDisabled|Boolean|**TODO: Add Description**|
|macOSFileVaultDisabled|Boolean|**TODO: Add Description**|
|macOSRegistrationDisabled|Boolean|**TODO: Add Description**|
|managementCertificates|[managementCertificateWithThumbprint](../resources/intune-managementcertificatewiththumbprint.md) collection|**TODO: Add Description**|
|passCodeDisabled|Boolean|**TODO: Add Description**|
|profileRemovalDisabled|Boolean|**TODO: Add Description**|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|restoreBlocked|Boolean|**TODO: Add Description**|
|restoreFromAndroidDisabled|Boolean|**TODO: Add Description**|
|sharedIPadMaximumUserCount|Int32|**TODO: Add Description**|
|siriDisabled|Boolean|**TODO: Add Description**|
|supervisedModeEnabled|Boolean|**TODO: Add Description**|
|supportDepartment|String|**TODO: Add Description**|
|supportPhoneNumber|String|**TODO: Add Description**|
|termsAndConditionsDisabled|Boolean|**TODO: Add Description**|
|touchIdDisabled|Boolean|**TODO: Add Description**|
|zoomDisabled|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.depEnrollmentProfile",
  "baseType": "microsoft.graph.enrollmentProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.depEnrollmentProfile",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "requiresUserAuthentication": "Boolean",
  "configurationEndpointUrl": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "isDefault": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "passCodeDisabled": "Boolean",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "supportPhoneNumber": "String",
  "iTunesPairingMode": "String",
  "profileRemovalDisabled": "Boolean",
  "managementCertificates": [
    {
      "@odata.type": "microsoft.graph.managementCertificateWithThumbprint"
    }
  ],
  "restoreBlocked": "Boolean",
  "restoreFromAndroidDisabled": "Boolean",
  "appleIdDisabled": "Boolean",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "zoomDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "diagnosticsDisabled": "Boolean",
  "macOSRegistrationDisabled": "Boolean",
  "macOSFileVaultDisabled": "Boolean",
  "awaitDeviceConfiguredConfirmation": "Boolean",
  "sharedIPadMaximumUserCount": "Integer",
  "enableSharedIPad": "Boolean"
}
```

