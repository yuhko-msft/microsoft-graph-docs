---
title: "Update unmanagedDeviceDiscoveryTask"
description: "Update the properties of an unmanagedDeviceDiscoveryTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update unmanagedDeviceDiscoveryTask
Namespace: microsoft.graph



Update the properties of an [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.

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
PATCH /unmanagedDeviceDiscoveryTask
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.

The following table shows the properties that are required when you update the [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignedTo|String|The name or email of the admin this task is assigned to. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|The category. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|createdDateTime|DateTimeOffset|The created date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creator|String|The email address of the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creatorNotes|String|Notes from the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|description|String|The description. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|displayName|String|The name. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|The due date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|priority|deviceAppManagementTaskPriority|The priority. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|status|deviceAppManagementTaskStatus|The status. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|
|unmanagedDevices|[unmanagedDevice](../resources/unmanageddevice.md) collection|Unmanaged devices discovered in the network.|



## Response

If successful, this method returns a `200 OK` response code and an updated [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_unmanageddevicediscoverytask"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/unmanagedDeviceDiscoveryTask
Content-Type: application/json
Content-length: 420

{
  "@odata.type": "#microsoft.graph.unmanagedDeviceDiscoveryTask",
  "assignedTo": "String",
  "category": "String",
  "creator": "String",
  "creatorNotes": "String",
  "description": "String",
  "displayName": "String",
  "dueDateTime": "String (timestamp)",
  "priority": "String",
  "status": "String",
  "unmanagedDevices": [
    {
      "@odata.type": "microsoft.graph.unmanagedDevice"
    }
  ]
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
  "@odata.type": "#microsoft.graph.unmanagedDeviceDiscoveryTask",
  "id": "2c65029c-029c-2c65-9c02-652c9c02652c",
  "assignedTo": "String",
  "category": "String",
  "createdDateTime": "String (timestamp)",
  "creator": "String",
  "creatorNotes": "String",
  "description": "String",
  "displayName": "String",
  "dueDateTime": "String (timestamp)",
  "priority": "String",
  "status": "String",
  "unmanagedDevices": [
    {
      "@odata.type": "microsoft.graph.unmanagedDevice"
    }
  ]
}
```

