---
title: "Add vulnerableManagedDevice"
description: "Add managedDevices by posting to the managedDevices collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add vulnerableManagedDevice
Namespace: microsoft.graph



Add managedDevices by posting to the managedDevices collection.

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
POST /securityConfigurationTask/managedDevices/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) object.

The following table shows the properties that are required when you create the [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The device name.|
|lastSyncDateTime|DateTimeOffset|The last sync date.|
|managedDeviceId|String|The Intune managed device ID.|



## Response

If successful, this method returns a `204 No Content` response code and a [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_vulnerablemanageddevice_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/securityConfigurationTask/managedDevices/$ref
Content-Type: application/json
Content-length: 170

{
  "@odata.type": "#microsoft.graph.vulnerableManagedDevice",
  "displayName": "String",
  "lastSyncDateTime": "String (timestamp)",
  "managedDeviceId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.vulnerableManagedDevice"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.vulnerableManagedDevice",
  "id": "97b8cb7b-cb7b-97b8-7bcb-b8977bcbb897",
  "displayName": "String",
  "lastSyncDateTime": "String (timestamp)",
  "managedDeviceId": "String"
}
```

