---
title: "Get aospDeviceOwnerDeviceConfiguration"
description: "Read the properties and relationships of an aospDeviceOwnerDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get aospDeviceOwnerDeviceConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.aospDeviceOwnerDeviceConfiguration not found
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

If successful, this method returns a `200 OK` response code and an [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_aospdeviceownerdeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.aospDeviceOwnerDeviceConfiguration not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.aospDeviceOwnerDeviceConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.aospDeviceOwnerDeviceConfiguration",
    "id": "21a1d355-d355-21a1-55d3-a12155d3a121",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "version": "Integer",
    "appsAllowInstallFromUnknownSources": "Boolean",
    "backupBlocked": "Boolean",
    "bluetoothBlockConfiguration": "Boolean",
    "bluetoothBlockContactSharing": "Boolean",
    "bluetoothBlocked": "Boolean",
    "cameraBlocked": "Boolean",
    "cellularBlockWiFiTethering": "Boolean",
    "factoryResetBlocked": "Boolean",
    "passwordMinimumLength": "Integer",
    "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
    "passwordRequiredType": "String",
    "passwordSignInFailureCountBeforeFactoryReset": "Integer",
    "screenCaptureBlocked": "Boolean",
    "securityAllowDebuggingFeatures": "Boolean",
    "storageAllowUsb": "Boolean",
    "storageBlockExternalMedia": "Boolean",
    "storageBlockUsbFileTransfer": "Boolean",
    "wifiBlockEditConfigurations": "Boolean"
  }
}
```

