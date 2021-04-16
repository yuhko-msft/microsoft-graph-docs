---
title: "Add appScope"
description: "Add appScope by posting to the appScope collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add appScope
Namespace: microsoft.graph



Add appScope by posting to the appScope collection.

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
POST /roleManagement/directory/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequestId}/appScope/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [appScope](../resources/appscope.md) object.

The following table shows the properties that are required when you create the [appScope](../resources/appscope.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and an [appScope](../resources/appscope.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_appscope_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/roleManagement/directory/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequestId}/appScope/$ref
Content-Type: application/json
Content-length: 99

{
  "@odata.type": "#microsoft.graph.appScope",
  "displayName": "String",
  "type": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.appScope"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.appScope",
  "id": "a5689e25-9e25-a568-259e-68a5259e68a5",
  "displayName": "String",
  "type": "String"
}
```

