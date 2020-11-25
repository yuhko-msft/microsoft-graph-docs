---
title: "Create groupProxy"
description: "Create a new groupProxy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupProxy
Namespace: microsoft.graph

Create a new [groupProxy](../resources/groupproxy.md) object.

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
POST /directory/groupProxies
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
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|remoteTenantId|Guid|**TODO: Add Description**|
|remoteGroupId|Guid|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [groupProxy](../resources/groupproxy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_groupproxy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/groupProxies
Content-Type: application/json
Content-length: 165

{
  "@odata.type": "#Microsoft.DirectoryServices.groupProxy",
  "deletedDateTime": "String (timestamp)",
  "remoteTenantId": "Guid",
  "remoteGroupId": "Guid"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.groupProxy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.DirectoryServices.groupProxy",
  "id": "9dd1b918-b918-9dd1-18b9-d19d18b9d19d",
  "deletedDateTime": "String (timestamp)",
  "remoteTenantId": "Guid",
  "remoteGroupId": "Guid"
}
```

