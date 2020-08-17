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

Read the properties and relationships of a [securityConfigurationTask](../resources/securityconfigurationtask.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
**Note:** The response object shown here might be shortened for readability.
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
    "id": "82e24c66-4c66-82e2-664c-e282664ce282",
    "displayName": "String",
    "description": "String",
    "createdDateTime": "String (timestamp)",
    "dueDateTime": "String (timestamp)",
    "category": "String",
    "priority": "String",
    "creator": "String",
    "creatorNotes": "String",
    "assignedTo": "String",
    "status": "String",
    "endpointSecurityPolicy": "String",
    "applicablePlatform": "String",
    "endpointSecurityPolicyProfile": "String",
    "insights": "String",
    "managedDeviceCount": "Integer",
    "intendedSettings": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ]
  }
}
```

