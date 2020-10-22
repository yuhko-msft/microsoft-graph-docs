---
title: "depEnrollmentBaseProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# depEnrollmentBaseProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


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
|[exportMobileConfig](../api/depenrollmentbaseprofile-exportmobileconfig.md)|String|**TODO: Add Description**|
|[updateDeviceProfileAssignment](../api/depenrollmentbaseprofile-updatedeviceprofileassignment.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appleIdDisabled|Boolean|**TODO: Add Description**|
|applePayDisabled|Boolean|**TODO: Add Description**|
|configurationEndpointUrl|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|configurationWebUrl|Boolean|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|deviceNameTemplate|String|**TODO: Add Description**|
|diagnosticsDisabled|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|displayToneSetupDisabled|Boolean|**TODO: Add Description**|
|enableAuthenticationViaCompanyPortal|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefault|Boolean|**TODO: Add Description**|
|isMandatory|Boolean|**TODO: Add Description**|
|locationDisabled|Boolean|**TODO: Add Description**|
|privacyPaneDisabled|Boolean|**TODO: Add Description**|
|profileRemovalDisabled|Boolean|**TODO: Add Description**|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|restoreBlocked|Boolean|**TODO: Add Description**|
|screenTimeScreenDisabled|Boolean|**TODO: Add Description**|
|siriDisabled|Boolean|**TODO: Add Description**|
|supervisedModeEnabled|Boolean|**TODO: Add Description**|
|supportDepartment|String|**TODO: Add Description**|
|supportPhoneNumber|String|**TODO: Add Description**|
|termsAndConditionsDisabled|Boolean|**TODO: Add Description**|
|touchIdDisabled|Boolean|**TODO: Add Description**|

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
  "displayName": "String",
  "description": "String",
  "requiresUserAuthentication": "Boolean",
  "configurationEndpointUrl": "String",
  "enableAuthenticationViaCompanyPortal": "Boolean",
  "requireCompanyPortalOnSetupAssistantEnrolledDevices": "Boolean",
  "isDefault": "Boolean",
  "supervisedModeEnabled": "Boolean",
  "supportDepartment": "String",
  "isMandatory": "Boolean",
  "locationDisabled": "Boolean",
  "supportPhoneNumber": "String",
  "profileRemovalDisabled": "Boolean",
  "restoreBlocked": "Boolean",
  "appleIdDisabled": "Boolean",
  "termsAndConditionsDisabled": "Boolean",
  "touchIdDisabled": "Boolean",
  "applePayDisabled": "Boolean",
  "siriDisabled": "Boolean",
  "diagnosticsDisabled": "Boolean",
  "displayToneSetupDisabled": "Boolean",
  "privacyPaneDisabled": "Boolean",
  "screenTimeScreenDisabled": "Boolean",
  "deviceNameTemplate": "String",
  "configurationWebUrl": "Boolean"
}
```

