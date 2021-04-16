---
title: "Create deviceManagementScriptGroupAssignment"
description: "Create a new deviceManagementScriptGroupAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementScriptGroupAssignment
Namespace: microsoft.graph



Create a new deviceManagementScriptGroupAssignment object.

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
POST /deviceManagement/deviceCustomAttributeShellScripts/{deviceCustomAttributeShellScriptId}/groupAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object.

The following table shows the properties that are required when you create the [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetGroupId|String|The Id of the Azure Active Directory group we are targeting the script to.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementscriptgroupassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceCustomAttributeShellScripts/{deviceCustomAttributeShellScriptId}/groupAssignments
Content-Type: application/json
Content-length: 109

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptGroupAssignment",
  "targetGroupId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementScriptGroupAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptGroupAssignment",
  "id": "9fb26ad4-6ad4-9fb2-d46a-b29fd46ab29f",
  "targetGroupId": "String"
}
```

