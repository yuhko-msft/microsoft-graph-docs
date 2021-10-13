---
title: "Create teamsApp"
description: "Create a new teamsApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamsApp
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new teamsApp object.

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
POST /appCatalogs/teamsApps
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsApp](../resources/teamsapp.md) object.

You can specify the following properties when creating a **teamsApp**.

|Property|Type|Description|
|:---|:---|:---|
|externalId|String|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Optional.|
|distributionMethod|teamsAppDistributionMethod|**TODO: Add Description**. The possible values are: `store`, `organization`, `sideloaded`, `unknownFutureValue`. Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [teamsApp](../resources/teamsapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamsapp_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/appCatalogs/teamsApps
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsApp",
  "externalId": "String",
  "displayName": "String",
  "distributionMethod": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamsApp"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsApp",
  "id": "857237d7-37d7-8572-d737-7285d7377285",
  "externalId": "String",
  "displayName": "String",
  "distributionMethod": "String"
}
```

