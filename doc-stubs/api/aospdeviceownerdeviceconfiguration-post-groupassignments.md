---
title: "Create deviceConfigurationGroupAssignment"
description: "Create a new deviceConfigurationGroupAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceConfigurationGroupAssignment
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new deviceConfigurationGroupAssignment object.

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
POST /deviceManagement/deviceConfigurations/{deviceConfigurationId}/groupAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) object.

The following table shows the properties that are required when you create the [deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|targetGroupId|String|The Id of the AAD group we are targeting the device configuration to.|
|excludeGroup|Boolean|Indicates if this group is should be excluded. Defaults that the group should be included|



## Response

If successful, this method returns a `201 Created` response code and a [deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceconfigurationgroupassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/deviceConfigurations/{deviceConfigurationId}/groupAssignments
Content-Type: application/json
Content-length: 154

{
  "@odata.type": "#microsoft.management.services.api.deviceConfigurationGroupAssignment",
  "targetGroupId": "String",
  "excludeGroup": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.deviceConfigurationGroupAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.deviceConfigurationGroupAssignment",
  "id": "e5fd593a-593a-e5fd-3a59-fde53a59fde5",
  "targetGroupId": "String",
  "excludeGroup": "Boolean"
}
```

