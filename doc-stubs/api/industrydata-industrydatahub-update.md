---
title: "Update industryDataHub"
description: "Update the properties of an industryDataHub object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update industryDataHub
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [industryDataHub](../resources/industrydata-industrydatahub.md) object.

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
PATCH /industryData
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md). Optional.|
|identityMatchingSettings|[microsoft.graph.industryData.identityMatchingSettings](../resources/industrydata-identitymatchingsettings.md)|Global settings for matching identities with external systems. Required.|
|statistics|[microsoft.graph.industryData.industryDataHubStatistics](../resources/industrydata-industrydatahubstatistics.md)|The statistics associated with a tenant, such active users, organizations, sections, enrollments etc. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [industryDataHub](../resources/industrydata-industrydatahub.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_industrydatahub"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData
Content-Type: application/json
Content-length: 308

{
  "@odata.type": "#microsoft.graph.industryData.industryDataHub",
  "eTag": "String",
  "identityMatchingSettings": {
    "@odata.type": "microsoft.graph.industryData.identityMatchingSettings"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.industryDataHubStatistics"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.industryData.industryDataHub",
  "eTag": "String",
  "identityMatchingSettings": {
    "@odata.type": "microsoft.graph.industryData.identityMatchingSettings"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.industryDataHubStatistics"
  }
}
```

