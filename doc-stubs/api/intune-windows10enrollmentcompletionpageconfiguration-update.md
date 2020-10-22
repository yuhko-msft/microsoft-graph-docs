---
title: "Update windows10EnrollmentCompletionPageConfiguration"
description: "Update the properties of a windows10EnrollmentCompletionPageConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows10EnrollmentCompletionPageConfiguration
Namespace: microsoft.graph

Update the properties of a [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windows10EnrollmentCompletionPageConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object.

The following table shows the properties that are required when you create the [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|showInstallationProgress|Boolean|**TODO: Add Description**|
|blockDeviceSetupRetryByUser|Boolean|**TODO: Add Description**|
|allowDeviceResetOnInstallFailure|Boolean|**TODO: Add Description**|
|allowLogCollectionOnInstallFailure|Boolean|**TODO: Add Description**|
|customErrorMessage|String|**TODO: Add Description**|
|installProgressTimeoutInMinutes|Int32|**TODO: Add Description**|
|allowDeviceUseOnInstallFailure|Boolean|**TODO: Add Description**|
|selectedMobileAppIds|String collection|**TODO: Add Description**|
|trackInstallProgressForAutopilotOnly|Boolean|**TODO: Add Description**|
|disableUserStatusTrackingAfterFirstUser|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows10enrollmentcompletionpageconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows10EnrollmentCompletionPageConfiguration not found
Content-Type: application/json
Content-length: 720

{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfiguration",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "showInstallationProgress": "Boolean",
  "blockDeviceSetupRetryByUser": "Boolean",
  "allowDeviceResetOnInstallFailure": "Boolean",
  "allowLogCollectionOnInstallFailure": "Boolean",
  "customErrorMessage": "String",
  "installProgressTimeoutInMinutes": "Integer",
  "allowDeviceUseOnInstallFailure": "Boolean",
  "selectedMobileAppIds": [
    "String"
  ],
  "trackInstallProgressForAutopilotOnly": "Boolean",
  "disableUserStatusTrackingAfterFirstUser": "Boolean"
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
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfiguration",
  "id": "7c83775a-775a-7c83-5a77-837c5a77837c",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "showInstallationProgress": "Boolean",
  "blockDeviceSetupRetryByUser": "Boolean",
  "allowDeviceResetOnInstallFailure": "Boolean",
  "allowLogCollectionOnInstallFailure": "Boolean",
  "customErrorMessage": "String",
  "installProgressTimeoutInMinutes": "Integer",
  "allowDeviceUseOnInstallFailure": "Boolean",
  "selectedMobileAppIds": [
    "String"
  ],
  "trackInstallProgressForAutopilotOnly": "Boolean",
  "disableUserStatusTrackingAfterFirstUser": "Boolean"
}
```

