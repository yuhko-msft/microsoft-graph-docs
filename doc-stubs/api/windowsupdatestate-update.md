---
title: "Update windowsUpdateState"
description: "Update the properties of a windowsUpdateState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsUpdateState
Namespace: microsoft.graph



Update the properties of a [windowsUpdateState](../resources/windowsupdatestate.md) object.

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
PATCH /deviceManagement/windowsFeatureUpdateProfiles/{windowsFeatureUpdateProfileId}/deviceUpdateStates/{windowsUpdateStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsUpdateState](../resources/windowsupdatestate.md) object.

The following table shows the properties that are required when you update the [windowsUpdateState](../resources/windowsupdatestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceDisplayName|String|Device display name.|
|deviceId|String|The id of the device.|
|featureUpdateVersion|String|The current feature update version of the device.|
|lastScanDateTime|DateTimeOffset|The date time that the Windows Update Agent did a successful scan.|
|lastSyncDateTime|DateTimeOffset|Last date time that the device sync with with Microsoft Intune.|
|qualityUpdateVersion|String|The Quality Update Version of the device.|
|status|windowsUpdateStatus|Windows udpate status. Possible values are: `upToDate`, `pendingInstallation`, `pendingReboot`, `failed`.|
|userId|String|The id of the user.|
|userPrincipalName|String|User principal name.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsUpdateState](../resources/windowsupdatestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsupdatestate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/windowsFeatureUpdateProfiles/{windowsFeatureUpdateProfileId}/deviceUpdateStates/{windowsUpdateStateId}
Content-Type: application/json
Content-length: 363

{
  "@odata.type": "#microsoft.graph.windowsUpdateState",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "featureUpdateVersion": "String",
  "lastScanDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "qualityUpdateVersion": "String",
  "status": "String",
  "userId": "String",
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
  "@odata.type": "#microsoft.graph.windowsUpdateState",
  "id": "a602cef6-cef6-a602-f6ce-02a6f6ce02a6",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "featureUpdateVersion": "String",
  "lastScanDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "qualityUpdateVersion": "String",
  "status": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```

