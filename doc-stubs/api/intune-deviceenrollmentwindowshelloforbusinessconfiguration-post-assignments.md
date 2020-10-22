---
title: "Create assignments"
description: "Create a new enrollmentConfigurationAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create assignments
Namespace: microsoft.graph

Create a new enrollmentConfigurationAssignment object.

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
POST /me/deviceEnrollmentConfigurations/{deviceEnrollmentConfigurationId}/assignments
POST /users/{usersId}/deviceEnrollmentConfigurations/{deviceEnrollmentConfigurationId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) object.

The following table shows the properties that are required when you create the [enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description**|
|source|deviceAndAppManagementAssignmentSource|**TODO: Add Description**. Possible values are: `direct`, `policySets`.|
|sourceId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_enrollmentconfigurationassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/me/deviceEnrollmentConfigurations/{deviceEnrollmentConfigurationId}/assignments
Content-Type: application/json
Content-length: 221

{
  "@odata.type": "#microsoft.graph.enrollmentConfigurationAssignment",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  },
  "source": "String",
  "sourceId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.enrollmentConfigurationAssignment"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.enrollmentConfigurationAssignment",
  "id": "8f0dbe1f-be1f-8f0d-1fbe-0d8f1fbe0d8f",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  },
  "source": "String",
  "sourceId": "String"
}
```

