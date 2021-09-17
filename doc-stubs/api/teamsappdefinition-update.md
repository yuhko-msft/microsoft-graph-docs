---
title: "Update teamsAppDefinition"
description: "Update the properties of a teamsAppDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update teamsAppDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [teamsAppDefinition](../resources/teamsappdefinition.md) object.

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
PATCH /chats/{chatsId}/installedApps/{teamsAppInstallationId}/teamsAppDefinition
PATCH /chats/{chatsId}/installedApps/{teamsAppInstallationId}/teamsApp/appDefinitions/{teamsAppDefinitionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]
In the request body, supply a JSON representation of the [teamsAppDefinition](../resources/teamsappdefinition.md) object.


|Property|Type|Description|
|:---|:---|:---|
|teamsAppId|String|**TODO: Add Description** Optional.|
|azureADAppId|String|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Optional.|
|version|String|**TODO: Add Description** Optional.|
|requiredResourceSpecificApplicationPermissions|String collection|**TODO: Add Description** Optional.|
|publishingState|teamsAppPublishingState|**TODO: Add Description**. The possible values are: `submitted`, `rejected`, `published`, `unknownFutureValue`. Optional.|
|shortdescription|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdBy|[Microsoft.Teams.GraphSvc.identitySet](../resources/identityset.md)|**TODO: Add Description** Optional.|
|allowedInstallationScopes|teamsAppInstallationScopes|**TODO: Add Description**. The possible values are: `team`, `groupChat`, `personal`, `unknownFutureValue`. Optional.|
|serializedInternalDefinition|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [teamsAppDefinition](../resources/teamsappdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_teamsappdefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/chats/{chatsId}/installedApps/{teamsAppInstallationId}/teamsAppDefinition
Content-Type: application/json
Content-length: 497

{
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "teamsAppId": "String",
  "azureADAppId": "String",
  "displayName": "String",
  "version": "String",
  "requiredResourceSpecificApplicationPermissions": [
    "String"
  ],
  "publishingState": "String",
  "shortdescription": "String",
  "description": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "allowedInstallationScopes": "String",
  "serializedInternalDefinition": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "id": "addb8c8b-8c8b-addb-8b8c-dbad8b8cdbad",
  "teamsAppId": "String",
  "azureADAppId": "String",
  "displayName": "String",
  "version": "String",
  "requiredResourceSpecificApplicationPermissions": [
    "String"
  ],
  "publishingState": "String",
  "shortdescription": "String",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "allowedInstallationScopes": "String",
  "serializedInternalDefinition": "String"
}
```

