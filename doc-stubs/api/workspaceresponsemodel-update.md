---
title: "Update WorkspaceResponseModel"
description: "Update the properties of a WorkspaceResponseModel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update WorkspaceResponseModel
Namespace: microsoft.graph

Update the properties of a [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) object.

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
PATCH /workspaces/{workspacesId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) object.

The following table shows the properties that are required when you create the [WorkspaceResponseModel](../resources/workspaceresponsemodel.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|image|String|**TODO: Add Description**|
|servicePlanName|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|servicePlanId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_workspaceresponsemodel"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/workspaces/{workspacesId}
Content-Type: application/json
Content-length: 260

{
  "@odata.type": "#microsoft.graph.WorkspaceResponseModel",
  "image": "String",
  "servicePlanName": "String",
  "deviceName": "String",
  "servicePlanId": "String",
  "displayName": "String",
  "status": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.WorkspaceResponseModel",
  "id": "1eec3ba2-3ba2-1eec-a23b-ec1ea23bec1e",
  "image": "String",
  "servicePlanName": "String",
  "deviceName": "String",
  "servicePlanId": "String",
  "displayName": "String",
  "status": "String",
  "userPrincipalName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

