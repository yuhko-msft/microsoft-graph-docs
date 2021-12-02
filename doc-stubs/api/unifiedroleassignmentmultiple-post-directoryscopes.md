---
title: "Add directoryScopes"
description: "Add directoryScopes by posting to the directoryScopes collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add directoryScopes
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add directoryScopes by posting to the directoryScopes collection.

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
POST /rbacApplicationMultiple/roleAssignments/{unifiedRoleAssignmentMultipleId}/directoryScopes/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [directoryObject](../resources/directoryobject.md) object.

You can specify the following properties when creating a **directoryObject**.

|Property|Type|Description|
|:---|:---|:---|



## Response

If successful, this method returns a `204 No Content` response code and a [directoryObject](../resources/directoryobject.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_directoryobject_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/rbacApplicationMultiple/roleAssignments/{unifiedRoleAssignmentMultipleId}/directoryScopes/$ref
Content-Type: application/json
Content-length: 66

{
  "@odata.type": "#Microsoft.EnterpriseRbac.directoryObject"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.EnterpriseRbac.directoryObject"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#Microsoft.EnterpriseRbac.directoryObject",
  "id": "4f2e55ee-55ee-4f2e-ee55-2e4fee552e4f"
}
```

