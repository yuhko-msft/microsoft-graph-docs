---
title: "Update managedAppStatusRaw"
description: "Update the properties of a managedAppStatusRaw object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update managedAppStatusRaw
Namespace: microsoft.graph

Update the properties of a [managedAppStatusRaw](../resources/managedappstatusraw.md) object.

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
PATCH /managedAppStatusRaw
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedAppStatusRaw](../resources/managedappstatusraw.md) object.

The following table shows the properties that are required when you create the [managedAppStatusRaw](../resources/managedappstatusraw.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [managedAppStatus](../resources/intune-managedappstatus.md)|
|version|String|**TODO: Add Description** Inherited from [managedAppStatus](../resources/intune-managedappstatus.md)|
|content|[Json](../resources/intune-json.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [managedAppStatusRaw](../resources/managedappstatusraw.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_managedappstatusraw"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/managedAppStatusRaw
Content-Type: application/json
Content-length: 178

{
  "@odata.type": "#microsoft.graph.managedAppStatusRaw",
  "displayName": "String",
  "version": "String",
  "content": {
    "@odata.type": "microsoft.graph.Json"
  }
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
  "@odata.type": "#microsoft.graph.managedAppStatusRaw",
  "id": "405fa94f-a94f-405f-4fa9-5f404fa95f40",
  "displayName": "String",
  "version": "String",
  "content": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

