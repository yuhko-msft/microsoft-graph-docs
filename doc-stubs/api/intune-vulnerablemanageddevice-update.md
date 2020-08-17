---
title: "Update vulnerableManagedDevice"
description: "Update the properties of a vulnerableManagedDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update vulnerableManagedDevice
Namespace: microsoft.graph

Update the properties of a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.

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
PATCH /securityConfigurationTask/managedDevices/{vulnerableManagedDeviceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.

The following table shows the properties that are required when you create the [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_vulnerablemanageddevice"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/securityConfigurationTask/managedDevices/{vulnerableManagedDeviceId}
Content-Type: application/json
Content-length: 170

{
  "@odata.type": "#microsoft.graph.vulnerableManagedDevice",
  "managedDeviceId": "String",
  "displayName": "String",
  "lastSyncDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.vulnerableManagedDevice",
  "id": "e8d73bef-3bef-e8d7-ef3b-d7e8ef3bd7e8",
  "managedDeviceId": "String",
  "displayName": "String",
  "lastSyncDateTime": "String (timestamp)"
}
```

