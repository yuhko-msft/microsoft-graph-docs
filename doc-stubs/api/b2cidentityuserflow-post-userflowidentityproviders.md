---
title: "Add identityProviderBase"
description: "Add userFlowIdentityProviders by posting to the userFlowIdentityProviders collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add identityProviderBase
Namespace: microsoft.graph



Add userFlowIdentityProviders by posting to the userFlowIdentityProviders collection.

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
POST /identity/b2cUserFlows/{b2cIdentityUserFlowId}/userFlowIdentityProviders/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [identityProviderBase](../resources/identityproviderbase.md) object.

The following table shows the properties that are required when you create the [identityProviderBase](../resources/identityproviderbase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and an [identityProviderBase](../resources/identityproviderbase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_identityproviderbase_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identity/b2cUserFlows/{b2cIdentityUserFlowId}/userFlowIdentityProviders/$ref
Content-Type: application/json
Content-length: 90

{
  "@odata.type": "#microsoft.graph.identityProviderBase",
  "displayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.identityProviderBase"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.identityProviderBase",
  "id": "86aec773-c773-86ae-73c7-ae8673c7ae86",
  "displayName": "String"
}
```

