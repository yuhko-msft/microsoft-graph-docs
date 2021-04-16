---
title: "List clientConfigurations"
description: "Get the officeClientConfiguration resources from the clientConfigurations navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List clientConfigurations
Namespace: microsoft.graph



Get the officeClientConfiguration resources from the clientConfigurations navigation property.

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
GET /officeConfiguration/clientConfigurations
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

If successful, this method returns a `200 OK` response code and a collection of [officeClientConfiguration](../resources/officeclientconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_officeclientconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/officeConfiguration/clientConfigurations
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.officeClientConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.officeClientConfiguration",
      "id": "4de2ae01-ae01-4de2-01ae-e24d01aee24d",
      "checkinStatuses": [
        {
          "@odata.type": "microsoft.graph.officeClientCheckinStatus"
        }
      ],
      "description": "String",
      "displayName": "String",
      "policyPayload": "Stream",
      "priority": "Integer",
      "userCheckinSummary": {
        "@odata.type": "microsoft.graph.officeUserCheckinSummary"
      },
      "userPreferencePayload": "Stream"
    }
  ]
}
```

