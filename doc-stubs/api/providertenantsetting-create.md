---
title: "Create providerTenantSetting"
description: "Create a new providerTenantSetting object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create providerTenantSetting
Namespace: microsoft.graph



Create a new [providerTenantSetting](../resources/providertenantsetting.md) object.

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
POST /security/providerTenantSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [providerTenantSetting](../resources/providertenantsetting.md) object.

The following table shows the properties that are required when you create the [providerTenantSetting](../resources/providertenantsetting.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|azureTenantId|String|**TODO: Add Description**|
|enabled|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|provider|String|**TODO: Add Description**|
|vendor|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [providerTenantSetting](../resources/providertenantsetting.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_providertenantsetting_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/security/providerTenantSettings
Content-Type: application/json
Content-length: 166

{
  "@odata.type": "#microsoft.graph.providerTenantSetting",
  "azureTenantId": "String",
  "enabled": "Boolean",
  "provider": "String",
  "vendor": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.providerTenantSetting"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.providerTenantSetting",
  "id": "094a83dd-83dd-094a-dd83-4a09dd834a09",
  "azureTenantId": "String",
  "enabled": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "provider": "String",
  "vendor": "String"
}
```

