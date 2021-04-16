---
title: "Create androidManagedStoreAccountEnterpriseSettings"
description: "Create a new androidManagedStoreAccountEnterpriseSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidManagedStoreAccountEnterpriseSettings
Namespace: microsoft.graph



Create a new [androidManagedStoreAccountEnterpriseSettings](../resources/androidmanagedstoreaccountenterprisesettings.md) object.

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
POST ** Collection URI for microsoft.graph.androidManagedStoreAccountEnterpriseSettings not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidManagedStoreAccountEnterpriseSettings](../resources/androidmanagedstoreaccountenterprisesettings.md) object.

The following table shows the properties that are required when you create the [androidManagedStoreAccountEnterpriseSettings](../resources/androidmanagedstoreaccountenterprisesettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|androidDeviceOwnerFullyManagedEnrollmentEnabled|Boolean|Company codes for AndroidManagedStoreAccountEnterpriseSettings|
|bindStatus|androidManagedStoreAccountBindStatus|Bind status of the tenant with the Google EMM API. Possible values are: `notBound`, `bound`, `boundAndValidated`, `unbinding`.|
|companyCodes|[androidEnrollmentCompanyCode](../resources/androidenrollmentcompanycode.md) collection|Company codes for AndroidManagedStoreAccountEnterpriseSettings|
|deviceOwnerManagementEnabled|Boolean|Indicates if this account is flighting for Android Device Owner Management with CloudDPC.|
|enrollmentTarget|androidManagedStoreAccountEnrollmentTarget|Indicates which users can enroll devices in Android Enterprise device management. Possible values are: `none`, `all`, `targeted`, `targetedAsEnrollmentRestrictions`.|
|lastAppSyncDateTime|DateTimeOffset|Last completion time for app sync|
|lastAppSyncStatus|androidManagedStoreAccountAppSyncStatus|Last application sync result. Possible values are: `success`, `credentialsNotValid`, `androidForWorkApiError`, `managementServiceError`, `unknownError`, `none`.|
|lastModifiedDateTime|DateTimeOffset|Last modification time for Android enterprise settings|
|ownerOrganizationName|String|Organization name used when onboarding Android Enterprise|
|ownerUserPrincipalName|String|Owner UPN that created the enterprise|
|targetGroupIds|String collection|Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'|



## Response

If successful, this method returns a `201 Created` response code and an [androidManagedStoreAccountEnterpriseSettings](../resources/androidmanagedstoreaccountenterprisesettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidmanagedstoreaccountenterprisesettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidManagedStoreAccountEnterpriseSettings not found
Content-Type: application/json
Content-length: 569

{
  "@odata.type": "#microsoft.graph.androidManagedStoreAccountEnterpriseSettings",
  "androidDeviceOwnerFullyManagedEnrollmentEnabled": "Boolean",
  "bindStatus": "String",
  "companyCodes": [
    {
      "@odata.type": "microsoft.graph.androidEnrollmentCompanyCode"
    }
  ],
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
  "@odata.type": "microsoft.graph.androidManagedStoreAccountEnterpriseSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidManagedStoreAccountEnterpriseSettings",
  "id": "a5517a20-7a20-a551-207a-51a5207a51a5",
  "androidDeviceOwnerFullyManagedEnrollmentEnabled": "Boolean",
  "bindStatus": "String",
  "companyCodes": [
    {
      "@odata.type": "microsoft.graph.androidEnrollmentCompanyCode"
    }
  ],
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

