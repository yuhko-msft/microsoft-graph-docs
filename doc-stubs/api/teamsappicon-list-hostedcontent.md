---
title: "List teamworkHostedContent"
description: "Get the teamworkHostedContent resources from the hostedContent navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List teamworkHostedContent
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the teamworkHostedContent resources from the hostedContent navigation property.

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
GET /users/{usersId}/teamwork/installedApps/{userScopeTeamsAppInstallationId}/teamsApp/appDefinitions/{teamsAppDefinitionId}/colorIcon/hostedContent
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

If successful, this method returns a `200 OK` response code and a collection of [teamworkHostedContent](../resources/teamworkhostedcontent.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_teamworkhostedcontent"
}
-->
``` http
GET https://graph.microsoft.com/beta/users/{usersId}/teamwork/installedApps/{userScopeTeamsAppInstallationId}/teamsApp/appDefinitions/{teamsAppDefinitionId}/colorIcon/hostedContent
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.teamworkHostedContent)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.teamworkHostedContent",
      "id": "42fdfa1b-fa1b-42fd-1bfa-fd421bfafd42",
      "contentBytes": "Binary",
      "contentType": "String"
    }
  ]
}
```

