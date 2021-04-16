---
title: "Update enrollmentConfigurationAssignment"
description: "Update the properties of an enrollmentConfigurationAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update enrollmentConfigurationAssignment
Namespace: microsoft.graph



Update the properties of an [enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) object.

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
PATCH /me/deviceEnrollmentConfigurations/{deviceEnrollmentConfigurationId}/assignments/{enrollmentConfigurationAssignmentId}
PATCH /users/{usersId}/deviceEnrollmentConfigurations/{deviceEnrollmentConfigurationId}/assignments/{enrollmentConfigurationAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) object.

The following table shows the properties that are required when you update the [enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|source|deviceAndAppManagementAssignmentSource|Type of resource used for deployment to a group, direct or policySet. Possible values are: `direct`, `policySets`.|
|sourceId|String|Identifier for resource used for deployment to a group|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|Represents an assignment to managed devices in the tenant|



## Response

If successful, this method returns a `200 OK` response code and an updated [enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_enrollmentconfigurationassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/deviceEnrollmentConfigurations/{deviceEnrollmentConfigurationId}/assignments/{enrollmentConfigurationAssignmentId}
Content-Type: application/json
Content-length: 221

{
  "@odata.type": "#microsoft.graph.enrollmentConfigurationAssignment",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
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
  "@odata.type": "#microsoft.graph.enrollmentConfigurationAssignment",
  "id": "555b01fa-01fa-555b-fa01-5b55fa015b55",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

