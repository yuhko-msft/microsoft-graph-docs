---
title: "Create deviceAndAppManagementAssignmentFilter"
description: "Create a new deviceAndAppManagementAssignmentFilter object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceAndAppManagementAssignmentFilter
Namespace: microsoft.graph



Create a new deviceAndAppManagementAssignmentFilter object.

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
POST /deviceManagement/assignmentFilters
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) object.

The following table shows the properties that are required when you create the [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Creation time of the Assignment Filter.|
|description|String|Description of the Assignment Filter.|
|displayName|String|DisplayName of the Assignment Filter.|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the Assignment Filter.|
|platform|devicePlatformType|Platform type of the devices on which the Assignment Filter will be applicable. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|roleScopeTags|String collection|RoleScopeTags of the Assignment Filter.|
|rule|String|Rule definition of the Assignment Filter.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceandappmanagementassignmentfilter_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/assignmentFilters
Content-Type: application/json
Content-length: 224

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementAssignmentFilter",
  "description": "String",
  "displayName": "String",
  "platform": "String",
  "roleScopeTags": [
    "String"
  ],
  "rule": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentFilter"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementAssignmentFilter",
  "id": "58a136f8-36f8-58a1-f836-a158f836a158",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "platform": "String",
  "roleScopeTags": [
    "String"
  ],
  "rule": "String"
}
```

