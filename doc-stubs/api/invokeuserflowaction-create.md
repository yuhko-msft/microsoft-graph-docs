---
title: "Create invokeUserFlowAction"
description: "Create a new invokeUserFlowAction object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create invokeUserFlowAction
Namespace: microsoft.graph

Create a new [invokeUserFlowAction](../resources/invokeuserflowaction.md) object.

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
POST ** Collection URI for Microsoft.Cpim.Api.DataModels.invokeUserFlowAction not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [invokeUserFlowAction](../resources/invokeuserflowaction.md) object.

The following table shows the properties that are required when you create the [invokeUserFlowAction](../resources/invokeuserflowaction.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [authenticationAction](../resources/authenticationaction.md)|
|priority|Int32|**TODO: Add Description** Inherited from [authenticationAction](../resources/authenticationaction.md)|
|sourceFilter|[authenticationSourceFilter](../resources/authenticationsourcefilter.md)|**TODO: Add Description** Inherited from [authenticationAction](../resources/authenticationaction.md)|



## Response

If successful, this method returns a `201 Created` response code and an [invokeUserFlowAction](../resources/invokeuserflowaction.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_invokeuserflowaction_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for Microsoft.Cpim.Api.DataModels.invokeUserFlowAction not found
Content-Type: application/json
Content-length: 194

{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.invokeUserFlowAction",
  "priority": "Integer",
  "sourceFilter": {
    "@odata.type": "microsoft.graph.authenticationSourceFilter"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Cpim.Api.DataModels.invokeUserFlowAction"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.invokeUserFlowAction",
  "id": "ab7bc1e7-c1e7-ab7b-e7c1-7babe7c17bab",
  "priority": "Integer",
  "sourceFilter": {
    "@odata.type": "microsoft.graph.authenticationSourceFilter"
  }
}
```

