---
title: "Add windowsManagementApp"
description: "Add windowsManagementApp by posting to the windowsManagementApp collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add windowsManagementApp
Namespace: microsoft.graph



Add windowsManagementApp by posting to the windowsManagementApp collection.

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
POST /deviceAppManagement/windowsManagementApp/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsManagementApp](../resources/windowsmanagementapp.md) object.

The following table shows the properties that are required when you create the [windowsManagementApp](../resources/windowsmanagementapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|availableVersion|String|Windows management app available version.|



## Response

If successful, this method returns a `204 No Content` response code and a [windowsManagementApp](../resources/windowsmanagementapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsmanagementapp_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/windowsManagementApp/$ref
Content-Type: application/json
Content-length: 95

{
  "@odata.type": "#microsoft.graph.windowsManagementApp",
  "availableVersion": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsManagementApp"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsManagementApp",
  "id": "a0636f57-6f57-a063-576f-63a0576f63a0",
  "availableVersion": "String"
}
```

