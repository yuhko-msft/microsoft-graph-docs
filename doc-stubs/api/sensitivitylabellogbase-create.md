---
title: "Create sensitivityLabelLogBase"
description: "Create a new sensitivityLabelLogBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sensitivityLabelLogBase
Namespace: microsoft.graph

Create a new [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object.

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
POST ** Collection URI for microsoft.graph.sensitivityLabelLogBase not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object.

The following table shows the properties that are required when you create the [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|organizationId|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|clientIP|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|application|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|platform|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|deviceName|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|logType|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|operation|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|internalTarget|String|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|extendedProperties|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [auditLogBase](../resources/auditlogbase.md)|
|targetLocation|targetLocation|**TODO: Add Description**. Possible values are: `unknown`, `localMedia`, `removableMedia`, `fileshare`, `cloud`, `unknownFutureValue`.|
|emailInfo|[emailInfo](../resources/emailinfo.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sensitivitylabellogbase_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.sensitivityLabelLogBase not found
Content-Type: application/json
Content-length: 554

{
  "@odata.type": "#microsoft.graph.sensitivityLabelLogBase",
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
  ],
  "targetLocation": "String",
  "emailInfo": {
    "@odata.type": "microsoft.graph.emailInfo"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sensitivityLabelLogBase"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.sensitivityLabelLogBase",
  "id": "d4f1c7d7-c7d7-d4f1-d7c7-f1d4d7c7f1d4",
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
  ],
  "targetLocation": "String",
  "emailInfo": {
    "@odata.type": "microsoft.graph.emailInfo"
  }
}
```

