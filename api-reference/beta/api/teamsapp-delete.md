---
title: "Permissions"
description: "Remove the app from your organization's app catalog (the tenant app catalog). "
localization_priority: Normal
author: "nkramer"
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Remove an app from your organization's app catalog

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Remove the [app](../resources/teamsapp.md) from your organization's app catalog (the tenant app catalog). 

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](https://developer.microsoft.com/graph/docs/concepts/permissions_reference).

>**Note:** Only global administrators can call this API. 

| Permission Type                        | Permissions (from least to most privileged)|
|:----------------------------------     |:-------------|
| Delegated (work or school account)     | AppCatalog.ReadWrite.All, Directory.ReadWrite.All |
| Delegated (personal Microsoft account) | Not supported|
| Application                            | Not supported. |

## HTTP request
<!-- { "blockType": "ignored" } -->
```http
DELETE /appCatalogs/teamsApps/{id}
```

### Delete a specific version of a submitted app that has not been approved

For apps that have been submitted but not yet approved by the IT admin for inclusion in the app catalog, this API removes the app submission.
>**Note**: If there is only one app definition visible for a specific teamsApp, and if you delete that sole app definition successfully, then you will delete the parent TeamsApp resource as well.

```http
 DELETE appCatalogs/teamsApps/{appId}/appDefinitions/{appDefinitionId}
```

## Request headers

| Header        | Value           |
|:--------------|:--------------  |
| Authorization | Bearer {token}. Required.  |

## Request body

None.

>**Note:** Use the ID returned from the [List published apps](./teamsapp-list.md) call for to reference the app you'd like to update. Do not use the ID from the manifest of the zip app package.

## Response

```
HTTP/1.1 204 No Content
```

## Example

### Request

```http
DELETE https://graph.microsoft.com/beta/appCatalogs/teamsApps/06805b9e-77e3-4b93-ac81-525eb87513b8
```

### Response

```http
HTTP/1.1 204 No Content
```
