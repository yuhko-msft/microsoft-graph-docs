---
title: "Update groupProxies"
description: "Update the properties of a groupProxies object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupProxies
Namespace: microsoft.graph

Update the properties of a groupProxies object.

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
PATCH /directory/groupProxies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupProxy](../resources/groupproxy.md) object.

The following table shows the properties that are required when you create the [groupProxy](../resources/groupproxy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|remoteTenantId|Guid|**TODO: Add Description**|
|remoteGroupId|Guid|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupProxy](../resources/groupproxy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_groupproxies"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/directory/groupProxies
Content-Type: application/json
Content-length: 153

{
  "@odata.type": "#microsoft.graph.groupProxy",
  "deletedDateTime": "String (timestamp)",
  "remoteTenantId": "Guid",
  "remoteGroupId": "Guid"
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
  "@odata.type": "#microsoft.graph.groupProxy",
  "id": "3ce2de5b-de5b-3ce2-5bde-e23c5bdee23c",
  "deletedDateTime": "String (timestamp)",
  "remoteTenantId": "Guid",
  "remoteGroupId": "Guid"
}
```

