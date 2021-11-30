---
title: "Add sourceSystemDefinition"
description: "Add sourceSystem by posting to the sourceSystem collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add sourceSystemDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add sourceSystem by posting to the sourceSystem collection.

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
POST /industryData/dataConnectors/{dataConnectorId}/sourceSystem/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sourceSystemDefinition](../resources/sourcesystemdefinition.md) object.

You can specify the following properties when creating a **sourceSystemDefinition**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|Name of the source system. Required.|
|vendor|String|Name of the vendor who supplies the source system. Optional.|
|directoryUserMatchingSettings|[microsoft.industryData.directoryUserMatchingSettings](../resources/directoryusermatchingsettings.md) collection|Settings for matching the user data from the source system with user data in Azure Active Directory. Required.|



## Response

If successful, this method returns a `204 No Content` response code and a [sourceSystemDefinition](../resources/sourcesystemdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sourcesystemdefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/dataConnectors/{dataConnectorId}/sourceSystem/$ref
Content-Type: application/json
Content-length: 271

{
  "@odata.type": "#microsoft.industryData.sourceSystemDefinition",
  "eTag": "String",
  "displayName": "String",
  "vendor": "String",
  "directoryUserMatchingSettings": [
    {
      "@odata.type": "microsoft.graph.directoryUserMatchingSettings"
    }
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.sourceSystemDefinition"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.sourceSystemDefinition",
  "eTag": "String",
  "displayName": "String",
  "vendor": "String",
  "directoryUserMatchingSettings": [
    {
      "@odata.type": "microsoft.graph.directoryUserMatchingSettings"
    }
  ]
}
```

