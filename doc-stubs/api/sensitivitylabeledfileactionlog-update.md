---
title: "Update sensitivityLabeledFileActionLog"
description: "Update the properties of a sensitivityLabeledFileActionLog object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sensitivityLabeledFileActionLog
Namespace: microsoft.graph

Update the properties of a [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) object.

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
PATCH /auditLogs/sensitivityLabeledFileActionLogs/{sensitivityLabeledFileActionLogId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) object.

The following table shows the properties that are required when you update the [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md).

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
|targetLocation|targetLocation|**TODO: Add Description** Inherited from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md). Possible values are: `unknown`, `localMedia`, `removableMedia`, `fileshare`, `cloud`, `unknownFutureValue`.|
|emailInfo|[emailInfo](../resources/emailinfo.md)|**TODO: Add Description** Inherited from [sensitivityLabelLogBase](../resources/sensitivitylabellogbase.md)|
|labelId|Guid|**TODO: Add Description**|
|previousTarget|String|**TODO: Add Description**|
|irmContentId|Guid|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [sensitivityLabeledFileActionLog](../resources/sensitivitylabeledfileactionlog.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sensitivitylabeledfileactionlog"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/auditLogs/sensitivityLabeledFileActionLogs/{sensitivityLabeledFileActionLogId}
Content-Type: application/json
Content-length: 642

{
  "@odata.type": "#microsoft.graph.sensitivityLabeledFileActionLog",
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
  },
  "labelId": "Guid",
  "previousTarget": "String",
  "irmContentId": "Guid"
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
  "@odata.type": "#microsoft.graph.sensitivityLabeledFileActionLog",
  "id": "f78be88b-e88b-f78b-8be8-8bf78be88bf7",
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
  },
  "labelId": "Guid",
  "previousTarget": "String",
  "irmContentId": "Guid"
}
```

