---
title: "Create androidForWorkAppConfigurationSchema"
description: "Create a new androidForWorkAppConfigurationSchema object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidForWorkAppConfigurationSchema
Namespace: microsoft.graph



Create a new androidForWorkAppConfigurationSchema object.

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
POST /deviceManagement/androidForWorkAppConfigurationSchemas
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidForWorkAppConfigurationSchema](../resources/androidforworkappconfigurationschema.md) object.

The following table shows the properties that are required when you create the [androidForWorkAppConfigurationSchema](../resources/androidforworkappconfigurationschema.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|exampleJson|Binary|UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app|
|schemaItems|[androidForWorkAppConfigurationSchemaItem](../resources/androidforworkappconfigurationschemaitem.md) collection|Collection of items each representing a named configuration option in the schema|



## Response

If successful, this method returns a `201 Created` response code and an [androidForWorkAppConfigurationSchema](../resources/androidforworkappconfigurationschema.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidforworkappconfigurationschema_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/androidForWorkAppConfigurationSchemas
Content-Type: application/json
Content-length: 227

{
  "@odata.type": "#microsoft.graph.androidForWorkAppConfigurationSchema",
  "exampleJson": "Binary",
  "schemaItems": [
    {
      "@odata.type": "microsoft.graph.androidForWorkAppConfigurationSchemaItem"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidForWorkAppConfigurationSchema"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidForWorkAppConfigurationSchema",
  "id": "dc6d2f44-2f44-dc6d-442f-6ddc442f6ddc",
  "exampleJson": "Binary",
  "schemaItems": [
    {
      "@odata.type": "microsoft.graph.androidForWorkAppConfigurationSchemaItem"
    }
  ]
}
```

