---
title: "Update androidManagedStoreAppConfigurationSchema"
description: "Update the properties of an androidManagedStoreAppConfigurationSchema object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidManagedStoreAppConfigurationSchema
Namespace: microsoft.graph



Update the properties of an [androidManagedStoreAppConfigurationSchema](../resources/androidmanagedstoreappconfigurationschema.md) object.

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
PATCH /deviceManagement/androidManagedStoreAppConfigurationSchemas/{androidManagedStoreAppConfigurationSchemaId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidManagedStoreAppConfigurationSchema](../resources/androidmanagedstoreappconfigurationschema.md) object.

The following table shows the properties that are required when you update the [androidManagedStoreAppConfigurationSchema](../resources/androidmanagedstoreappconfigurationschema.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|exampleJson|Binary|UTF8 encoded byte array containing example JSON string conforming to this schema that demonstrates how to set the configuration for this app|
|nestedSchemaItems|[androidManagedStoreAppConfigurationSchemaItem](../resources/androidmanagedstoreappconfigurationschemaitem.md) collection|Collection of items each representing a named configuration option in the schema. It contains a flat list of all configuration.|
|schemaItems|[androidManagedStoreAppConfigurationSchemaItem](../resources/androidmanagedstoreappconfigurationschemaitem.md) collection|Collection of items each representing a named configuration option in the schema. It only contains the root-level configuration.|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidManagedStoreAppConfigurationSchema](../resources/androidmanagedstoreappconfigurationschema.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androidmanagedstoreappconfigurationschema"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/androidManagedStoreAppConfigurationSchemas/{androidManagedStoreAppConfigurationSchemaId}
Content-Type: application/json
Content-length: 369

{
  "@odata.type": "#microsoft.graph.androidManagedStoreAppConfigurationSchema",
  "exampleJson": "Binary",
  "nestedSchemaItems": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppConfigurationSchemaItem"
    }
  ],
  "schemaItems": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppConfigurationSchemaItem"
    }
  ]
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
  "@odata.type": "#microsoft.graph.androidManagedStoreAppConfigurationSchema",
  "id": "9f9d9736-9736-9f9d-3697-9d9f36979d9f",
  "exampleJson": "Binary",
  "nestedSchemaItems": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppConfigurationSchemaItem"
    }
  ],
  "schemaItems": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppConfigurationSchemaItem"
    }
  ]
}
```

