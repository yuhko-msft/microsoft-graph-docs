---
title: "Update sensitivityLabelPolicyMatchLog"
description: "Update the properties of a sensitivityLabelPolicyMatchLog object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sensitivityLabelPolicyMatchLog
Namespace: microsoft.graph

Update the properties of a [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) object.

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
PATCH /auditLogs/sensitivityLabelPolicyMatchLogs/{sensitivityLabelPolicyMatchLogId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) object.

The following table shows the properties that are required when you update the [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md).

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
|policyId|Guid|**TODO: Add Description**|
|labelId|Guid|**TODO: Add Description**|
|currentLabelId|Guid|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [sensitivityLabelPolicyMatchLog](../resources/sensitivitylabelpolicymatchlog.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sensitivitylabelpolicymatchlog"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/auditLogs/sensitivityLabelPolicyMatchLogs/{sensitivityLabelPolicyMatchLogId}
Content-Type: application/json
Content-length: 635

{
  "@odata.type": "#microsoft.graph.sensitivityLabelPolicyMatchLog",
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
  "policyId": "Guid",
  "labelId": "Guid",
  "currentLabelId": "Guid"
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
  "@odata.type": "#microsoft.graph.sensitivityLabelPolicyMatchLog",
  "id": "eab4d398-d398-eab4-98d3-b4ea98d3b4ea",
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
  "policyId": "Guid",
  "labelId": "Guid",
  "currentLabelId": "Guid"
}
```

