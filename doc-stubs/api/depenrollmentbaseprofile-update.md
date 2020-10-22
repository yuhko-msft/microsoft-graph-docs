---
title: "Update depEnrollmentBaseProfile"
description: "Update the properties of a depEnrollmentBaseProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update depEnrollmentBaseProfile
Namespace: microsoft.graph

Update the properties of a [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object.

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
PATCH /depEnrollmentBaseProfile
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
|displayName|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|description|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|requiresUserAuthentication|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|configurationEndpointUrl|String|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|enableAuthenticationViaCompanyPortal|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|requireCompanyPortalOnSetupAssistantEnrolledDevices|Boolean|**TODO: Add Description** Inherited from [enrollmentProfile](../resources/intune-enrollmentprofile.md)|
|isDefault|Boolean|**TODO: Add Description**|
|supervisedModeEnabled|Boolean|**TODO: Add Description**|
|supportDepartment|String|**TODO: Add Description**|
|isMandatory|Boolean|**TODO: Add Description**|
|locationDisabled|Boolean|**TODO: Add Description**|
|supportPhoneNumber|String|**TODO: Add Description**|
|profileRemovalDisabled|Boolean|**TODO: Add Description**|
|restoreBlocked|Boolean|**TODO: Add Description**|
|appleIdDisabled|Boolean|**TODO: Add Description**|
|termsAndConditionsDisabled|Boolean|**TODO: Add Description**|
|touchIdDisabled|Boolean|**TODO: Add Description**|
|applePayDisabled|Boolean|**TODO: Add Description**|
|siriDisabled|Boolean|**TODO: Add Description**|
|diagnosticsDisabled|Boolean|**TODO: Add Description**|
|displayToneSetupDisabled|Boolean|**TODO: Add Description**|
|privacyPaneDisabled|Boolean|**TODO: Add Description**|
|screenTimeScreenDisabled|Boolean|**TODO: Add Description**|
|deviceNameTemplate|String|**TODO: Add Description**|
|configurationWebUrl|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [depEnrollmentBaseProfile](../resources/depenrollmentbaseprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_depenrollmentbaseprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/depEnrollmentBaseProfile
Content-Type: application/json
Content-length: 1004

{
  "@odata.type": "#microsoft.graph.depEnrollmentBaseProfile",
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
  "@odata.type": "#microsoft.graph.depEnrollmentBaseProfile",
  "id": "3b355012-5012-3b35-1250-353b1250353b",
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

