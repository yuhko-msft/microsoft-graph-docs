---
title: "List remoteActionAudits"
description: "Get the remoteActionAudit resources from the remoteActionAudits navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List remoteActionAudits
Namespace: microsoft.graph



Get the remoteActionAudit resources from the remoteActionAudits navigation property.

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
GET /deviceManagement/remoteActionAudits
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [remoteActionAudit](../resources/remoteactionaudit.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_remoteactionaudit"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/remoteActionAudits
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.remoteActionAudit)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.remoteActionAudit",
      "id": "edb08c97-8c97-edb0-978c-b0ed978cb0ed",
      "action": "String",
      "actionState": "String",
      "deviceDisplayName": "String",
      "deviceIMEI": "String",
      "deviceOwnerUserPrincipalName": "String",
      "initiatedByUserPrincipalName": "String",
      "managedDeviceId": "String",
      "requestDateTime": "String (timestamp)",
      "userName": "String"
    }
  ]
}
```

