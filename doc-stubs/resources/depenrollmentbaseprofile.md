---
title: "depEnrollmentBaseProfile resource type"
description: "The DepEnrollmentBaseProfile resource represents an Apple Device Enrollment Program (DEP) enrollment profile. This type of profile must be assigned to Apple DEP serial numbers before the corresponding devices can enroll via DEP."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# depEnrollmentBaseProfile resource type

Namespace: microsoft.graph



The DepEnrollmentBaseProfile resource represents an Apple Device Enrollment Program (DEP) enrollment profile. This type of profile must be assigned to Apple DEP serial numbers before the corresponding devices can enroll via DEP.


Inherits from [enrollmentProfile](../resources/enrollmentprofile.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List depEnrollmentBaseProfiles](../api/depenrollmentbaseprofile-list.md)|[depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) collection|Get a list of the [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) objects and their properties.|
|[Create depEnrollmentBaseProfile](../api/depenrollmentbaseprofile-create.md)|[depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|Create a new [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object.|
|[Get depEnrollmentBaseProfile](../api/depenrollmentbaseprofile-get.md)|[depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|Read the properties and relationships of a [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object.|
|[Update depEnrollmentBaseProfile](../api/depenrollmentbaseprofile-update.md)|[depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md)|Update the properties of a [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object.|
|[Delete depEnrollmentBaseProfile](../api/depenrollmentbaseprofile-delete.md)|None|Deletes a [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object.|
|[setDefaultProfile](../api/depenrollmentbaseprofile-setdefaultprofile.md)|None|**TODO: Add Description**|
|[updateDeviceProfileAssignment](../api/depenrollmentbaseprofile-updatedeviceprofileassignment.md)|None|**TODO: Add Description**|
|[exportMobileConfig](../api/depenrollmentbaseprofile-exportmobileconfig.md)|String|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appleIdDisabled|Boolean|Indicates if Apple id setup pane is disabled|
|applePayDisabled|Boolean|Indicates if Apple pay setup pane is disabled|
|configurationEndpointUrl|String|Configuration endpoint url to use for Enrollment Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|configurationWebUrl|Boolean|URL for setup assistant login|
|description|String|Description of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|deviceNameTemplate|String|Sets a literal or name pattern.|
|diagnosticsDisabled|Boolean|Indicates if diagnostics setup pane is disabled|
|displayName|String|Name of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|displayToneSetupDisabled|Boolean|Indicates if displaytone setup screen is disabled|
|enableAuthenticationViaCompanyPortal|Boolean|Indicates to authenticate with Apple Setup Assistant instead of Company Portal. Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefault|Boolean|Indicates if this is the default profile|
|isMandatory|Boolean|Indicates if the profile is mandatory|
|locationDisabled|Boolean|Indicates if Location service setup pane is disabled|
|privacyPaneDisabled|Boolean|Indicates if privacy screen is disabled|
|profileRemovalDisabled|Boolean|Indicates if the profile removal option is disabled|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|Indicates that Company Portal is required on setup assistant enrolled devices Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|Indicates if the profile requires user authentication Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|restoreBlocked|Boolean|Indicates if Restore setup pane is blocked|
|screenTimeScreenDisabled|Boolean|Indicates if screen timeout setup is disabled|
|siriDisabled|Boolean|Indicates if siri setup pane is disabled|
|supervisedModeEnabled|Boolean|Supervised mode, True to enable, false otherwise. See https://docs.microsoft.com/en-us/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.|
|supportDepartment|String|Support department information|
|supportPhoneNumber|String|Support phone number|
|termsAndConditionsDisabled|Boolean|Indicates if 'Terms and Conditions' setup pane is disabled|
|touchIdDisabled|Boolean|Indicates if touch id setup pane is disabled|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.depEnrollmentBaseProfile",
  "baseType": "microsoft.graph.enrollmentProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.depEnrollmentBaseProfile",
  "id": "String (identifier)",
  "configurationEndpointUrl": "String",
  "description": "String",
  "displayName": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "requiresUserAuthentication": "Boolean",
  "appleIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "configurationWebUrl": "Boolean",
  "deviceNameTemplate": "String",
  "diagnosticsDisabled": "Boolean",
  "displayToneSetupDisabled": "Boolean",
  "isDefault": "Boolean",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "privacyPaneDisabled": "Boolean",
  "profileRemovalDisabled": "Boolean",
  "restoreBlocked": "Boolean",
  "screenTimeScreenDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "supportPhoneNumber": "String",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean"
}
```

