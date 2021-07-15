---
title: "Update eBookInstallSummary"
description: "Update the properties of an eBookInstallSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update eBookInstallSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [eBookInstallSummary](../resources/ebookinstallsummary.md) object.

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
PATCH /deviceAppManagement/managedEBooks/{managedEBookId}/installSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [eBookInstallSummary](../resources/ebookinstallsummary.md) object.

The following table shows the properties that are required when you update the [eBookInstallSummary](../resources/ebookinstallsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|failedDeviceCount|Int32|Number of Devices that have failed to install this book.|
|failedUserCount|Int32|Number of Users that have 1 or more device that failed to install this book.|
|installedDeviceCount|Int32|Number of Devices that have successfully installed this book.|
|installedUserCount|Int32|Number of Users whose devices have all succeeded to install this book.|
|notInstalledDeviceCount|Int32|Number of Devices that does not have this book installed.|
|notInstalledUserCount|Int32|Number of Users that did not install this book.|



## Response

If successful, this method returns a `200 OK` response code and an updated [eBookInstallSummary](../resources/ebookinstallsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ebookinstallsummary"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceAppManagement/managedEBooks/{managedEBookId}/installSummary
Content-Type: application/json
Content-length: 283

{
  "@odata.type": "#microsoft.graph.eBookInstallSummary",
  "failedDeviceCount": "Integer",
  "failedUserCount": "Integer",
  "installedDeviceCount": "Integer",
  "installedUserCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "notInstalledUserCount": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.eBookInstallSummary",
  "id": "05c8cc2f-cc2f-05c8-2fcc-c8052fccc805",
  "failedDeviceCount": "Integer",
  "failedUserCount": "Integer",
  "installedDeviceCount": "Integer",
  "installedUserCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "notInstalledUserCount": "Integer"
}
```

