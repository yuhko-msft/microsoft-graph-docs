---
title: "Create catalogEntry"
description: "Create a new catalogEntry object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create catalogEntry
Namespace: microsoft.graph.windowsUpdates



Create a new catalogEntry object.

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
POST /admin/windows/updates/catalog/entries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [catalogEntry](../resources/windowsupdates-catalogentry.md) object.

The following table shows the properties that are required when you create the [catalogEntry](../resources/windowsupdates-catalogentry.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/windowsupdates-entity.md)|
|deployableUntilDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|releaseDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [catalogEntry](../resources/windowsupdates-catalogentry.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_catalogentry_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/admin/windows/updates/catalog/entries
Content-Type: application/json
Content-length: 193

{
  "@odata.type": "#microsoft.graph.windowsUpdates.catalogEntry",
  "deployableUntilDateTime": "String (timestamp)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsUpdates.catalogEntry"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsUpdates.catalogEntry",
  "id": "4a94833e-833e-4a94-3e83-944a3e83944a",
  "deployableUntilDateTime": "String (timestamp)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)"
}
```

