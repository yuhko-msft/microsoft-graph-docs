---
title: "List deviceManagementAbstractComplexSettingInstances"
description: "Get a list of the deviceManagementAbstractComplexSettingInstance objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceManagementAbstractComplexSettingInstances
Namespace: microsoft.graph



Get a list of the [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.deviceManagementAbstractComplexSettingInstance not found
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

If successful, this method returns a `200 OK` response code and a collection of [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicemanagementabstractcomplexsettinginstance"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceManagementAbstractComplexSettingInstance not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementAbstractComplexSettingInstance)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceManagementAbstractComplexSettingInstance",
      "id": "6a59b6a1-b6a1-6a59-a1b6-596aa1b6596a",
      "definitionId": "String",
      "valueJson": "String",
      "implementationId": "String"
    }
  ]
}
```

