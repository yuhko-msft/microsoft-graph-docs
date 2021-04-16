---
title: "Create mobileAppAssignment"
description: "Create a new mobileAppAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppAssignment
Namespace: microsoft.graph



Create a new mobileAppAssignment object.

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
POST /deviceAppManagement/mobileApps/{mobileAppId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppAssignment](../resources/mobileappassignment.md) object.

The following table shows the properties that are required when you create the [mobileAppAssignment](../resources/mobileappassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intent|installIntent|The install intent defined by the admin. Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|
|settings|[mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md)|The settings for target assignment defined by the admin.|
|source|deviceAndAppManagementAssignmentSource|The resource type which is the source for the assignment. Possible values are: `direct`, `policySets`.|
|sourceId|String|The identifier of the source of the assignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The target group assignment defined by the admin.|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppAssignment](../resources/mobileappassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}/assignments
Content-Type: application/json
Content-length: 319

{
  "@odata.type": "#microsoft.graph.mobileAppAssignment",
  "intent": "String",
  "settings": {
    "@odata.type": "microsoft.graph.mobileAppAssignmentSettings"
  },
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
  "@odata.type": "microsoft.graph.mobileAppAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileAppAssignment",
  "id": "47a56aa1-6aa1-47a5-a16a-a547a16aa547",
  "intent": "String",
  "settings": {
    "@odata.type": "microsoft.graph.mobileAppAssignmentSettings"
  },
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

