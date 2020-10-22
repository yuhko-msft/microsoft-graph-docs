---
title: "Get windowsPhone81GeneralConfiguration"
description: "Read the properties and relationships of a windowsPhone81GeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsPhone81GeneralConfiguration
Namespace: microsoft.graph

Read the properties and relationships of a [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.windowsPhone81GeneralConfiguration not found
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

If successful, this method returns a `200 OK` response code and a [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsphone81generalconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsPhone81GeneralConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsPhone81GeneralConfiguration"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.windowsPhone81GeneralConfiguration",
    "id": "933bf172-f172-933b-72f1-3b9372f13b93",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "version": "Integer",
    "applyOnlyToWindowsPhone81": "Boolean",
    "appsBlockCopyPaste": "Boolean",
    "bluetoothBlocked": "Boolean",
    "cameraBlocked": "Boolean",
    "cellularBlockWifiTethering": "Boolean",
    "compliantAppsList": [
      {
        "@odata.type": "microsoft.graph.appListItem"
      }
    ],
    "compliantAppListType": "String",
    "diagnosticDataBlockSubmission": "Boolean",
    "emailBlockAddingAccounts": "Boolean",
    "locationServicesBlocked": "Boolean",
    "microsoftAccountBlocked": "Boolean",
    "nfcBlocked": "Boolean",
    "passwordBlockSimple": "Boolean",
    "passwordExpirationDays": "Integer",
    "passwordMinimumLength": "Integer",
    "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
    "passwordMinimumCharacterSetCount": "Integer",
    "passwordPreviousPasswordBlockCount": "Integer",
    "passwordSignInFailureCountBeforeFactoryReset": "Integer",
    "passwordRequiredType": "String",
    "passwordRequired": "Boolean",
    "screenCaptureBlocked": "Boolean",
    "storageBlockRemovableStorage": "Boolean",
    "storageRequireEncryption": "Boolean",
    "webBrowserBlocked": "Boolean",
    "wifiBlocked": "Boolean",
    "wifiBlockAutomaticConnectHotspots": "Boolean",
    "wifiBlockHotspotReporting": "Boolean",
    "windowsStoreBlocked": "Boolean"
  }
}
```

