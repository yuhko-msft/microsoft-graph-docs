---
title: "Create deployment"
description: "Create a new deployment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deployment
Namespace: microsoft.graph.windowsUpdates



Create a new deployment object.

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
POST /admin/windows/updates/deployments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deployment](../resources/windowsupdates-deployment.md) object.

The following table shows the properties that are required when you create the [deployment](../resources/windowsupdates-deployment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/windowsupdates-entity.md)|
|content|[deployableContent](../resources/windowsupdates-deployablecontent.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|settings|[deploymentSettings](../resources/windowsupdates-deploymentsettings.md)|**TODO: Add Description**|
|state|[deploymentState](../resources/windowsupdates-deploymentstate.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deployment](../resources/windowsupdates-deployment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deployment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/admin/windows/updates/deployments
Content-Type: application/json
Content-length: 344

{
  "@odata.type": "#microsoft.graph.windowsUpdates.deployment",
  "content": {
    "@odata.type": "microsoft.graph.windowsUpdates.deployableContent"
  },
  "settings": {
    "@odata.type": "microsoft.graph.windowsUpdates.deploymentSettings"
  },
  "state": {
    "@odata.type": "microsoft.graph.windowsUpdates.deploymentState"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsUpdates.deployment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsUpdates.deployment",
  "id": "f7c5b534-b534-f7c5-34b5-c5f734b5c5f7",
  "content": {
    "@odata.type": "microsoft.graph.windowsUpdates.deployableContent"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "settings": {
    "@odata.type": "microsoft.graph.windowsUpdates.deploymentSettings"
  },
  "state": {
    "@odata.type": "microsoft.graph.windowsUpdates.deploymentState"
  }
}
```

