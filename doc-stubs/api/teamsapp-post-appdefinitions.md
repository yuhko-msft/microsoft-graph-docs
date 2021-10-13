---
title: "Create teamsAppDefinition"
description: "Create a new teamsAppDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamsAppDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [teamsAppDefinition](../resources/teamsappdefinition.md) object.

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
POST /chats/{chatsId}/installedApps/{teamsAppInstallationId}/teamsApp/appDefinitions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsAppDefinition](../resources/teamsappdefinition.md) object.

You can specify the following properties when creating a **teamsAppDefinition**.

|Property|Type|Description|
|:---|:---|:---|
|allowedInstallationScopes|teamsAppInstallationScopes|**TODO: Add Description**. The possible values are: `team`, `groupChat`, `personal`, `unknownFutureValue`. Optional.|
|azureADAppId|String|**TODO: Add Description** Optional.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|publishingState|teamsAppPublishingState|**TODO: Add Description**. The possible values are: `submitted`, `rejected`, `published`, `unknownFutureValue`. Optional.|
|requiredResourceSpecificApplicationPermissions|String collection|**TODO: Add Description** Optional.|
|serializedInternalDefinition|String|**TODO: Add Description** Optional.|
|shortdescription|String|**TODO: Add Description** Optional.|
|teamsAppId|String|**TODO: Add Description** Optional.|
|version|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [teamsAppDefinition](../resources/teamsappdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamsappdefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/chats/{chatsId}/installedApps/{teamsAppInstallationId}/teamsApp/appDefinitions
Content-Type: application/json
Content-length: 497

{
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "allowedInstallationScopes": "String",
  "azureADAppId": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "description": "String",
  "displayName": "String",
  "publishingState": "String",
  "requiredResourceSpecificApplicationPermissions": [
    "String"
  ],
  "serializedInternalDefinition": "String",
  "shortdescription": "String",
  "teamsAppId": "String",
  "version": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.teamsAppDefinition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "id": "ff38e9c5-e9c5-ff38-c5e9-38ffc5e938ff",
  "allowedInstallationScopes": "String",
  "azureADAppId": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "publishingState": "String",
  "requiredResourceSpecificApplicationPermissions": [
    "String"
  ],
  "serializedInternalDefinition": "String",
  "shortdescription": "String",
  "teamsAppId": "String",
  "version": "String"
}
```

