---
title: "Update deviceManagementConfigurationPolicyAssignment"
description: "Update the properties of a deviceManagementConfigurationPolicyAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementConfigurationPolicyAssignment
Namespace: microsoft.graph



Update the properties of a [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) object.

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
PATCH /deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}/assignments/{deviceManagementConfigurationPolicyAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) object.

The following table shows the properties that are required when you update the [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for the DeviceManagementConfigurationPolicy.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementconfigurationpolicyassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}/assignments/{deviceManagementConfigurationPolicyAssignmentId}
Content-Type: application/json
Content-length: 185

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyAssignment",
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
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyAssignment",
  "id": "ec8df9c7-f9c7-ec8d-c7f9-8decc7f98dec",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

