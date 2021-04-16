---
title: "Create windows10EnrollmentCompletionPageConfiguration"
description: "Create a new windows10EnrollmentCompletionPageConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10EnrollmentCompletionPageConfiguration
Namespace: microsoft.graph



Create a new [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windows10EnrollmentCompletionPageConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) object.

The following table shows the properties that are required when you create the [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|allowDeviceResetOnInstallFailure|Boolean|Allow or block device reset on installation failure|
|allowDeviceUseOnInstallFailure|Boolean|Allow the user to continue using the device on installation failure|
|allowLogCollectionOnInstallFailure|Boolean|Allow or block log collection on installation failure|
|blockDeviceSetupRetryByUser|Boolean|Allow the user to retry the setup on installation failure|
|customErrorMessage|String|Set custom error message to show upon installation failure|
|disableUserStatusTrackingAfterFirstUser|Boolean|Only show installation progress for first user post enrollment|
|installProgressTimeoutInMinutes|Int32|Set installation progress timeout in minutes|
|selectedMobileAppIds|String collection|Selected applications to track the installation status|
|showInstallationProgress|Boolean|Show or hide installation progress to user|
|trackInstallProgressForAutopilotOnly|Boolean|Only show installation progress for Autopilot enrollment scenarios|



## Response

If successful, this method returns a `201 Created` response code and a [windows10EnrollmentCompletionPageConfiguration](../resources/windows10enrollmentcompletionpageconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10enrollmentcompletionpageconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows10EnrollmentCompletionPageConfiguration not found
Content-Type: application/json
Content-length: 720

{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfiguration",
  "description": "String",
  "displayName": "String",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "allowDeviceResetOnInstallFailure": "Boolean",
  "allowDeviceUseOnInstallFailure": "Boolean",
  "allowLogCollectionOnInstallFailure": "Boolean",
  "blockDeviceSetupRetryByUser": "Boolean",
  "customErrorMessage": "String",
  "disableUserStatusTrackingAfterFirstUser": "Boolean",
  "installProgressTimeoutInMinutes": "Integer",
  "selectedMobileAppIds": [
    "String"
  ],
  "showInstallationProgress": "Boolean",
  "trackInstallProgressForAutopilotOnly": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10EnrollmentCompletionPageConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfiguration",
  "id": "a53b93c8-93c8-a53b-c893-3ba5c8933ba5",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "allowDeviceResetOnInstallFailure": "Boolean",
  "allowDeviceUseOnInstallFailure": "Boolean",
  "allowLogCollectionOnInstallFailure": "Boolean",
  "blockDeviceSetupRetryByUser": "Boolean",
  "customErrorMessage": "String",
  "disableUserStatusTrackingAfterFirstUser": "Boolean",
  "installProgressTimeoutInMinutes": "Integer",
  "selectedMobileAppIds": [
    "String"
  ],
  "showInstallationProgress": "Boolean",
  "trackInstallProgressForAutopilotOnly": "Boolean"
}
```

