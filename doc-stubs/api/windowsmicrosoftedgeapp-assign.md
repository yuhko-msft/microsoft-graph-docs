---
title: "windowsMicrosoftEdgeApp: assign"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# windowsMicrosoftEdgeApp: assign
Namespace: microsoft.graph



**TODO: Add Description**

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
POST ** Entity URI for microsoft.graph.windowsMicrosoftEdgeApp not found/assign
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|mobileAppAssignments|[mobileAppAssignment](../resources/mobileappassignment.md) collection|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "windowsmicrosoftedgeapp_assign"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windowsMicrosoftEdgeApp not found/assign

Content-Type: application/json
Content-length: 443

{
  "mobileAppAssignments": [
    {
      "@odata.type": "#microsoft.graph.mobileAppAssignment",
      "id": "String (identifier)",
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
  ]
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
HTTP/1.1 204 No Content
```

