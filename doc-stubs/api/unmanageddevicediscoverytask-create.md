---
title: "Create unmanagedDeviceDiscoveryTask"
description: "Create a new unmanagedDeviceDiscoveryTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unmanagedDeviceDiscoveryTask
Namespace: microsoft.graph

Create a new [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.

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
POST ** Collection URI for microsoft.graph.unmanagedDeviceDiscoveryTask not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.

The following table shows the properties that are required when you create the [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|description|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|priority|deviceAppManagementTaskPriority|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|creator|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|creatorNotes|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|assignedTo|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|status|deviceAppManagementTaskStatus|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|
|unmanagedDevices|[unmanagedDevice](../resources/intune-unmanageddevice.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unmanageddevicediscoverytask_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.unmanagedDeviceDiscoveryTask not found
Content-Type: application/json
Content-length: 420

{
  "@odata.type": "#microsoft.graph.unmanagedDeviceDiscoveryTask",
  "displayName": "String",
  "description": "String",
  "dueDateTime": "String (timestamp)",
  "category": "String",
  "priority": "String",
  "creator": "String",
  "creatorNotes": "String",
  "assignedTo": "String",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.unmanagedDeviceDiscoveryTask"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unmanagedDeviceDiscoveryTask",
  "id": "5718f574-f574-5718-74f5-185774f51857",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "dueDateTime": "String (timestamp)",
  "category": "String",
  "priority": "String",
  "creator": "String",
  "creatorNotes": "String",
  "assignedTo": "String",
  "status": "String",
  "unmanagedDevices": [
    {
      "@odata.type": "microsoft.graph.unmanagedDevice"
    }
  ]
}
```

