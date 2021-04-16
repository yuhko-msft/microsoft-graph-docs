---
title: "Update userAppInstallStatus"
description: "Update the properties of a userAppInstallStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userAppInstallStatus
Namespace: microsoft.graph



Update the properties of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.

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
PATCH /deviceAppManagement/mobileApps/{mobileAppId}/userStatuses/{userAppInstallStatusId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userAppInstallStatus](../resources/userappinstallstatus.md) object.

The following table shows the properties that are required when you update the [userAppInstallStatus](../resources/userappinstallstatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|failedDeviceCount|Int32|Failed Device Count.|
|installedDeviceCount|Int32|Installed Device Count.|
|notInstalledDeviceCount|Int32|Not installed device count.|
|userName|String|User name.|
|userPrincipalName|String|User Principal Name.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userAppInstallStatus](../resources/userappinstallstatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userappinstallstatus"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}/userStatuses/{userAppInstallStatusId}
Content-Type: application/json
Content-length: 235

{
  "@odata.type": "#microsoft.graph.userAppInstallStatus",
  "failedDeviceCount": "Integer",
  "installedDeviceCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "userName": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.userAppInstallStatus",
  "id": "a03c5104-5104-a03c-0451-3ca004513ca0",
  "failedDeviceCount": "Integer",
  "installedDeviceCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "userName": "String",
  "userPrincipalName": "String"
}
```

