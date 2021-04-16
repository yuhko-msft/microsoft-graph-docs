---
title: "List driveItem"
description: "Get the driveItem resources from the driveItem navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List driveItem
Namespace: microsoft.graph



Get the driveItem resources from the driveItem navigation property.

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
GET /drives/{drivesId}/activities/{itemActivityOLDId}/driveItem
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [driveItem](../resources/driveitem.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_driveitem"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/drives/{drivesId}/activities/{itemActivityOLDId}/driveItem
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.driveItem)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.driveItem",
      "id": "f0bfd179-d179-f0bf-79d1-bff079d1bff0",
      "createdBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "eTag": "String",
      "lastModifiedBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "lastModifiedDateTime": "String (timestamp)",
      "name": "String",
      "parentReference": {
        "@odata.type": "microsoft.graph.itemReference"
      },
      "webUrl": "String",
      "audio": {
        "@odata.type": "microsoft.graph.audio"
      },
      "bundle": {
        "@odata.type": "microsoft.graph.bundle"
      },
      "content": "Stream",
      "cTag": "String",
      "deleted": {
        "@odata.type": "microsoft.graph.deleted"
      },
      "file": {
        "@odata.type": "microsoft.graph.file"
      },
      "fileSystemInfo": {
        "@odata.type": "microsoft.graph.fileSystemInfo"
      },
      "folder": {
        "@odata.type": "microsoft.graph.folder"
      },
      "image": {
        "@odata.type": "microsoft.graph.image"
      },
      "location": {
        "@odata.type": "microsoft.graph.geoCoordinates"
      },
      "media": {
        "@odata.type": "microsoft.graph.media"
      },
      "package": {
        "@odata.type": "microsoft.graph.package"
      },
      "pendingOperations": {
        "@odata.type": "microsoft.graph.pendingOperations"
      },
      "photo": {
        "@odata.type": "microsoft.graph.photo"
      },
      "publication": {
        "@odata.type": "microsoft.graph.publicationFacet"
      },
      "remoteItem": {
        "@odata.type": "microsoft.graph.remoteItem"
      },
      "root": {
        "@odata.type": "microsoft.graph.root"
      },
      "searchResult": {
        "@odata.type": "microsoft.graph.searchResult"
      },
      "shared": {
        "@odata.type": "microsoft.graph.shared"
      },
      "sharepointIds": {
        "@odata.type": "microsoft.graph.sharepointIds"
      },
      "size": "Integer",
      "source": {
        "@odata.type": "microsoft.graph.driveItemSource"
      },
      "specialFolder": {
        "@odata.type": "microsoft.graph.specialFolder"
      },
      "video": {
        "@odata.type": "microsoft.graph.video"
      },
      "webDavUrl": "String"
    }
  ]
}
```

