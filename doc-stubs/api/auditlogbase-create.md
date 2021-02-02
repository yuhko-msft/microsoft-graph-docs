---
title: "Create auditLogBase"
description: "Create a new auditLogBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create auditLogBase
Namespace: microsoft.graph

Create a new [auditLogBase](../resources/auditlogbase.md) object.

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
POST ** Collection URI for microsoft.graph.auditLogBase not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [auditLogBase](../resources/auditlogbase.md) object.

The following table shows the properties that are required when you create the [auditLogBase](../resources/auditlogbase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userId|String|**TODO: Add Description**|
|organizationId|String|**TODO: Add Description**|
|operationDateTime|DateTimeOffset|**TODO: Add Description**|
|clientIP|String|**TODO: Add Description**|
|application|String|**TODO: Add Description**|
|platform|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|logType|String|**TODO: Add Description**|
|operation|String|**TODO: Add Description**|
|internalTarget|String|**TODO: Add Description**|
|extendedProperties|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [auditLogBase](../resources/auditlogbase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_auditlogbase_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.auditLogBase not found
Content-Type: application/json
Content-length: 440

{
  "@odata.type": "#microsoft.graph.auditLogBase",
  "userId": "String",
  "organizationId": "String",
  "operationDateTime": "String (timestamp)",
  "clientIP": "String",
  "application": "String",
  "platform": "String",
  "deviceName": "String",
  "logType": "String",
  "operation": "String",
  "internalTarget": "String",
  "extendedProperties": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.auditLogBase"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.auditLogBase",
  "id": "22ccbe4d-be4d-22cc-4dbe-cc224dbecc22",
  "userId": "String",
  "organizationId": "String",
  "operationDateTime": "String (timestamp)",
  "clientIP": "String",
  "application": "String",
  "platform": "String",
  "deviceName": "String",
  "logType": "String",
  "operation": "String",
  "internalTarget": "String",
  "extendedProperties": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

