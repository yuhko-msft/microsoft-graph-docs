---
title: "Create depEnrollmentBaseProfile"
description: "Create a new depEnrollmentBaseProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create depEnrollmentBaseProfile
Namespace: microsoft.graph



Create a new [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object.

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
POST ** Collection URI for microsoft.graph.depEnrollmentBaseProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object.

The following table shows the properties that are required when you create the [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationEndpointUrl|String|Configuration endpoint url to use for Enrollment Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|description|String|Description of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|displayName|String|Name of the profile Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|enableAuthenticationViaCompanyPortal|Boolean|Indicates to authenticate with Apple Setup Assistant instead of Company Portal. Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|Indicates that Company Portal is required on setup assistant enrolled devices Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|Indicates if the profile requires user authentication Inherited from [enrollmentProfile](../resources/enrollmentprofile.md)|
|appleIdDisabled|Boolean|Indicates if Apple id setup pane is disabled|
|applePayDisabled|Boolean|Indicates if Apple pay setup pane is disabled|
|configurationWebUrl|Boolean|URL for setup assistant login|
|deviceNameTemplate|String|Sets a literal or name pattern.|
|diagnosticsDisabled|Boolean|Indicates if diagnostics setup pane is disabled|
|displayToneSetupDisabled|Boolean|Indicates if displaytone setup screen is disabled|
|isDefault|Boolean|Indicates if this is the default profile|
|isMandatory|Boolean|Indicates if the profile is mandatory|
|locationDisabled|Boolean|Indicates if Location service setup pane is disabled|
|privacyPaneDisabled|Boolean|Indicates if privacy screen is disabled|
|profileRemovalDisabled|Boolean|Indicates if the profile removal option is disabled|
|restoreBlocked|Boolean|Indicates if Restore setup pane is blocked|
|screenTimeScreenDisabled|Boolean|Indicates if screen timeout setup is disabled|
|siriDisabled|Boolean|Indicates if siri setup pane is disabled|
|supervisedModeEnabled|Boolean|Supervised mode, True to enable, false otherwise. See https://docs.microsoft.com/en-us/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.|
|supportDepartment|String|Support department information|
|supportPhoneNumber|String|Support phone number|
|termsAndConditionsDisabled|Boolean|Indicates if 'Terms and Conditions' setup pane is disabled|
|touchIdDisabled|Boolean|Indicates if touch id setup pane is disabled|



## Response

If successful, this method returns a `201 Created` response code and a [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_depenrollmentbaseprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.depEnrollmentBaseProfile not found
Content-Type: application/json
Content-length: 1004

{
  "@odata.type": "#microsoft.graph.depEnrollmentBaseProfile",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.depEnrollmentBaseProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.depEnrollmentBaseProfile",
  "id": "cff6adca-adca-cff6-caad-f6cfcaadf6cf",
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

