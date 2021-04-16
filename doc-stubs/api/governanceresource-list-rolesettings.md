---
title: "List roleSettings"
description: "Get the governanceRoleSetting resources from the roleSettings navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List roleSettings
Namespace: microsoft.graph



Get the governanceRoleSetting resources from the roleSettings navigation property.

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
GET /governanceResources/{governanceResourcesId}/roleSettings
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

If successful, this method returns a `200 OK` response code and a collection of [governanceRoleSetting](../resources/governancerolesetting.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_governancerolesetting"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/governanceResources/{governanceResourcesId}/roleSettings
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.governanceRoleSetting)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.governanceRoleSetting",
      "id": "654094d7-94d7-6540-d794-4065d7944065",
      "adminEligibleSettings": [
        {
          "@odata.type": "microsoft.graph.governanceRuleSetting"
        }
      ],
      "adminMemberSettings": [
        {
          "@odata.type": "microsoft.graph.governanceRuleSetting"
        }
      ],
      "isDefault": "Boolean",
      "lastUpdatedBy": "String",
      "lastUpdatedDateTime": "String (timestamp)",
      "resourceId": "String",
      "roleDefinitionId": "String",
      "userEligibleSettings": [
        {
          "@odata.type": "microsoft.graph.governanceRuleSetting"
        }
      ],
      "userMemberSettings": [
        {
          "@odata.type": "microsoft.graph.governanceRuleSetting"
        }
      ]
    }
  ]
}
```

