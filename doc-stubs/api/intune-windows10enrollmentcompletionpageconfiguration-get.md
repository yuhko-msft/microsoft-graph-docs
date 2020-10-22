---
title: "Get windows10EnrollmentCompletionPageConfiguration"
description: "Read the properties and relationships of a windows10EnrollmentCompletionPageConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10EnrollmentCompletionPageConfiguration
Namespace: microsoft.graph

Read the properties and relationships of a [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.windows10EnrollmentCompletionPageConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [windows10EnrollmentCompletionPageConfiguration](../resources/intune-windows10enrollmentcompletionpageconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10enrollmentcompletionpageconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows10EnrollmentCompletionPageConfiguration not found
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
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}
```

