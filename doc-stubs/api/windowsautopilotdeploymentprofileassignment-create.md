---
title: "Create windowsAutopilotDeploymentProfileAssignment"
description: "Create a new windowsAutopilotDeploymentProfileAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsAutopilotDeploymentProfileAssignment
Namespace: microsoft.graph



Create a new [windowsAutopilotDeploymentProfileAssignment](../resources/windowsautopilotdeploymentprofileassignment.md) object.

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
POST /deviceManagement/windowsAutopilotDeploymentProfiles/{windowsAutopilotDeploymentProfileId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsAutopilotDeploymentProfileAssignment](../resources/windowsautopilotdeploymentprofileassignment.md) object.

The following table shows the properties that are required when you create the [windowsAutopilotDeploymentProfileAssignment](../resources/windowsautopilotdeploymentprofileassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|source|deviceAndAppManagementAssignmentSource|Type of resource used for deployment to a group, direct or parcel/policySet. Possible values are: `direct`, `policySets`.|
|sourceId|String|Identifier for resource used for deployment to a group|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for the Windows Autopilot deployment profile.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsAutopilotDeploymentProfileAssignment](../resources/windowsautopilotdeploymentprofileassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsautopilotdeploymentprofileassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/windowsAutopilotDeploymentProfiles/{windowsAutopilotDeploymentProfileId}/assignments
Content-Type: application/json
Content-length: 231

{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeploymentProfileAssignment",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsAutopilotDeploymentProfileAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeploymentProfileAssignment",
  "id": "a274e7e1-e7e1-a274-e1e7-74a2e1e774a2",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

