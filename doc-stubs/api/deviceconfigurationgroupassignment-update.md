---
title: "Update deviceConfigurationGroupAssignment"
description: "Update the properties of a deviceConfigurationGroupAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceConfigurationGroupAssignment
Namespace: microsoft.graph



Update the properties of a [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) object.

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
PATCH /deviceManagement/deviceConfigurations/{deviceConfigurationId}/groupAssignments/{deviceConfigurationGroupAssignmentId}
PATCH /deviceManagement/deviceConfigurations/{deviceConfigurationId}/rootCertificate/groupAssignments/{deviceConfigurationGroupAssignmentId}
PATCH /deviceManagement/deviceConfigurations/{deviceConfigurationId}/identityCertificate/groupAssignments/{deviceConfigurationGroupAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) object.

The following table shows the properties that are required when you update the [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|excludeGroup|Boolean|Indicates if this group is should be excluded. Defaults that the group should be included|
|targetGroupId|String|The Id of the AAD group we are targeting the device configuration to.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_deviceconfigurationgroupassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurations/{deviceConfigurationId}/groupAssignments/{deviceConfigurationGroupAssignmentId}
Content-Type: application/json
Content-length: 136

{
  "@odata.type": "#microsoft.graph.deviceConfigurationGroupAssignment",
  "excludeGroup": "Boolean",
  "targetGroupId": "String"
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
  "@odata.type": "#microsoft.graph.deviceConfigurationGroupAssignment",
  "id": "918c6859-6859-918c-5968-8c9159688c91",
  "excludeGroup": "Boolean",
  "targetGroupId": "String"
}
```

