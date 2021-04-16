---
title: "Create teamsAppDefinition"
description: "Create a new teamsAppDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamsAppDefinition
Namespace: microsoft.graph



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

The following table shows the properties that are required when you create the [teamsAppDefinition](../resources/teamsappdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowedInstallationScopes|teamsAppInstallationScopes|**TODO: Add Description**. Possible values are: `team`, `groupChat`, `personal`, `unknownFutureValue`.|
|azureADAppId|String|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|publishingState|teamsAppPublishingState|**TODO: Add Description**. Possible values are: `submitted`, `rejected`, `published`, `unknownFutureValue`.|
|requiredResourceSpecificApplicationPermissions|String collection|**TODO: Add Description**|
|serializedInternalDefinition|String|**TODO: Add Description**|
|shortdescription|String|**TODO: Add Description**|
|teamsAppId|String|**TODO: Add Description**|
|version|String|**TODO: Add Description**|



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
POST https://graph.microsoft.com/v1.0/chats/{chatsId}/installedApps/{teamsAppInstallationId}/teamsApp/appDefinitions
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
**Note:** The response object shown here might be shortened for readability.
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
  "id": "52a28bb8-8bb8-52a2-b88b-a252b88ba252",
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

