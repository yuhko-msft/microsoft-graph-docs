---
title: "Create onSignupStart"
description: "Create a new authenticationAction object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create onSignupStart
Namespace: microsoft.graph

Create a new authenticationAction object.

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
POST /identity/events/onSignupStart
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [authenticationAction](../resources/authenticationaction.md) object.

The following table shows the properties that are required when you create the [authenticationAction](../resources/authenticationaction.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|
|sourceFilter|[authenticationSourceFilter](../resources/authenticationsourcefilter.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [authenticationAction](../resources/authenticationaction.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_authenticationaction_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/identity/events/onSignupStart
Content-Type: application/json
Content-length: 194

{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.authenticationAction",
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
  "@odata.type": "Microsoft.Cpim.Api.DataModels.authenticationAction"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.authenticationAction",
  "id": "2adb5c12-5c12-2adb-125c-db2a125cdb2a",
  "priority": "Integer",
  "sourceFilter": {
    "@odata.type": "microsoft.graph.authenticationSourceFilter"
  }
}
```

