---
author: JeremyKelley
ms.date: 09/10/2017
title: Upload small files
localization_priority: Priority
ms.prod: "sharepoint"
description: "The simple upload API allows you to provide the contents of a new file or update the contents of an existing file in a single API call. "
doc_type: apiPageType
---
# Upload or replace the contents of a DriveItem

Namespace: microsoft.graph

The simple upload API allows you to provide the contents of a new file or update the contents of an existing file in a single API call. 
This method only supports files up to 4MB in size.

To upload large files see [Upload large files with an upload session](driveitem-createuploadsession.md).

You can also upload a new file to a **Shared with Me** folder. A **Shared with Me** folder is a folder that lives in someone else's drive, but they have granted you with *Can edit* access to it. Depending on the UI it can show up as **Shared with you**, **Shared with me** or **Shared**. For more details see [Shared with me folders](https://support.microsoft.com/en-us/office/see-files-shared-with-you-in-onedrive-2c14e8e6-4e52-4c61-9778-7155d33534a1#ID0EAACAAA=OneDrive_for_work_or_school).


## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | Files.ReadWrite, Files.ReadWrite.All, Sites.ReadWrite.All    |
|Delegated (personal Microsoft account) | Files.ReadWrite, Files.ReadWrite.All    |
|Application | Files.ReadWrite.All, Sites.ReadWrite.All |

## HTTP request
To replace an existing item:
<!-- { "blockType": "ignored" } -->

```http
PUT /drives/{drive-id}/items/{item-id}/content
PUT /groups/{group-id}/drive/items/{item-id}/content
PUT /me/drive/items/{item-id}/content
PUT /sites/{site-id}/drive/items/{item-id}/content
PUT /users/{user-id}/drive/items/{item-id}/content
```

To upload a new file:
<!-- { "blockType": "ignored" } -->

```http
PUT /drives/{drive-id}/items/{parent-id}:/{filename}:/content
PUT /groups/{group-id}/drive/items/{parent-id}:/{filename}:/content
PUT /me/drive/items/{parent-id}:/{filename}:/content
PUT /sites/{site-id}/drive/items/{parent-id}:/{filename}:/content
PUT /users/{user-id}/drive/items/{parent-id}:/{filename}:/content
```

To upload a new file using the parent folder and drive ID's - such as in a **Shared with Me** folder:
<!-- { "blockType": "ignored" } -->

```http
PUT /drives/{drive-id}/items/{item-id}:/{filename}:/content
```
For **Shared with Me** items, the drive-ID and item-ID come from the `remoteItem` facet of the `driveItem` of the folder that is shared with the user.

## Request body

The contents of the request body should be the binary stream of the file to be uploaded.

## Response

If successful, this method returns a [driveItem](../resources/driveitem.md) object in the response body for the newly created or updated file.

## Examples
### Example 1: Upload a new file
#### Request
This example uploads the string "The contents of the file goes here." to a file in the signed-in user's drive under FolderA named FileB.txt.

<!-- { "blockType": "request", "name": "upload-via-put", "scopes": "files.readwrite" } -->

```http
PUT /me/drive/root:/FolderA/FileB.txt:/content
Content-Type: text/plain

The contents of the file goes here.
```

#### Response
If successful, this method returns an [driveItem][item-resource] resource in the response body for the newly created file.

<!-- { "blockType": "response", "@odata.type": "microsoft.graph.driveItem", "truncated": true } -->

```http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "id": "0123456789abc",
  "name": "FileB.txt",
  "size": 35,
  "file": { }
}
```

### Example 2: Updating an existing file
#### Request
This example replaces the contents of a file with a known ID.


# [HTTP](#tab/http)
<!-- { "blockType": "request", "name": "upload-via-put-id", "scopes": "files.readwrite" } -->

```http
PUT /me/drive/items/{item-id}/content
Content-Type: text/plain

The contents of the file goes here.
```
# [C#](#tab/csharp)
[!INCLUDE [sample-code](../includes/snippets/csharp/upload-via-put-id-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [JavaScript](#tab/javascript)
[!INCLUDE [sample-code](../includes/snippets/javascript/upload-via-put-id-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Java](#tab/java)
[!INCLUDE [sample-code](../includes/snippets/java/upload-via-put-id-java-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

---

#### Response

If successful, this method returns an [driveItem][item-resource] resource in the response body for the newly created file.

<!-- { "blockType": "response", "@odata.type": "microsoft.graph.driveItem", "truncated": true } -->

```http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "id": "0123456789abc",
  "name": "FileB.txt",
  "size": 35,
  "file": { }
}
```

### Example 3: Upload to a Shared with Me folder
#### Request
This example uploads a new file to a **Shared with Me** folder.

<!-- { "blockType": "request", "name": "upload-to-SWM-via-put", "scopes": "files.readwrite" } -->

```http
PUT /me/drives/{remoteItem-driveid}/items/{remoteItem-id}:/fileC.txt:/content
Content-Type: text/plain

The contents of the file goes here.
```

#### Response
If successful, this method returns an [driveItem][item-resource] resource in the response body for the newly created file.

<!-- { "blockType": "response", "@odata.type": "microsoft.graph.driveItem", "truncated": true } -->

```http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "id": "017LASDF2A2LKASDFLKJH27ASDF6A23ASD",
  "name": "fileC.txt",
  "size": 35,
  "file": { }
}
```



## Error responses

See [Error Responses][error-response] for details about
how errors are returned.

[error-response]: /graph/errors
[item-resource]: ../resources/driveitem.md

<!-- {
  "type": "#page.annotation",
  "description": "Create a new file with content or update a file's content.",
  "keywords": "insert,upsert,update,upload",
  "section": "documentation",
  "suppressions": [
  ]
} -->

