---
author: SanjoyanM
title: Get the sensitivity label attached to a file
localization_priority: medium
ms.prod: "sharepoint"
description: "Get the sensitivity label attached to a file."
doc_type: apiPageType
---
# Get sensitivity label metadata for a DriveItem resource

Namespace: microsoft.graph

Retrieve the sensitivity label metadata for a [driveItem](../resources/driveitem.md) in a [drive](../resources/drive.md) by file system path or ID.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | Files.Read, Files.ReadWrite, Files.Read.All, Files.ReadWrite.All, Sites.Read.All, Sites.ReadWrite.All    |
|Delegated (personal Microsoft account) | Files.Read, Files.ReadWrite, Files.Read.All, Files.ReadWrite.All    |
|Application | Files.Read.All, Files.ReadWrite.All, Sites.Read.All, Sites.ReadWrite.All |

## HTTP request

<!-- { "blockType": "ignored" } -->

```http
GET /drives/{drive-id}/items/{item-id}?$select=sensitivitylabel
GET /drives/{drive-id}/root:/{item-path}?$select=sensitivitylabel
GET /groups/{group-id}/drive/items/{item-id}?$select=sensitivitylabel
GET /groups/{group-id}/drive/root:/{item-path}?$select=sensitivitylabel
GET /me/drive/items/{item-id}?$select=sensitivitylabel
GET /me/drive/root:/{item-path}?$select=sensitivitylabel
GET /sites/{site-id}/drive/items/{item-id}?$select=sensitivitylabel
GET /sites/{site-id}/drive/root:/{item-path}?$select=sensitivitylabel
GET /sites/{site-id}/lists/{list-id}/items/{item-id}/driveItem?$select=sensitivitylabel
GET /users/{user-id}/drive/items/{item-id}?$select=sensitivitylabel
GET /users/{user-id}/drive/root:/{item-path}?$select=sensitivitylabel
```

## Optional query parameters

This method supports the `$expand` and `$select` [OData query parameters](/graph/query-parameters) to customize the response.

You can use the [`$expand` query string parameter](/graph/query-parameters) to include the children of an item in the same call as retrieving the metadata of an item if the item has a **children** relationship.

## Response

If successful, this method returns a `200 OK` response code and the [SensitivityLabel](../resources/sensitivitylabel.md) resource in the response body.

## Example

### Request

Here is an example of the request to the root folder of the user's OneDrive.


# [HTTP](#tab/http)
<!-- { "blockType": "request", "name": "get-drive-item-sensitivity-label", "tags": "service.graph" }-->

```msgraph-interactive
GET /me/drive/items/01FDOCTF6NRS4HZTEUZFD2PSD57WXQSWOC?$select=sensitivitylabel
```
---


### Response

Here is an example of the response.

<!-- { "blockType": "response", "truncated": true, "@odata.type": "microsoft.graph.filesensitivitylabel" } -->

```http
HTTP/1.1 200 OK
Content-type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#users('e4d9dd7d-339e-46b9-8c2d-3fadefcbcb78')/drive/items(sensitivitylabel)/$entity",
    "@odata.etag": "\"{7CB88CCD-94CC-47C9-A7C8-7DFDAF0959C2},10\"",
    "sensitivityLabel": {
        "displayName": "Public",
        "id": "87867195-f2b8-4ac2-b0b6-6bb73cb33afc",
        "protectionEnabled": false
    }
}
```


