---
title: "Update userFlowLanguagePage"
description: "Update the properties of a userFlowLanguagePage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userFlowLanguagePage
Namespace: microsoft.graph



Update the properties of a [userFlowLanguagePage](../resources/userflowlanguagepage.md) object.

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
PATCH /identity/b2xUserFlows/{b2xIdentityUserFlowId}/languages/{userFlowLanguageConfigurationId}/defaultPages/{userFlowLanguagePageId}
PATCH /identity/b2xUserFlows/{b2xIdentityUserFlowId}/languages/{userFlowLanguageConfigurationId}/overridesPages/{userFlowLanguagePageId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userFlowLanguagePage](../resources/userflowlanguagepage.md) object.

The following table shows the properties that are required when you update the [userFlowLanguagePage](../resources/userflowlanguagepage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [userFlowLanguagePage](../resources/userflowlanguagepage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userflowlanguagepage"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identity/b2xUserFlows/{b2xIdentityUserFlowId}/languages/{userFlowLanguageConfigurationId}/defaultPages/{userFlowLanguagePageId}
Content-Type: application/json
Content-length: 62

{
  "@odata.type": "#microsoft.graph.userFlowLanguagePage"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userFlowLanguagePage",
  "id": "cc669424-9424-cc66-2494-66cc249466cc"
}
```

