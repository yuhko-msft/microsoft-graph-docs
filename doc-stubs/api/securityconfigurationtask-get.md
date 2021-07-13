---
title: "Get securityConfigurationTask"
description: "Read the properties and relationships of a securityConfigurationTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get securityConfigurationTask
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [securityConfigurationTask](../resources/securityconfigurationtask.md) object.

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
GET /securityConfigurationTask
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

If successful, this method returns a `200 OK` response code and a [securityConfigurationTask](../resources/securityconfigurationtask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_securityconfigurationtask"
}
-->
``` http
GET https://graph.microsoft.com/beta/securityConfigurationTask
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.securityConfigurationTask"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.securityConfigurationTask",
    "id": "2630a5cd-a5cd-2630-cda5-3026cda53026",
    "assignedTo": "String",
    "category": "String",
    "createdDateTime": "String (timestamp)",
    "creator": "String",
    "creatorNotes": "String",
    "description": "String",
    "displayName": "String",
    "dueDateTime": "String (timestamp)",
    "priority": "String",
    "status": "String",
    "applicablePlatform": "String",
    "endpointSecurityPolicy": "String",
    "endpointSecurityPolicyProfile": "String",
    "insights": "String",
    "intendedSettings": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "managedDeviceCount": "Integer"
  }
}
```

