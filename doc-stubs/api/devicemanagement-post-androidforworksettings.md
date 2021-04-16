---
title: "Create androidForWorkSettings"
description: "Create a new androidForWorkSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidForWorkSettings
Namespace: microsoft.graph



Create a new androidForWorkSettings object.

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
POST /deviceManagement/androidForWorkSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidForWorkSettings](../resources/androidforworksettings.md) object.

The following table shows the properties that are required when you create the [androidForWorkSettings](../resources/androidforworksettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|bindStatus|androidForWorkBindStatus|Bind status of the tenant with the Google EMM API. Possible values are: `notBound`, `bound`, `boundAndValidated`, `unbinding`.|
|deviceOwnerManagementEnabled|Boolean|Indicates if this account is flighting for Android Device Owner Management with CloudDPC.|
|enrollmentTarget|androidForWorkEnrollmentTarget|Indicates which users can enroll devices in Android for Work device management. Possible values are: `none`, `all`, `targeted`, `targetedAsEnrollmentRestrictions`.|
|lastAppSyncDateTime|DateTimeOffset|Last completion time for app sync|
|lastAppSyncStatus|androidForWorkSyncStatus|Last application sync result. Possible values are: `success`, `credentialsNotValid`, `androidForWorkApiError`, `managementServiceError`, `unknownError`, `none`.|
|lastModifiedDateTime|DateTimeOffset|Last modification time for Android for Work settings|
|ownerOrganizationName|String|Organization name used when onboarding Android for Work|
|ownerUserPrincipalName|String|Owner UPN that created the enterprise|
|targetGroupIds|String collection|Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'|



## Response

If successful, this method returns a `201 Created` response code and an [androidForWorkSettings](../resources/androidforworksettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidforworksettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/androidForWorkSettings
Content-Type: application/json
Content-length: 372

{
  "@odata.type": "#microsoft.graph.androidForWorkSettings",
  "bindStatus": "String",
  "deviceOwnerManagementEnabled": "Boolean",
  "enrollmentTarget": "String",
  "lastAppSyncDateTime": "String (timestamp)",
  "lastAppSyncStatus": "String",
  "ownerOrganizationName": "String",
  "ownerUserPrincipalName": "String",
  "targetGroupIds": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidForWorkSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidForWorkSettings",
  "id": "6cf1943e-943e-6cf1-3e94-f16c3e94f16c",
  "bindStatus": "String",
  "deviceOwnerManagementEnabled": "Boolean",
  "enrollmentTarget": "String",
  "lastAppSyncDateTime": "String (timestamp)",
  "lastAppSyncStatus": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "ownerOrganizationName": "String",
  "ownerUserPrincipalName": "String",
  "targetGroupIds": [
    "String"
  ]
}
```

