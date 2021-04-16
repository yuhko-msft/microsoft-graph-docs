---
title: "Create targetedManagedAppPolicyAssignment"
description: "Create a new targetedManagedAppPolicyAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create targetedManagedAppPolicyAssignment
Namespace: microsoft.graph



Create a new [targetedManagedAppPolicyAssignment](../resources/targetedmanagedapppolicyassignment.md) object.

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
POST /targetedManagedAppProtection/assignments
POST /windowsInformationProtection/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [targetedManagedAppPolicyAssignment](../resources/targetedmanagedapppolicyassignment.md) object.

The following table shows the properties that are required when you create the [targetedManagedAppPolicyAssignment](../resources/targetedmanagedapppolicyassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|source|deviceAndAppManagementAssignmentSource|Type of resource used for deployment to a group, direct or parcel/policySet. Possible values are: `direct`, `policySets`.|
|sourceId|String|Identifier for resource used for deployment to a group|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|Identifier for deployment to a group or app|



## Response

If successful, this method returns a `201 Created` response code and a [targetedManagedAppPolicyAssignment](../resources/targetedmanagedapppolicyassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_targetedmanagedapppolicyassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/targetedManagedAppProtection/assignments
Content-Type: application/json
Content-length: 222

{
  "@odata.type": "#microsoft.graph.targetedManagedAppPolicyAssignment",
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
  "@odata.type": "microsoft.graph.targetedManagedAppPolicyAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.targetedManagedAppPolicyAssignment",
  "id": "4b6ba7ca-a7ca-4b6b-caa7-6b4bcaa76b4b",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

