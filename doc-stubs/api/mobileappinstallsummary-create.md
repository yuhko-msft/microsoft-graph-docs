---
title: "Create mobileAppInstallSummary"
description: "Create a new mobileAppInstallSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppInstallSummary
Namespace: microsoft.graph



Create a new [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.

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
POST ** Collection URI for microsoft.graph.mobileAppInstallSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.

The following table shows the properties that are required when you create the [mobileAppInstallSummary](../resources/mobileappinstallsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|failedDeviceCount|Int32|Number of Devices that have failed to install this app.|
|failedUserCount|Int32|Number of Users that have 1 or more device that failed to install this app.|
|installedDeviceCount|Int32|Number of Devices that have successfully installed this app.|
|installedUserCount|Int32|Number of Users whose devices have all succeeded to install this app.|
|notApplicableDeviceCount|Int32|Number of Devices that are not applicable for this app.|
|notApplicableUserCount|Int32|Number of Users whose devices were all not applicable for this app.|
|notInstalledDeviceCount|Int32|Number of Devices that does not have this app installed.|
|notInstalledUserCount|Int32|Number of Users that have 1 or more devices that did not install this app.|
|pendingInstallDeviceCount|Int32|Number of Devices that have been notified to install this app.|
|pendingInstallUserCount|Int32|Number of Users that have 1 or more device that have been notified to install this app and have 0 devices with failures.|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappinstallsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.mobileAppInstallSummary not found
Content-Type: application/json
Content-length: 453

{
  "@odata.type": "#microsoft.graph.mobileAppInstallSummary",
  "failedDeviceCount": "Integer",
  "failedUserCount": "Integer",
  "installedDeviceCount": "Integer",
  "installedUserCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "notApplicableUserCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "notInstalledUserCount": "Integer",
  "pendingInstallDeviceCount": "Integer",
  "pendingInstallUserCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileAppInstallSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileAppInstallSummary",
  "id": "0480b66e-b66e-0480-6eb6-80046eb68004",
  "failedDeviceCount": "Integer",
  "failedUserCount": "Integer",
  "installedDeviceCount": "Integer",
  "installedUserCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "notApplicableUserCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "notInstalledUserCount": "Integer",
  "pendingInstallDeviceCount": "Integer",
  "pendingInstallUserCount": "Integer"
}
```

